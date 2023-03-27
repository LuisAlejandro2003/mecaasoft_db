package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.PersonDao;
import com.basedatos.basededatos.models.RegistrerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@CrossOrigin
public class PersonService {
    @Autowired
    PersonDao personDao;

    public List<RegistrerModel> getAllPE(){
        return personDao.getAllPE();
    }

    public RegistrerModel getPE(long id){
        return personDao.getPE(id);
    }
    public RegistrerModel registerPE(RegistrerModel registrerModel){
        return personDao.registerPE(registrerModel);
    }

    public RegistrerModel updatePE(@RequestBody RegistrerModel registrerModel){
        return personDao.updatePE(registrerModel);
    }

    public void deletePE(@PathVariable long id){
        personDao.deletePE(id);
    }



}
