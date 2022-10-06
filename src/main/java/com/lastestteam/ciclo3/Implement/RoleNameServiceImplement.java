package com.lastestteam.ciclo3.Implement;

import com.lastestteam.ciclo3.entities.RoleName;
import com.lastestteam.ciclo3.services.RoleNameService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
@Transactional

public class RoleNameServiceImplement implements RoleNameService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<RoleName> getRoleName() {
        String query = "FROM RoleName";
        return entityManager.createQuery(query).getResultList();

        //return null;
    }
}
