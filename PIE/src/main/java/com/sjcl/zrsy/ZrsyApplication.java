package com.sjcl.zrsy;

// import com.sjcl.zrsy.filter.RoleFilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZrsyApplication {


//    @Bean
//    public Filter roleFilter() {
//        return  new RoleFilter();
//    }

    public static void main(String[] args) {
        SpringApplication.run(ZrsyApplication.class, args);
    }
}
