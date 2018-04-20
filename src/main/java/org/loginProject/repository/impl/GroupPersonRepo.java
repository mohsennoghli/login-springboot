package org.loginProject.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.loginProject.model.Personal;
import org.loginProject.repository.IGroupPersonRepo;
import org.loginProject.repository.generic.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * @author Ali
 * Create on 4/19/2018 11:16 AM
 */

@Transactional
@Repository
public class GroupPersonRepo extends GenericRepository<Personal> implements IGroupPersonRepo {

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
