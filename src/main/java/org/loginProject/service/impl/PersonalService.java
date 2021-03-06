package org.loginProject.service.impl;
import org.loginProject.model.Personal;
import org.loginProject.repository.IPersonalRepo;
import org.loginProject.repository.generic.IGenericRepository;
import org.loginProject.repository.impl.PersonalRepo;
import org.loginProject.service.IPersonalService;
import org.loginProject.service.generic.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonalService extends GenericService<Personal> implements IPersonalService {
    @Autowired
    private IPersonalRepo iPersonalRepo;
    @Override
    protected IGenericRepository getGenericRepo() {
        return iPersonalRepo;
    }
    @Override
    @Transactional
    public void save(Personal entity) {
        if(entity.getId() == null || entity.getId() > -1){
            Personal personal = super.loadById(entity.getId());
            entity.setCode(entity.getCode());
            entity.setName(entity.getName());
            entity.setFamily(entity.getFamily());
            entity.setUsername(entity.getUsername());
            entity.setPassword(entity.getPassword());
            super.update(personal);
        }else {
            super.save(entity);
        }

    }
    @Override
    public void findPersonalByUsername(Personal entity) {
        PersonalRepo personalRepo=new PersonalRepo();
        personalRepo.findPersonalByUsername(entity);
        }

    @Override
    public List getAll() {
        return super.getAll();
    }
}
