package com.tangtao.gulimall.coupon.controller;

import com.tangtao.gulimall.common.res.R;
import com.tangtao.gulimall.coupon.entity.SpuBoundsEntity;
import com.tangtao.gulimall.coupon.service.SpuBoundsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;



/**
 * 商品spu积分设置
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:12
 */
@RestController
@RequestMapping("coupon/spubounds")
public class SpuBoundsController {
    @Autowired
    private SpuBoundsService spuBoundsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody SpuBoundsEntity params){
        return R.succeed(spuBoundsService.queryPage(params));
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){

        return R.succeed(spuBoundsService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SpuBoundsEntity spuBounds){
        return R.succeed(spuBoundsService.save(spuBounds));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SpuBoundsEntity spuBounds){
        return R.succeed(spuBoundsService.updateById(spuBounds));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(spuBoundsService.removeByIds(Arrays.asList(ids)));
    }

}
