package com.aceanreport.repo;

import com.aceanreport.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository <Users, Integer> {

}