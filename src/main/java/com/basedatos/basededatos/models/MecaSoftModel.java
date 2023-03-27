package com.basedatos.basededatos.models;

import jakarta.persistence.*;

@Entity
@Table(schema = "MecaSoft")
public class MecaSoftModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "name_users", nullable = false)
    private String name_users;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "matricula", nullable = false)
    private String matricula;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "confirmpassword", nullable = false)
    private String confirmpassword;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_users() {
        return name_users;
    }

    public void setName_users(String name_users) {
        this.name_users = name_users;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }
}

