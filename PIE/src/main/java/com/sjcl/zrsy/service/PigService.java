package com.sjcl.zrsy.service;

import com.sjcl.zrsy.dao.PigDao;
import com.sjcl.zrsy.domain.MarketREC;
import com.sjcl.zrsy.service.implement.IPigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PigService implements IPigService {
    @Autowired
    private PigDao pigDao;

    @Override
    public void insertBirth(MarketREC marketRec){
        pigDao.insertMR(marketRec);
    }
}
