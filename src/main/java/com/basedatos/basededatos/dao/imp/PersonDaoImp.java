package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.PersonDao;
import com.basedatos.basededatos.models.RegistrerModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional

public class PersonDaoImp implements PersonDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<RegistrerModel> getAllPE(){
        String hql = "FROM RegistrerModel as u";
        return (List<RegistrerModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public RegistrerModel getPE(long id){
        return entityManager.find(RegistrerModel.class, id);

    }
    @Transactional
    @Override
    public RegistrerModel registerPE(RegistrerModel registrerModel){
        entityManager.merge(registrerModel);
        return registrerModel;
    }
    @Transactional
    @Override
    public RegistrerModel updatePE(RegistrerModel registrerModel){
        entityManager.merge(registrerModel);
        return registrerModel;
    }
    @Transactional
    @Override
    public void deletePE(  long id){
        RegistrerModel registrerModel = getPE(id);
        entityManager.remove(registrerModel);
    }
}
