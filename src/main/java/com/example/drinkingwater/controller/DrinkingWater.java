package com.example.drinkingwater.controller;

import com.example.drinkingwater.dto.Purpose;
import com.example.drinkingwater.dto.Water;
import com.example.drinkingwater.service.PurposeService;
import com.example.drinkingwater.service.WaterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/water")
@RestController
public class DrinkingWater {

    private PurposeService purposeService;
    private WaterService waterService;

    @PostMapping("/add-purpose")
    public void addPurpose(@RequestBody Purpose purpose) {
        purposeService.addPurpose(purpose);
    }

    @PostMapping("/update-purpose")
    public void updatePurpose(@RequestBody Purpose purpose) {
        purposeService.updatePurpose(purpose);
    }

    @PostMapping("/add-water")
    public void addWater(@RequestBody Water water) {
        waterService.addWater(water);
    }

    @PostMapping("/reduce-water")
    public void reduceWater(@RequestBody Water water) {
        waterService.reduceWater(water);
    }
}
