package com.example.sprinbootdemo.repository;

import com.example.sprinbootdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
