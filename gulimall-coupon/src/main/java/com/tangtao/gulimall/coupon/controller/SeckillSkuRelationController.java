package com.tangtao.gulimall.coupon.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.coupon.entity.SeckillSkuRelationEntity;
import com.tangtao.gulimall.coupon.service.SeckillSkuRelationService;
import com.tangtao.gulimall.common.res.R;



/**
 * 秒杀活动商品关联
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:13
 */
@RestController
@RequestMapping("coupon/seckillskurelation")
public class SeckillSkuRelationController {
    @Autowired
    private SeckillSkuRelationService seckillSkuRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody SeckillSkuRelationEntity params){
        return R.succeed(seckillSkuRelationService.queryPage(params));
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(seckillSkuRelationService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SeckillSkuRelationEntity seckillSkuRelation){
        return R.succeed(seckillSkuRelationService.save(seckillSkuRelation));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SeckillSkuRelationEntity seckillSkuRelation){
        return R.succeed(seckillSkuRelationService.updateById(seckillSkuRelation));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(seckillSkuRelationService.removeByIds(Arrays.asList(ids)));
    }

}
