package com.springboot.apirest.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    // security from oauth side
    // we select here the operations for each role
    @Override
    public void configure(HttpSecurity http) throws Exception {
        // here we select the rules for each endpoint and its security
        // its a white list
        http.authorizeRequests()
                .antMatchers(HttpMethod.GET, "/api/clients", "/api/clients/page/**", "/images/**").permitAll()
                .antMatchers(HttpMethod.GET, "/api/clients/{id}").hasAnyRole("USER", "ADMIN")
                .antMatchers(HttpMethod.POST, "/api/clients").hasRole("ADMIN")
                .anyRequest().authenticated();
    }
}
