package com.basedatos.basededatos.dao.imp;
import com.basedatos.basededatos.dao.HistorialDao;
import com.basedatos.basededatos.models.HistorialModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class HistorialDaoImp implements HistorialDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<HistorialModel> getHAll(){
        String hql = "FROM HistorialModel as u";
        return (List<HistorialModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public HistorialModel getH( long id){
        return entityManager.find(HistorialModel.class, id);

    }
    @Transactional
    @Override
    public HistorialModel registerH( HistorialModel historialModel){
        entityManager.merge(historialModel);
        return historialModel;
    }
    @Transactional
    @Override
    public HistorialModel updateH( HistorialModel historialModel){
        entityManager.merge(historialModel);
        return historialModel;
    }
    @Transactional
    @Override
    public void deleteH(  long id){
        HistorialModel historialModel = getH(id);
        entityManager.remove(historialModel);
    }
}