package com.example.drinkingwater.repository;

import com.example.drinkingwater.dto.Water;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface WaterRepository extends JpaRepository<Water, Date> {
}
