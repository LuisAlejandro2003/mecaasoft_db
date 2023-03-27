package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.RegistrerModel;
import com.basedatos.basededatos.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
@CrossOrigin
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/getAll")
    List<RegistrerModel> getAllPE(){
        return personService.getAllPE();
    }

    @GetMapping(value = "/getId/{id}")
    RegistrerModel getById(@PathVariable("id") long id ){
        return personService.getPE(id);
    }

    @PostMapping(value = "/create")
    RegistrerModel createPE(@RequestBody RegistrerModel registrerModel){
        return personService.registerPE(registrerModel);
    }

    @PutMapping(value = "/updateG/{id}")
    RegistrerModel updateUserById(@RequestBody RegistrerModel registrerModel){
        return personService.updatePE(registrerModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        personService.deletePE(id);
    }
}
