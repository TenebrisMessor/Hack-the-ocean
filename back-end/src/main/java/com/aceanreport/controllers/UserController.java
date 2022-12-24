package com.aceanreport.controllers;

import com.aceanreport.models.Users;
import com.aceanreport.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUserRepo repo;
    /*
    TODO DELETE THIS METHOD
     */
    @GetMapping("/users")
    private List<Users> index() {
        return repo.findAll();
    }
    // Register
    // Login
    // Logout
}
