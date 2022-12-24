package com.aceanreport.models;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.util.List;

@Entity
public class Users {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "email", length = 150)
    private String email;
    @Column(name = "password", length = 150)
    private String password;
    @Column(name = "telephone", length = 20)
    private String telephone;
    @Value("${some.key:false}")
    @Column(name = "admin" )
    private boolean admin;
    @OneToMany(mappedBy = "user")
    private List<Posts> posts;

    public Users() {
    }

    public Users(String name, String email, String password, String telephone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
    }

    public Users(String name, String email, String password, String telephone, boolean admin) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
        this.admin = admin;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public String getTelephone() {
        return telephone;
    }

    public List<Posts> posts() {
        return posts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}