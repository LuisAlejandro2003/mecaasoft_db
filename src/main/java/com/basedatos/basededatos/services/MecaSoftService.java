package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.GassDao;
import com.basedatos.basededatos.dao.MecaSoftDao;
import com.basedatos.basededatos.models.GassModel;
import com.basedatos.basededatos.models.MecaSoftModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
@CrossOrigin
public class MecaSoftService {
    @Autowired
    MecaSoftDao mecaSoftDao;

    public List<MecaSoftModel> getMAll(){
        return mecaSoftDao.getMAll();
    }

    public MecaSoftModel getM(long id){
        return mecaSoftDao.getM(id);
    }
    public MecaSoftModel registerM(MecaSoftModel mecaSoftModel){
        return mecaSoftDao.registerM(mecaSoftModel);
    }

    public MecaSoftModel updateM(@RequestBody MecaSoftModel mecaSoftModel){
        return mecaSoftDao.updateM(mecaSoftModel);
    }

    public void deleteM(@PathVariable long id){
        mecaSoftDao.deleteM(id);
    }

}
