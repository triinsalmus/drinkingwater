package com.example.drinkingwater.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Water {

    @Id
    private Long id;
    private String name;
    private Integer amount;
    private String unit;
//    private Date date;
}
