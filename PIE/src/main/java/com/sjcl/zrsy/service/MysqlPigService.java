package com.sjcl.zrsy.service;

import com.sjcl.zrsy.domain.MarketREC;
import com.sjcl.zrsy.service.implement.IPigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class MysqlPigService implements IPigService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void insertBirth(MarketREC market_rec) {
//         jdbcTemplate.update("insert into pig_birth (Id, Birthday, Breed, Gender, Weight) values  (?, ?, ?, ?, ?)",newpig.getId(), newpig.getDate(), newpig.getBreed(), newpig.getGender(), newpig.getWeight());
    }
}
