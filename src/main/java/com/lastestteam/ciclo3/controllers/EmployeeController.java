package com.lastestteam.ciclo3.controllers;

import com.lastestteam.ciclo3.entities.Employee;

import com.lastestteam.ciclo3.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {


    @Autowired


    private EmployeeService employeeService;

    @RequestMapping(value ="/employee")
    //@GetMapping("/enterprises")
    public List<Employee> getEmployee() {

     return employeeService.getEmployee();

    }


    @RequestMapping(value ="/employee/{id}")
    //@RequestMapping(value ="/employee")
    //@GetMapping("/enterprises")
    //public Employee getEmployee1(){

    public Employee getEmployee(@PathVariable Long id){
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName("manuel");
        employee.setEmail("manuel@gmail.com");
        employee.setRole("admin");
        employee.setEnterprise("comercio500");
        employee.setProfile("manuel80");
        employee.setPassword("1234");
   // public String test(){
        return  employee;

    }


/*
        //public Employee getEmployee(@PathVariable Long id){
        List<Employee> employee = new ArrayList<>();

        Employee employee1 = new Employee();
        employee1.setId(235L);
        employee1.setName("manuel");
        employee1.setEmail("manuel@gmail.com");
        employee1.setRole("admin");
        employee1.setEnterprise("comercio500");
        employee1.setProfile("manuel80");
        employee1.setPassword("1234");


        Employee employee2 = new Employee();
        employee2.setId(133L);
        employee2.setName("Alejandro");
        employee2.setEmail("Alejandro@gmail.com");
        employee2.setRole("developer");
        employee2.setEnterprise("comercio2000");
        employee2.setProfile("alejandro80");
        employee2.setPassword("456123");

        employee.add(employee1);
        employee.add(employee2);
        // public String test(){
        return employee;

    }

/*
    @RequestMapping(value ="/employee1")
    public Employee modifyEmployee(){

        //public Employee getEmployee(@PathVariable Long id){
        Employee employee = new Employee();
        //employee.setId(id);
        employee.setName("manuel");
        employee.setEmail("manuel@gmail.com");
        employee.setRole("admin");
        employee.setEnterprise("comercio500");
        employee.setProfile("manuel80");
        employee.setPassword("1234");
        // public String test(){
        return  employee;//"test";//

    }


    @RequestMapping(value ="/employee2")
    //@GetMapping("/enterprises")
    public Employee deleteEmployee(){

        //public Employee getEmployee(@PathVariable Long id){
        Employee employee = new Employee();
        //employee.setId(id);
        employee.setName("manuel");
        employee.setEmail("manuel@gmail.com");
        employee.setRole("admin");
        employee.setEnterprise("comercio500");
        employee.setProfile("manuel80");
        employee.setPassword("1234");
        // public String test(){
        return  employee;//"test";//

    }




    @RequestMapping(value ="/employee3")
    //@GetMapping("/enterprises")
    public Employee searchEmployee(){

        //public Employee getEmployee(@PathVariable Long id){
        Employee employee = new Employee();
        //employee.setId(id);
        employee.setName("manuel");
        employee.setEmail("manuel@gmail.com");
        employee.setRole("admin");
        employee.setEnterprise("comercio500");
        employee.setProfile("manuel80");
        employee.setPassword("1234");
        // public String test(){
        return  employee;//"test";//

    }

    @RequestMapping(value ="/employee/{id}")
    //@GetMapping("/enterprises")
    //public Employee getEmployee(){

    public Employee getEmployee(@PathVariable Long id){
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName("manuel");
        employee.setEmail("manuel@gmail.com");
        employee.setRole("admin");
        employee.setEnterprise("comercio500");
        employee.setProfile("manuel80");
        employee.setPassword("1234");
        // public String test(){
        return  employee;//"test";//

*/

                        //  public String Enterprise(){
        //    return "Estamos Trabajando para visualizar la información en esta página.";
    }
//}







