package com.tangtao.gulimall.portduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tangtao.gulimall.portduct.dao")
public class GulimallPortductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallPortductApplication.class, args);
    }

}
