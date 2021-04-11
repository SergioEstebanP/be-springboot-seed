package com.springboot.apirest.models.dao;

import com.springboot.apirest.models.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserDao extends CrudRepository<User, Long> {
    // if we wanna filter for more fields: User findByUsernameAndEmailAndId(String username, String email, String id);
    // using JPA syntax
    User findByUsername(String username);

    // using @Query syntax
    // @Query("select user from User u where u.username=?1 and u.email=?2")
    // User findByUsername2(String username, String email);
}
