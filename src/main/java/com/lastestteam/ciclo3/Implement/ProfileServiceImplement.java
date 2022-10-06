package com.lastestteam.ciclo3.Implement;

import com.lastestteam.ciclo3.entities.Profile;
import com.lastestteam.ciclo3.services.ProfileService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
@Transactional

public class ProfileServiceImplement implements ProfileService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Profile> getProfile() {
        String query = "FROM Profile";
        return entityManager.createQuery(query).getResultList();

        //return null;
    }
}
