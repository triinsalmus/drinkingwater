package com.example.drinkingwater.service;

import com.example.drinkingwater.dto.Purpose;
import com.example.drinkingwater.repository.PurposeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurposeService {

    @Autowired
    private PurposeRepository purposeRepository;

    public void addPurpose(Purpose purpose) {
        purposeRepository.addPurpose(purpose.getName(), purpose.getAmount(), purpose.getUnit());
    }

    public void updatePurpose(Purpose purpose){
        purposeRepository.deletePurpose(purpose.getName());
        purposeRepository.addPurpose(purpose.getName(), purpose.getAmount(), purpose.getUnit());
    }


}
