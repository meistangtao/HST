package com.tangtao.gulimall.portduct;

import com.tangtao.gulimall.portduct.service.BrandService;
import com.tangtao.gulimall.utils.Constant;
import com.tangtao.gulimall.utils.PageUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class GulimallPortductApplicationTests {


    @Resource
    private BrandService brandService;


    @Test
    void contextLoads() {
        Map<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(Constant.PAGE,"1");
        objectObjectHashMap.put(Constant.LIMIT,"10");
        PageUtils pageUtils = brandService.queryPage(objectObjectHashMap);

        System.out.println("pageUtils.getList() = " + pageUtils.getList());
    }

}
