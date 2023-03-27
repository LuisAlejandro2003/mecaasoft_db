package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.GassModel;
import com.basedatos.basededatos.models.MecaSoftModel;

import java.util.List;

public interface MecaSoftDao {
    List<MecaSoftModel> getMAll();
    MecaSoftModel getM( long id);
    MecaSoftModel registerM(MecaSoftModel mecaSoftModel);
    MecaSoftModel updateM( MecaSoftModel mecaSoftModel);
    void deleteM(  long id);
}
