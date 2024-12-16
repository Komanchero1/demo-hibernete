package org.example.demohibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.example.demohibernate.entity.Persons;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonsRepository {

    @PersistenceContext
    private EntityManager em;

    public List<Persons>getPersonsByCiti(String citi){
        TypedQuery<Persons> query = em.createQuery("SELECT p " +
                "FROM Persons p WHERE p.city_of_living = :citi", Persons.class);
        query.setParameter("citi", citi);
        return query.getResultList();
    }

    @Transactional
    public void save(Persons person){
        em.persist(person);
    }
}
