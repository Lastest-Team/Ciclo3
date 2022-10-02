package com.lastestteam.ciclo3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
    @GetMapping("/user")
    public String User(){
        return "Estamos Trabajando...";
    }
}
