package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.GassDao;
import com.basedatos.basededatos.models.GassModel;
import com.basedatos.basededatos.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@CrossOrigin
public class GassService {
    @Autowired
    GassDao gassDao;

    public List<GassModel> getGAll(){
        return gassDao.getGAll();
    }

    public GassModel getG(long id){
        return gassDao.getG(id);
    }
    public GassModel registerG(GassModel gassModel){
        return gassDao.registerG(gassModel);
    }

    public GassModel updateG(@RequestBody GassModel gassModel){
        return gassDao.updateG(gassModel);
    }

    public void deleteG(@PathVariable long id){
        gassDao.deleteG(id);
    }
}
