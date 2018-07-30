package com.kulgeiko.spring_prep.f_rest.resttemplate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by akulgeiko on 7/26/2018.
 */
public class RestTemplateTest {

    public static void main(String... args) {

        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/hellobasicr";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        System.out.println(response.getStatusCode());
    }
}
