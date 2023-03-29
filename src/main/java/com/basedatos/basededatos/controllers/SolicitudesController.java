package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.HistorialModel;
import com.basedatos.basededatos.models.SolicitudesModel;
import com.basedatos.basededatos.services.HistorialService;
import com.basedatos.basededatos.services.SolicitudesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitudes")
@CrossOrigin
public class SolicitudesController {
    @Autowired
    SolicitudesService solicitudesService;

    @GetMapping("/getAll")
    List<SolicitudesModel> getSAll(){
        return solicitudesService.getSAll();
    }

    @GetMapping(value = "/getId/{id}")
    SolicitudesModel getById(@PathVariable("id") long id ){
        return solicitudesService.getS(id);
    }

    @PostMapping(value = "/create")
    SolicitudesModel createS(@RequestBody SolicitudesModel solicitudesModel){
        return solicitudesService.registerS(solicitudesModel);
    }

    @PutMapping(value = "/updateG/{id}")
    SolicitudesModel updateUserById(@RequestBody SolicitudesModel solicitudesModel){
        return solicitudesService.updateS(solicitudesModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        solicitudesService.deleteS(id);
    }
}