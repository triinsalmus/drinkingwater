package com.example.drinkingwater.service;

import com.example.drinkingwater.dto.Water;
import com.example.drinkingwater.repository.WaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class WaterService {

    @Autowired
    private WaterRepository waterRepository;

    Date date = new Date();

    public void addWater(Water water) {
        waterRepository.addWater(water.getName(), water.getAmount(), water.getUnit(), date);
    }

    public void reduceWater(Water water){
        waterRepository.reduceWater(water.getName(), water.getAmount(), water.getUnit());
    }
}
