package com.sjcl.zrsy.controller;

import com.sjcl.zrsy.domain.MarketREC;
import com.sjcl.zrsy.service.PigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PigController {
    @Autowired
    PigService pigService;

    @PostMapping("/MR")
    public void MR(@RequestBody MarketREC marketRec){
        pigService.insertBirth(marketRec);
    }
}
