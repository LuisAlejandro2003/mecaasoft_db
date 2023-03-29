package com.basedatos.basededatos.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(schema = "Solicitudes")
public class SolicitudesModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "users", nullable = false)
    private String users;

    @Column(name = "teta1", nullable = false)
    private int teta1;

    @Column(name = "teta2", nullable = false)
    private int teta2;

    @Column(name = "z", nullable = false)
    private int z;

    @Column(name = "fecha")
    private Date fecha;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public int getTeta1() {
        return teta1;
    }

    public void setTeta1(int teta1) {
        this.teta1 = teta1;
    }

    public int getTeta2() {
        return teta2;
    }

    public void setTeta2(int teta2) {
        this.teta2 = teta2;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}