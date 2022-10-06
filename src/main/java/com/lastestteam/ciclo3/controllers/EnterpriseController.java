package com.lastestteam.ciclo3.controllers;

import com.lastestteam.ciclo3.services.EnterpriseService;
import com.lastestteam.ciclo3.entities.Employee;
import com.lastestteam.ciclo3.entities.Enterprise;
import com.lastestteam.ciclo3.services.EmployeeService;
import com.lastestteam.ciclo3.services.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//import java.util.ArrayList;
import java.util.List;


import java.util.ArrayList;
import java.util.List;
@RestController
public class EnterpriseController {


    @Autowired

    private EnterpriseService enterpriseService;


    @RequestMapping(value ="/enterprise")
    //@GetMapping("/enterprises")
    public List<Enterprise> getEnterprise() {

    return enterpriseService.getEnterprise();

    }
/*
    @RequestMapping(value = "/enterprise")
    //@GetMapping("/enterprises")
    public List<Enterprise> getEnterprise(){

        //public Employee getEmployee(@PathVariable Long id){
        List<Enterprise> enterprise = new ArrayList<>();
/*
        Enterprise enterprise1 = new Enterprise();
        enterprise1.setId(235L);
        enterprise1.setName("manuel");
        enterprise1.setEmail("manuel@gmail.com");
        enterprise1.setRole("admin");
        enterprise1.setEnterprise("comercio500");
        enterprise1.setProfile("manuel80");
        enterprise1.setPassword("1234");


        Enterprise enterprise2 = new Enterprise();
        enterprise2.setId(133L);
        enterprise2.setName("Alejandro");
        enterprise2.setEmail("Alejandro@gmail.com");
        enterprise2.setRole("developer");
        enterprise2.setEnterprise("comercio2000");
        enterprise2.setProfile("alejandro80");
        enterprise2.setPassword("456123");

        enterprise.add(enterprise2);
        enterprise.add(enterprise2);
        // public String test(){
        return enterprise;

*/
        //public String Enterprise(){
      //  return "Estamos Trabajando para visualizar la información en esta página.";
        //return enterprise;
    //}
}

