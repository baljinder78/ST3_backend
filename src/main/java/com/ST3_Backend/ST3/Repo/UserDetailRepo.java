package com.ST3_Backend.ST3.Repo;

import com.ST3_Backend.ST3.Model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailRepo extends JpaRepository<UserDetails,String> {
}
