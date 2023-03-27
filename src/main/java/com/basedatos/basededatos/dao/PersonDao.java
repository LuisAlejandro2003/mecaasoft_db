package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.RegistrerModel;

import java.util.List;

public interface PersonDao {
    List<RegistrerModel> getAllPE();
    RegistrerModel getPE(long id);
    RegistrerModel registerPE(RegistrerModel registrerModel);
    RegistrerModel updatePE(RegistrerModel registrerModel);
    void deletePE(  long id);
}
