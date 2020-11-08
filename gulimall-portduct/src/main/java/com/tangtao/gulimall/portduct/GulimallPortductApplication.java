package com.tangtao.gulimall.portduct;

import com.tangtao.gulimall.utils.ConfPropHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@MapperScan("com.tangtao.gulimall.portduct.dao")
@EnableDiscoveryClient
@Import(value = {ConfPropHelper.class})
public class GulimallPortductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallPortductApplication.class, args);
    }

}
