package com.tangtao.gulimall.product.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.product.entity.AttrEntity;
import com.tangtao.gulimall.product.service.AttrService;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;



/**
 * 商品属性
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:52:07
 */
@RestController
@RequestMapping("product/attr")
public class AttrController {
    @Autowired
    private AttrService attrService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody AttrEntity params){
        IPage page = attrService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{attrId}")
    public R info(@PathVariable("attrId") Long attrId){
        return R.succeed(attrService.getById(attrId));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody AttrEntity attr){
        return R.succeed(attrService.save(attr));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody AttrEntity attr){
        return R.succeed(attrService.updateById(attr));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] attrIds){
        return R.succeed(attrService.removeByIds(Arrays.asList(attrIds)));
    }

}
