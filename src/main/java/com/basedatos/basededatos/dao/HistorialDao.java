package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.HistorialModel;

import java.util.List;

public interface HistorialDao {
    List<HistorialModel> getHAll();
    HistorialModel getH( long id);
    HistorialModel registerH(HistorialModel historialModel);
    HistorialModel updateH(HistorialModel historialModel);
    void deleteH(long id);
}