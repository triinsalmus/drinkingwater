package com.example.drinkingwater.controller;

import com.example.drinkingwater.dto.Purpose;
import com.example.drinkingwater.dto.Water;
import com.example.drinkingwater.service.PurposeService;
import com.example.drinkingwater.service.WaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/water")
@RestController
public class DrinkingWater {

    @Autowired
    private PurposeService purposeService;

    @Autowired
    private WaterService waterService;

    @PostMapping("/addpurpose")
    public void addPurpose(@RequestBody Purpose purpose) {
        purposeService.addPurpose(purpose);
    }

    @PostMapping("/updatepurpose")
    public void updatePurpose(@RequestBody Purpose purpose) {
        purposeService.updatePurpose(purpose);
    }

    @PostMapping("/addwater")
    public void addWater(@RequestBody Water water) {
        waterService.addWater(water);
    }

    @PostMapping("/reducewater") //nope - kustutab kõik, kus sama kogus
    public void reduceWater(@RequestBody Water water) {
        waterService.reduceWater(water);
    }
}
