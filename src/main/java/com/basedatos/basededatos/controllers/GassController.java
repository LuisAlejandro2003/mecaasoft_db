package com.basedatos.basededatos.controllers;
import com.basedatos.basededatos.models.GassModel;
import com.basedatos.basededatos.models.UserModel;
import com.basedatos.basededatos.services.GassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gass")
@CrossOrigin

public class GassController {
    @Autowired
    GassService gassService;

    @GetMapping("/getAll")
    List<GassModel> getGAll(){
        return gassService.getGAll();
    }

    @GetMapping(value = "/getId/{id}")
    GassModel getById(@PathVariable("id") long id ){
        return gassService.getG(id);
    }

    @PostMapping(value = "/create")
    GassModel createG(@RequestBody GassModel gassModel){
        return gassService.registerG(gassModel);
    }

    @PutMapping(value = "/updateG/{id}")
    GassModel updateUserById(@RequestBody GassModel gassModel ){
        return gassService.updateG(gassModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        gassService.deleteG(id);
    }

}
