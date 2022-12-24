package com.aceanreport.repo;

import com.aceanreport.models.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostsRepo extends JpaRepository <Posts, Integer> {
}
