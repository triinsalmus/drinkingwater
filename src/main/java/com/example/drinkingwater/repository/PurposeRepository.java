package com.example.drinkingwater.repository;

import com.example.drinkingwater.dto.Purpose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface PurposeRepository extends JpaRepository<Purpose, Date> {
}
