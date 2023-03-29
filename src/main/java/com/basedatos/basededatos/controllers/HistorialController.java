package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.HistorialModel;
import com.basedatos.basededatos.services.HistorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historial")
@CrossOrigin
public class HistorialController {
    @Autowired
    HistorialService historialService;

    @GetMapping("/getAll")
    List<HistorialModel> getHAll(){
        return historialService.getHAll();
    }

    @GetMapping(value = "/getId/{id}")
    HistorialModel getById(@PathVariable("id") long id ){
        return historialService.getH(id);
    }

    @PostMapping(value = "/create")
    HistorialModel createH(@RequestBody HistorialModel historialModel){
        return historialService.registerH(historialModel);
    }

    @PutMapping(value = "/updateG/{id}")
    HistorialModel updateUserById(@RequestBody HistorialModel historialModel){
        return historialService.updateH(historialModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        historialService.deleteH(id);
    }
}