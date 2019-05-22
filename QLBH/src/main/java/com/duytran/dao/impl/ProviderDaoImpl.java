package com.duytran.dao.impl;

import com.duytran.dao.ProviderDao;
import com.duytran.entity.Provider;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class ProviderDaoImpl implements ProviderDao {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<Provider> getAllProviders() {
        String jql = "SELECT p FROM Provider p ";
        return entityManager.createQuery(jql, Provider.class).getResultList();
    }

    @Override
    public void addProvider(Provider provider) {
        entityManager.persist(provider);

    }

    @Override
    public void deleteProvider(Provider provider) {
        entityManager.remove(provider);
    }

    @Override
    public void updateProvider(Provider provider) {
        entityManager.merge(provider);
    }
}