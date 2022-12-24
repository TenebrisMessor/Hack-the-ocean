package com.aceanreport.controllers;

import com.aceanreport.repo.IPostsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @Autowired
    private IPostsRepo repo;
    // List
    // Create
    // Edit
    // Delete
    // Show
}
