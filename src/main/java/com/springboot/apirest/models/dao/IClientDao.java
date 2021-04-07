package com.springboot.apirest.models.dao;

import com.springboot.apirest.models.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientDao extends JpaRepository<Client, Long> {

}
