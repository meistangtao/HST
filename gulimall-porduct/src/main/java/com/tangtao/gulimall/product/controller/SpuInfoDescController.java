package com.tangtao.gulimall.product.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.product.entity.SpuInfoDescEntity;
import com.tangtao.gulimall.product.service.SpuInfoDescService;


/**
 * spu信息介绍
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:52:07
 */
@RestController
@RequestMapping("product/spuinfodesc")
public class SpuInfoDescController {
    @Autowired
    private SpuInfoDescService spuInfoDescService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody SpuInfoDescEntity params){
        IPage page = spuInfoDescService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{spuId}")
    public R info(@PathVariable("spuId") Long spuId){
        return R.succeed(spuInfoDescService.getById(spuId));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SpuInfoDescEntity spuInfoDesc){
        return R.succeed(spuInfoDescService.save(spuInfoDesc));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SpuInfoDescEntity spuInfoDesc){
        return R.succeed(spuInfoDescService.updateById(spuInfoDesc));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] spuIds){
        return R.succeed(spuInfoDescService.removeByIds(Arrays.asList(spuIds)));
    }

}
