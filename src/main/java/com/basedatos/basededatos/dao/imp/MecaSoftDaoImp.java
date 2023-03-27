package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.GassDao;
import com.basedatos.basededatos.dao.MecaSoftDao;
import com.basedatos.basededatos.models.GassModel;
import com.basedatos.basededatos.models.MecaSoftModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class MecaSoftDaoImp implements MecaSoftDao{
        @PersistenceContext
        EntityManager entityManager;
        @Transactional
        @Override
        public List<MecaSoftModel> getMAll(){
            String hql = "FROM MecaSoftModel as u";
            return (List<MecaSoftModel>) entityManager.createQuery(hql).getResultList();
        }
        @Transactional
        @Override
        public MecaSoftModel getM( long id){
            return entityManager.find(MecaSoftModel.class, id);

        }
        @Transactional
        @Override
        public MecaSoftModel registerM( MecaSoftModel mecaSoftModel){
            entityManager.merge(mecaSoftModel);
            return mecaSoftModel;
        }
        @Transactional
        @Override
        public MecaSoftModel updateM( MecaSoftModel mecaSoftModel){
            entityManager.merge(mecaSoftModel);
            return mecaSoftModel;
        }
        @Transactional
        @Override
        public void deleteM(  long id){
            MecaSoftModel mecaSoftModel = getM(id);
            entityManager.remove(mecaSoftModel);
        }
}
