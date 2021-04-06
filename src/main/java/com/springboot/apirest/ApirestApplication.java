package com.springboot.apirest;

import com.springboot.apirest.models.entity.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApirestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
		Client client = new Client();
		client.setEmail("sergio@mail.com");
	}
}
