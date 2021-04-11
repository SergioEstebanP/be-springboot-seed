package com.springboot.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ApirestApplication implements CommandLineRunner {

    @Autowired
    private BCryptPasswordEncoder passwordEncoderBy;

    public static void main(String[] args) {
        SpringApplication.run(ApirestApplication.class, args);
    }

    // this is a before run
    @Override
    public void run(String... args) {
        String password = "12345";
        for (int i=0; i<4; i++) {
            String passwordBcrypt = passwordEncoderBy.encode(password);
            System.out.println(passwordBcrypt);
        }
    }
}
