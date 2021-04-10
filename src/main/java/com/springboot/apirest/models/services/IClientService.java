package com.springboot.apirest.models.services;

import java.util.List;

import com.springboot.apirest.models.entity.Client;
import com.springboot.apirest.models.entity.Region;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

// here we can implement the CRUD contract for our identity
public interface IClientService {
  List<Client> findAll();
  Page<Client> findAll(Pageable pageable);
  Client save(Client client);
  Client findById(Long id);
  void delete(Long id);
  List<Region> findAllRegions();
}
