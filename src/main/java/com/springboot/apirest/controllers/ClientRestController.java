package com.springboot.apirest.controllers;

import com.springboot.apirest.models.entity.Client;
import com.springboot.apirest.models.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClientRestController {

    @Autowired
    private IClientService clientService;

    // GET ALL
    @GetMapping("/clients")
    public List<Client> index() {
        return clientService.findAll();
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
    public ResponseEntity<?> create(@RequestBody Client client) {
        Client newClient;
        Map<String, Object> response = new HashMap<>();
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
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        clientService.delete(id);
    }

    // PUT by ID
    @PutMapping("/clients/{id}")
    public ResponseEntity<?> update(@RequestBody Client client, @PathVariable Long id) {
        Client currentClient;
        Client updatedClient;
        Map<String, Object> response = new HashMap<>();
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

}
