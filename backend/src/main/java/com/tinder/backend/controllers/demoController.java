package com.tinder.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    @GetMapping(value = "/")
    public String getHelloWorld() {
        return "Hello Girlzzzz!";
    }


}
