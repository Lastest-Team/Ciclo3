package com.lastestteam.ciclo3.Implement;

import com.lastestteam.ciclo3.entities.Employee;
import com.lastestteam.ciclo3.services.EmployeeService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

//@Language
@Repository
@Transactional

public class EmployeeServiceImplement implements EmployeeService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee>  getEmployee() {
        String query = "FROM Employee";
        return entityManager.createQuery(query).getResultList();

        //return null;
    }
}
