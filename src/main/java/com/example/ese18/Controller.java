package com.example.ese18;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Environment environment;

    @GetMapping("/")
    public String hello() {
        String devName = environment.getProperty("devName");
        String authCode = environment.getProperty("authCode");
        return "Hello, " + devName + authCode;
    }
}

