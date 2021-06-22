package com.tangtao.gulimall.coupon.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.coupon.entity.SkuLadderEntity;
import com.tangtao.gulimall.coupon.service.SkuLadderService;
import com.tangtao.gulimall.common.res.R;



/**
 * 商品阶梯价格
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:12
 */
@RestController
@RequestMapping("coupon/skuladder")
public class SkuLadderController {
    @Autowired
    private SkuLadderService skuLadderService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody SkuLadderEntity params){
        return R.succeed(skuLadderService.queryPage(params));
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(skuLadderService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SkuLadderEntity skuLadder){
        return R.succeed(skuLadderService.save(skuLadder));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SkuLadderEntity skuLadder){
        return R.succeed(skuLadderService.updateById(skuLadder));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(skuLadderService.removeByIds(Arrays.asList(ids)));
    }

}
