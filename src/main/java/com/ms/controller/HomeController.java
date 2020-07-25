package com.ms.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome";
    }

    @GetMapping("/admin")
    public String admin(Authentication authentication){
        return "Welcome "+authentication.getName();
    }

    @GetMapping("/user")
    public String user(Authentication authentication){
        return "Welcome User - "+authentication.getName();
    }
}