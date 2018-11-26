package com.example.demo.repositories;

import java.util.List;

import com.example.demo.entities.Favorite;
import com.example.demo.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, Integer>{
    List<Favorite> findAll();

}

