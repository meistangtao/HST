package com.tangtao.gulimall.coupon.controller;

import com.tangtao.gulimall.coupon.entity.SeckillSessionEntity;
import com.tangtao.gulimall.coupon.service.SeckillSessionService;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


/**
 * 秒杀活动场次
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:13
 */
@RestController
@RequestMapping("coupon/seckillsession")
public class SeckillSessionController {
    @Autowired
    private SeckillSessionService seckillSessionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody SeckillSessionEntity params){
        return R.succeed(seckillSessionService.queryPage(params));
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(seckillSessionService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SeckillSessionEntity seckillSession){
        return R.succeed(seckillSessionService.save(seckillSession));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SeckillSessionEntity seckillSession){
        return R.succeed(seckillSessionService.updateById(seckillSession));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(seckillSessionService.removeByIds(Arrays.asList(ids)));
    }

}
