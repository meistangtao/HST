package com.tangtao.gulimall.product;

import com.tangtao.gulimall.product.service.BrandService;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GulimallPortductApplicationTests {


    @Resource
    private BrandService brandService;


    @Test
    void contextLoads() {
    }

}
