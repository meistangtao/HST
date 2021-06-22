package com.tangtao.gulimall.coupon.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.coupon.entity.SkuFullReductionEntity;
import com.tangtao.gulimall.coupon.service.SkuFullReductionService;
import com.tangtao.gulimall.common.res.R;



/**
 * 商品满减信息
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:13
 */
@RestController
@RequestMapping("coupon/skufullreduction")
public class SkuFullReductionController {
    @Autowired
    private SkuFullReductionService skuFullReductionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody SkuFullReductionEntity params){
        return R.succeed(skuFullReductionService.queryPage(params));
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(skuFullReductionService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SkuFullReductionEntity skuFullReduction){
        return R.succeed(skuFullReductionService.save(skuFullReduction));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SkuFullReductionEntity skuFullReduction){
        return R.succeed(skuFullReductionService.updateById(skuFullReduction));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(skuFullReductionService.removeByIds(Arrays.asList(ids)));
    }

}
