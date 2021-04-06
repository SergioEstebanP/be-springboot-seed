package com.springboot.apirest.models.services;

import java.util.List;

import com.springboot.apirest.models.dao.IClientDao;
import com.springboot.apirest.models.entity.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private IClientDao clientDao;

    @Override
    @Transactional(readOnly = true) // we can avoid this because also dao actions are also transactions
    public List<Client> findAll() {
        return (List<Client>) clientDao.findAll();
    }

    @Override
    @Transactional
    public Client save(Client client) {
        return clientDao.save(client);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        clientDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Client findById(Long id) {
        // return and optional, we can handle some parameters like is present or so on
        // .get - .getOrElse etc
        return clientDao.findById(id).orElse(null);
    }

}