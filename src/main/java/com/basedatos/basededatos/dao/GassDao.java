package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.GassModel;
import com.basedatos.basededatos.models.ProfileTwoModel;

import java.util.List;

public interface GassDao{

    List<GassModel> getGAll();
    GassModel getG( long id);
    GassModel registerG(GassModel gassModel);
    GassModel updateG( GassModel gassModel);
    void deleteG(  long id);
}
