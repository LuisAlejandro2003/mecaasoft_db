package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.SolicitudesDao;
import com.basedatos.basededatos.models.HistorialModel;
import com.basedatos.basededatos.models.SolicitudesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@CrossOrigin
public class SolicitudesService {
    @Autowired
    SolicitudesDao solicitudesDao;

    public List<SolicitudesModel> getSAll(){
        return solicitudesDao.getSAll();
    }

    public SolicitudesModel getS(long id){
        return solicitudesDao.getS(id);
    }
    public SolicitudesModel registerS(SolicitudesModel solicitudesModel){
        return solicitudesDao.registerS(solicitudesModel);
    }

    public SolicitudesModel updateS(@RequestBody SolicitudesModel solicitudesModel){
        return solicitudesDao.updateS(solicitudesModel);
    }

    public void deleteS(@PathVariable long id){
        solicitudesDao.deleteS(id);
    }
}