package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.GassDao;
import com.basedatos.basededatos.models.GassModel;
import com.basedatos.basededatos.models.UserModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class GassDaoImp implements GassDao {

    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<GassModel> getGAll(){
        String hql = "FROM GassModel as u";
        return (List<GassModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public GassModel getG( long id){
        return entityManager.find(GassModel.class, id);

    }
    @Transactional
    @Override
    public GassModel registerG( GassModel gassModel){
        entityManager.merge(gassModel);
        return gassModel;
    }
    @Transactional
    @Override
    public GassModel updateG( GassModel gassModel){
        entityManager.merge(gassModel);
        return gassModel;
    }
    @Transactional
    @Override
    public void deleteG(  long id){
        GassModel gassModel = getG(id);
        entityManager.remove(gassModel);
    }


}
