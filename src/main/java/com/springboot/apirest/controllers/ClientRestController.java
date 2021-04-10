package com.springboot.apirest.controllers;

import com.springboot.apirest.models.entity.Client;
import com.springboot.apirest.models.entity.Region;
import com.springboot.apirest.models.services.IClientService;
import com.springboot.apirest.models.services.IFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClientRestController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IClientService clientService;

    @Autowired
    private IFileService fileService;

    // GET ALL
    @GetMapping("/clients")
    public List<Client> index() {
        return clientService.findAll();
    }

    // GET ALL WITH PAGINATION
    @GetMapping("/clients/page/{page}")
    public Page<Client> index(@PathVariable Integer page) {
        return clientService.findAll(PageRequest.of(page, 10));
    }

    // GET by ID
    @GetMapping("/clients/{id}")
    public ResponseEntity<?> show(@PathVariable Long id) {
        Client client;
        Map<String, Object> response = new HashMap<>();
        try {
            client = clientService.findById(id);
        } catch (DataAccessException exception) {
            response.put("message", "Error while accessing to database");
            response.put("exception", exception.toString());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        if (client == null) {
            response.put("message", "Client id " + id + " doesn't exist");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(client, HttpStatus.OK);
        }
    }

    // POST
    @PostMapping("/clients")
    // @ResponseStatus(HttpStatus.CREATED) // default is 200, changed to 201
    public ResponseEntity<?> create(@Valid @RequestBody Client client, BindingResult result) {
        Client newClient;
        Map<String, Object> response = new HashMap<>();

        // Validation at data format level
        if (result.hasErrors()) {

            List<String> errors = result.getFieldErrors()
                    .stream()
                    .map(fieldError -> {
                        return "Field: " + fieldError.getField() + " " + fieldError.getDefaultMessage();
                    })
                    .collect(Collectors.toList());

            response.put("errors", errors);
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
        // validation at backend level
        try {
            newClient = clientService.save(client);
        } catch (DataAccessException exception) {
            response.put("message", "Not possible to insert the client " + client.getEmail());
            response.put("exception", exception.toString());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("message", "Client created successfully");
        response.put("data", newClient);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    // DELETE by ID HARD DELETE -- removes from DB
    @DeleteMapping("/clients/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Map<String, Object> response = new HashMap<>();
        try {
            // we also have to delete all the data from the client, as the picture
            Client client = clientService.findById(id);
            String oldFileName = client.getPicture();
            fileService.delete(oldFileName);
            // then we delete the client
            clientService.delete(id);
        } catch (DataAccessException exception) {
            response.put("message", "Error deleting the client " + id);
            response.put("exception", exception.toString());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
    }

    // PUT by ID
    @PutMapping("/clients/{id}")
    public ResponseEntity<?> update(@Valid @RequestBody Client client, BindingResult result, @PathVariable Long id) {
        Client currentClient;
        Client updatedClient;
        Map<String, Object> response = new HashMap<>();

        // validation at data level bad requests, we can avoid some of this validation if we can do it in FE
        if (result.hasErrors()) {
            List<String> errors = result.getFieldErrors()
                    .stream()
                    .map(fieldError -> "Field: " + fieldError.getField() + " " + fieldError.getDefaultMessage())
                    .collect(Collectors.toList());
            response.put("errors", errors);
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }

        // validation for get the user in DB
        try {
            currentClient = clientService.findById(id);
        } catch (DataAccessException exception) {
            response.put("message", "Error getting the user to update");
            response.put("exception", exception.toString());
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        currentClient.setName(client.getName());
        currentClient.setSurname(client.getSurname());
        currentClient.setEmail(client.getEmail());
        currentClient.setNextView(client.getNextView());
        currentClient.setRegion(client.getRegion());

        try {
            updatedClient = clientService.save(currentClient);
        } catch (DataAccessException exception) {
            response.put("message", "Error saving the new user");
            response.put("exception", exception.toString());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        response.put("message", "Client updated successfully");
        response.put("data", updatedClient);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/clients/upload")
    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file, @RequestParam("id") Long id) {
        Map<String, Object> response = new HashMap<>();
        Client client = clientService.findById(id);
        String fileName = "";
        if (!file.isEmpty()) {
            try {
                fileName = fileService.copy(file);
            } catch (IOException e) {
                response.put("message", "Error uploading the image for client: " + id);
                response.put("error", e.toString());
            }
            String oldFileName = client.getPicture();
            fileService.delete(oldFileName);

            client.setPicture(fileName);
            clientService.save(client);
            response.put("client", client);
            response.put("message", "Picture uploaded successfully");
        } else {
            response.put("message", "Error uploading the image");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/img/{filename:.+}")
    public ResponseEntity<Resource> getPicture(@PathVariable String filename) {
        Resource resource = null;
        try {
            resource = fileService.load(filename);
        } catch (MalformedURLException e) {
            LoggerFactory.getLogger(this.getClass()).error(e.toString());
        }
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"");
        return new ResponseEntity<>(resource, headers, HttpStatus.OK);
    }


    @GetMapping("/clients/regions")
    public List<Region> getRegions() {
        return clientService.findAllRegions();
    }
}
