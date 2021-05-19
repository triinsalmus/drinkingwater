package com.example.drinkingwater.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PurposeRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public void addPurpose(String name, Integer amount, String unit) {
        String purposeSQL = "INSERT INTO purpose(name, purpose_amount, purpose_unit) VALUES (:dbname, :dbamount, :dbunit)";
        Map<String, Object> purposeMap = new HashMap<>();
        purposeMap.put("dbname", name);
        purposeMap.put("dbamount", amount);
        purposeMap.put("dbunit", unit);
        jdbcTemplate.update(purposeSQL, purposeMap);
    }

    public void deletePurpose(String name) {
        String deleteSQL = "DELETE FROM purpose WHERE name=:dbname";
        Map<String, Object> deleteMap = new HashMap<>();
        deleteMap.put("dbname", name);
        jdbcTemplate.update(deleteSQL, deleteMap);

    }

}
