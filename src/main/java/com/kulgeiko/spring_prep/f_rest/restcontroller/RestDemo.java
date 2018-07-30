package com.kulgeiko.spring_prep.f_rest.restcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

// http://localhost:8080/hellobasic
// http://localhost:8080/hello

@SpringBootApplication
public class RestDemo extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RestDemo.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RestDemo.class, args);
    }

}