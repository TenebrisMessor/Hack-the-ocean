package com.aceanreport.models;

import javax.persistence.*;

@Entity
public class Posts {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;
    //Titulo
    @Column(name = "title", length = 150)
    private String title;
    //Descripcion
    @Lob
    @Column(name = "description")
    private String description;
    //Lugar
    @Column(name = "location", length = 150)
    private String location;
    //personas requeridas
    @Column(name = "required")
    private int required;

    public Posts() {  }

    public Posts(Users user, String title, String description, String location, int required) {
        this.user = user;
        this.title = title;
        this.description = description;
        this.location = location;
        this.required = required;
    }

    public Users user() {  return user;  }
    public int getId() {  return id;  }
    public String getTitle() {  return title;  }
    public String getDescription() {  return description;  }
    public String getLocation() {  return location;  }
    public int getRequired() {  return required;  }

    public void setUser(Users user) {
        this.user = user;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setRequired(int required) {
        this.required = required;
    }
}
