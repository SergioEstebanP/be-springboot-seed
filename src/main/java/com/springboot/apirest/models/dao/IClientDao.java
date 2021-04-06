package com.springboot.apirest.models.dao;

import com.springboot.apirest.models.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface IClientDao extends CrudRepository<Client, Long> {

}
