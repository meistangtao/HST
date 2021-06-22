package com.tangtao.gulimall.coupon.controller;

import com.tangtao.gulimall.coupon.entity.SeckillPromotionEntity;
import com.tangtao.gulimall.coupon.service.SeckillPromotionService;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


/**
 * 秒杀活动
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:13
 */
@RestController
@RequestMapping("coupon/seckillpromotion")
public class SeckillPromotionController {
    @Autowired
    private SeckillPromotionService seckillPromotionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody SeckillPromotionEntity params){
        return R.succeed(seckillPromotionService.queryPage(params));
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(seckillPromotionService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SeckillPromotionEntity seckillPromotion){
        return R.succeed(seckillPromotionService.save(seckillPromotion));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SeckillPromotionEntity seckillPromotion){
        return R.succeed(seckillPromotionService.updateById(seckillPromotion));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(seckillPromotionService.removeByIds(Arrays.asList(ids)));
    }

}
