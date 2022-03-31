package com.example.drinkingwater.service;

import com.example.drinkingwater.dto.Water;
import com.example.drinkingwater.repository.WaterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
@RequiredArgsConstructor
public class WaterService {

    private WaterRepository repository;

    Date date = new Date();

    public void addWater(Water water) {
        repository.save(water);
    }

    public void reduceWater(Water water){
        water.setAmount(-water.getAmount());
        addWater(water);
    }
}
