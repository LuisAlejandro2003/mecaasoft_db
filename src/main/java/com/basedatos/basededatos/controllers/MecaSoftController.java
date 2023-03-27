package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.MecaSoftModel;
import com.basedatos.basededatos.models.RegistrerModel;
import com.basedatos.basededatos.services.MecaSoftService;
import com.basedatos.basededatos.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Mecasoft")
@CrossOrigin
public class MecaSoftController {
    @Autowired
    MecaSoftService mecaSoftService;

    @GetMapping("/getAll")
    List<MecaSoftModel> getMAll(){
        return mecaSoftService.getMAll();
    }

    @GetMapping(value = "/getId/{id}")
    MecaSoftModel getById(@PathVariable("id") long id ){
        return mecaSoftService.getM(id);
    }

    @PostMapping(value = "/create")
    MecaSoftModel createM(@RequestBody MecaSoftModel mecaSoftModel){
        return mecaSoftService.registerM(mecaSoftModel);
    }

    @PutMapping(value = "/updateG/{id}")
    MecaSoftModel updateUserById(@RequestBody MecaSoftModel mecaSoftModel){
        return mecaSoftService.updateM(mecaSoftModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        mecaSoftService.deleteM(id);
    }
}
