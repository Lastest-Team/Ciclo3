package com.lastestteam.ciclo3.controllers;

//import com.lastesteam.portalsgie.entities.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import java.util.List;

@RestController
public class EmployeeController {

    //@RequestMapping(value ="/employee/{id}")
    @RequestMapping(value ="/employee")
    //@GetMapping("/enterprises")

    //public Employee getEmployee(@PathVariable Long id){
      //  Employee employee = new Employee();

        //employee.setId(id);

  //employee.setName("manuel");

           //employee.setEmail("manuel@gmail.com");
           //employee.setRole("admin");
           //employee.setEnterprise("comercio500");
           //employee.setProfile("manuel80");
           //employee.setPassword("1234");
    public String test(){

    return "test";//employee;



      //  public String Enterprise(){
        //    return "Estamos Trabajando para visualizar la información en esta página.";
    }
}







