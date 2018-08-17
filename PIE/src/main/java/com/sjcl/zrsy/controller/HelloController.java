package com.sjcl.zrsy.controller;

import com.sjcl.zrsy.domain.Pig_Birth;
import com.sjcl.zrsy.service.implement.IPigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @Autowired
    IPigService pigService;

    @PostMapping("/pb")
    public void pb(@RequestBody Pig_Birth newpig){

     //  pigService.insertBirth(newpig);
        //jdbcTemplate.update("insert into pigbirth (id, birthday, breed, gender, weight) values  (?, ?, ?, ?, ?)", newpig.getId(), newpig.getDate(), newpig.getBreed(), newpig.getGender(), newpig.getWeight());
    }



//    @GetMapping("/delete")
//    public int delete() {
//
//
//        return jdbcTemplate.update("delete from pigbirth where pigid = \"11\"");
//
//    }
//
//    @PostMapping("/hello")
//    public User hello() {
//        return new User("liweibo", "123");
//    }
//
//    @PostMapping("/test")
//    public String test(){
//        return "hello";
//    }
//
//    @PostMapping("/insert")
//    public String insert(@RequestBody User user) {
//        jdbcTemplate.update("insert into users (username, passwd) values  (?, ?)", user.getUsername(), user.getPassword());
//        return "更新数据库成功";
//    }

}
