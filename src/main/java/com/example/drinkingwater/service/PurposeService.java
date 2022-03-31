package com.example.drinkingwater.service;

import com.example.drinkingwater.dto.Purpose;
import com.example.drinkingwater.repository.PurposeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class PurposeService {

    private PurposeRepository repository;

    public void addPurpose(Purpose purpose) {
        repository.save(purpose);
    }

    public void updatePurpose(Purpose purpose){
        repository.delete(purpose);
        addPurpose(purpose);
    }


}
