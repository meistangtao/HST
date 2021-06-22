package com.tangtao.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.tangtao.gulimall.common","com.tangtao.gulimall.coupon"})
@EnableDiscoveryClient
@MapperScan("com.tangtao.gulimall.coupon.dao")
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
