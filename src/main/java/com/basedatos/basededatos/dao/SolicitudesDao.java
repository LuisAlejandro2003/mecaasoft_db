package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.HistorialModel;
import com.basedatos.basededatos.models.SolicitudesModel;

import java.util.List;

public interface SolicitudesDao {
    List<SolicitudesModel> getSAll();
    SolicitudesModel getS( long id);
    SolicitudesModel registerS(SolicitudesModel solicitudesModel);
    SolicitudesModel updateS(SolicitudesModel solicitudesModel);
    void deleteS(long id);
}