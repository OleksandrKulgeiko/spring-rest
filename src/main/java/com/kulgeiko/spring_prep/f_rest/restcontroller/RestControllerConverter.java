package com.kulgeiko.spring_prep.f_rest.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by akulgeiko on 1/7/2018.
 */
@RestController
public class RestControllerConverter {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String findOwner() {
        return "Hello world, I am advanced REST Controller";
    }
}

