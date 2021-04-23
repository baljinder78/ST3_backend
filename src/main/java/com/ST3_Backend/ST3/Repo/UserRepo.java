package com.ST3_Backend.ST3.Repo;

import com.ST3_Backend.ST3.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, String> {

}
