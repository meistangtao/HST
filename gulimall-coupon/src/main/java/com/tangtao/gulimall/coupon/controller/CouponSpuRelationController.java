package com.tangtao.gulimall.coupon.controller;

import com.tangtao.gulimall.coupon.entity.CouponSpuRelationEntity;
import com.tangtao.gulimall.coupon.service.CouponSpuRelationService;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;



/**
 * 优惠券与产品关联
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:14
 */
@RestController
@RequestMapping("coupon/couponspurelation")
public class CouponSpuRelationController {
    @Autowired
    private CouponSpuRelationService couponSpuRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody CouponSpuRelationEntity params){
        return R.succeed(couponSpuRelationService.queryPage(params));
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(couponSpuRelationService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CouponSpuRelationEntity couponSpuRelation){
        return R.succeed(couponSpuRelationService.save(couponSpuRelation));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CouponSpuRelationEntity couponSpuRelation){
        return R.succeed(couponSpuRelationService.updateById(couponSpuRelation));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(couponSpuRelationService.removeByIds(Arrays.asList(ids)));
    }

}
