package com.lastestteam.ciclo3.Implement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.List;

import javax.persistence.EntityManager;
//import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.lastestteam.ciclo3.entities.Employee;
import com.lastestteam.ciclo3.services.EmployeeService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
@Transactional

public class EmployeeServiceImplement implements EmployeeService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> getEmployee() {
        String query = "FROM Employee";
        return entityManager.createQuery(query).getResultList();

        //return null;
    }
}
