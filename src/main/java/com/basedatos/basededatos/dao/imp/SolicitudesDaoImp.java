package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.SolicitudesDao;
import com.basedatos.basededatos.models.HistorialModel;
import com.basedatos.basededatos.models.SolicitudesModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class SolicitudesDaoImp implements SolicitudesDao {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<SolicitudesModel> getSAll(){
        String hql = "FROM SolicitudesModel as u";
        return (List<SolicitudesModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public SolicitudesModel getS( long id){
        return entityManager.find(SolicitudesModel.class, id);

    }
    @Transactional
    @Override
    public SolicitudesModel registerS(SolicitudesModel solicitudesModel){
        entityManager.merge(solicitudesModel);
        return solicitudesModel;
    }
    @Transactional
    @Override
    public SolicitudesModel updateS(SolicitudesModel solicitudesModel){
        entityManager.merge(solicitudesModel);
        return solicitudesModel;
    }
    @Transactional
    @Override
    public void deleteS(long id){
        SolicitudesModel solicitudesModel = getS(id);
        entityManager.remove(solicitudesModel);
    }
}