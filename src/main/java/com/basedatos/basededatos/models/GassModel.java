package com.basedatos.basededatos.models;


import jakarta.persistence.*;

@Entity
@Table(schema = "gass")
public class GassModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name_gass", nullable = false)
    private String name_gass;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "activa", nullable = false)
    private boolean activa;

    @Column(name = "total_gass_stations", nullable = false)
    private int total_gass_stations;

    @Column(name = "phone", nullable = false)
    private String phone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName_gass() {
        return name_gass;
    }

    public void setName_gass(String name_gass) {
        this.name_gass = name_gass;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public int getTotal_gass_stations() {
        return total_gass_stations;
    }

    public void setTotal_gass_stations(int total_gass_stations) {
        this.total_gass_stations = total_gass_stations;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
