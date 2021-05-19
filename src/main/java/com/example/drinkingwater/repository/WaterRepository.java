package com.example.drinkingwater.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Repository
public class WaterRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public void addWater(String name, Integer amount, String unit, Date date) {
        String addSQL = "INSERT INTO water(name, amount, unit, date) VALUES (:dbname, :dbamount, :dbunit, :dbdate)";
        Map<String, Object> addMap = new HashMap<>();
        addMap.put("dbname", name);
        addMap.put("dbamount", amount);
        addMap.put("dbunit", unit);
        addMap.put("dbdate", date);
        jdbcTemplate.update(addSQL, addMap);
    }

    public void reduceWater(String name, Integer amount, String unit) {
        String reduceSQL = "DELETE FROM water WHERE name=:dbname AND amount=:dbamount AND unit=:dbunit";
        Map<String, Object> reduceMap = new HashMap<>();
        reduceMap.put("dbname", name);
        reduceMap.put("dbamount", amount);
        reduceMap.put("dbunit", unit);
        jdbcTemplate.update(reduceSQL, reduceMap);
    }

}
