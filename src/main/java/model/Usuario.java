package model;

import javax.persistence.Entity;

@Entity
public class Usuario {

    private String userName;
    private String password;

    public Usuario(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
} 