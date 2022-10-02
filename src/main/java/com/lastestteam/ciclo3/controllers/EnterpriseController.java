package com.lastestteam.ciclo3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class EnterpriseController {
    @RequestMapping(value = "/enterprise")
    //@GetMapping("/enterprises")

    public String Enterprise(){
        return "Estamos Trabajando para visualizar la información en esta página.";
    }
}

