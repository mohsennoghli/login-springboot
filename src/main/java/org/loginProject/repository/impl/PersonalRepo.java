package org.loginProject.repository.impl;

import org.hibernate.SessionFactory;
import org.loginProject.model.Personal;
import org.loginProject.repository.IPersonalRepo;
import org.loginProject.repository.generic.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * @author Ali
 * Create on 4/19/2018 10:53 AM
 */

@Repository
@Transactional
public class PersonalRepo  extends GenericRepository<Personal> implements IPersonalRepo {

    @Override
    protected Class<Personal> getDomainClass() {
        return Personal.class;
    }



    @PersistenceContext
    private EntityManager entityManager;

    public Personal findByPersonalCode (String PersonalUsername){
        String hql = (" from "+getDomainClass().getName()+ " e where e.username='"+PersonalUsername+"'");
        Query query = entityManager.createQuery(hql);
        return (Personal) query.getSingleResult();
    }
}