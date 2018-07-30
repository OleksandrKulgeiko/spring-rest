package com.kulgeiko.spring_prep.f_rest.restcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by akulgeiko on 12/31/2017.
 */
@Controller
public class RestControllerBasic {
    @RequestMapping(value = "/hellobasic", method = RequestMethod.GET)
    @ResponseBody
    public String findOwner() {
        return "Hello world, I am Controller";
    }

}
