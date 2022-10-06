package com.lastestteam.ciclo3.Implement;

import com.lastestteam.ciclo3.entities.Transaction;
import com.lastestteam.ciclo3.services.TransactionService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
@Transactional

public class TransactionServiceImplement implements TransactionService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Transaction> getTransaction() {
        String query = "FROM Transaction";
        return entityManager.createQuery(query).getResultList();

        //return null;
    }
}
