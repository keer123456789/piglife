package com.sjcl.zrsy.dao;

import com.sjcl.zrsy.domain.MarketREC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PigDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertMR(MarketREC marketRec){
        String idA = marketRec.getIdArray();
        String date[]=idA.split(";");
        for (int i = 0; i < date.length; i++) {
            System.out.println(date[i]);
            jdbcTemplate.update("insert into pig_birth (Id1, Id2) values (?, ?)", date[i], marketRec.getMarketId());
        }
    }
}
