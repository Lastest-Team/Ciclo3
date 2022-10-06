package com.lastestteam.ciclo3.Implement;

import com.lastestteam.ciclo3.entities.Enterprise;
import com.lastestteam.ciclo3.services.EnterpriseService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
@Transactional

public class EnterpriseServiceImplement implements EnterpriseService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Enterprise> getEnterprise() {
        String query = "FROM Enterprise";
        return entityManager.createQuery(query).getResultList();

        //return null;
    }
}
