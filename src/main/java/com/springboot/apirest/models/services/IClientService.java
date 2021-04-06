package com.springboot.apirest.models.services;

import java.util.List;

import com.springboot.apirest.models.entity.Client;

// here we can implement the CRUD contract for our identity
public interface IClientService {

  public List<Client> findAll();

  public Client save(Client client);
  public Client findById(Long id);
  public void delete(Long id);
  
}
