package com.springboot.apirest.models.dao;

import com.springboot.apirest.models.entity.Client;
import com.springboot.apirest.models.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IClientDao extends JpaRepository<Client, Long> {
    // we should create a different dao, and also if we should have a CRUD for regions then we should separate it

    @Query("from Region") // name in class entity, working with objects no tables
    List<Region> findAllRegions();
}
