package com.lastestteam.ciclo3.controllers;

import com.lastestteam.ciclo3.entities.Employee;
import com.lastestteam.ciclo3.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleNameController {


    @Autowired


    private RoleNameService rolenameService;

    @RequestMapping(value ="/rolename")
    //@GetMapping("/enterprises")
    public List<RoleName> getRoleName() {

        return rolenameService.getRoleName();

    }
}
