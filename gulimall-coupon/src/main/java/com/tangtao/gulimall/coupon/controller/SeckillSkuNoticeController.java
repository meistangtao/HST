package com.tangtao.gulimall.coupon.controller;

import com.tangtao.gulimall.coupon.entity.SeckillSkuNoticeEntity;
import com.tangtao.gulimall.coupon.service.SeckillSkuNoticeService;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;



/**
 * 秒杀商品通知订阅
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:13
 */
@RestController
@RequestMapping("coupon/seckillskunotice")
public class SeckillSkuNoticeController {
    @Autowired
    private SeckillSkuNoticeService seckillSkuNoticeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody SeckillSkuNoticeEntity params){
        return R.succeed(seckillSkuNoticeService.queryPage(params));
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(seckillSkuNoticeService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SeckillSkuNoticeEntity seckillSkuNotice){
        return R.succeed(seckillSkuNoticeService.save(seckillSkuNotice));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SeckillSkuNoticeEntity seckillSkuNotice){
        return R.succeed(seckillSkuNoticeService.updateById(seckillSkuNotice));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(seckillSkuNoticeService.removeByIds(Arrays.asList(ids)));
    }

}
