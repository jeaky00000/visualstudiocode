package com.example.demo.repositories;

import java.util.List;

import com.example.demo.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
    List<User> findAll();

}

