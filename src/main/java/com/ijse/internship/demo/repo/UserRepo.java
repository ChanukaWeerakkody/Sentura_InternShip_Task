package com.ijse.internship.demo.repo;

import com.ijse.internship.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
