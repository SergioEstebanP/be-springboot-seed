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
            response.put("message", "Error while accessing to database: " + exception.toString());
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
    @ResponseStatus(HttpStatus.CREATED) // default is 200, changed to 201
    public Client create(@RequestBody Client client) {
        return clientService.save(client);
    }

    // DELETE by ID HARD DELETE -- removes from DB
    @DeleteMapping("/clients/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        clientService.delete(id);
    }

    // PUT by ID
    @PutMapping("/clients/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Client update(@RequestBody Client client, @PathVariable Long id) {
        Client currentClient = clientService.findById(id);
        currentClient.setName(client.getName());
        currentClient.setSurname(client.getSurname());
        currentClient.setEmail(client.getEmail());
        return clientService.save(currentClient);
    }

}
