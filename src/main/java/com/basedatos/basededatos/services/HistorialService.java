package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.HistorialDao;
import com.basedatos.basededatos.models.HistorialModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@CrossOrigin
public class HistorialService {
    @Autowired
    HistorialDao historialDao;

    public List<HistorialModel> getHAll(){
        return historialDao.getHAll();
    }

    public HistorialModel getH(long id){
        return historialDao.getH(id);
    }
    public HistorialModel registerH(HistorialModel historialModel){
        return historialDao.registerH(historialModel);
    }

    public HistorialModel updateH(@RequestBody HistorialModel historialModel){
        return historialDao.updateH(historialModel);
    }

    public void deleteH(@PathVariable long id){
        historialDao.deleteH(id);
    }
}