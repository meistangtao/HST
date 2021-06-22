package com.tangtao.gulimall.coupon.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.coupon.entity.CouponSpuCategoryRelationEntity;
import com.tangtao.gulimall.coupon.service.CouponSpuCategoryRelationService;
import com.tangtao.gulimall.common.res.R;



/**
 * 优惠券分类关联
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:13
 */
@RestController
@RequestMapping("coupon/couponspucategoryrelation")
public class CouponSpuCategoryRelationController {
    @Autowired
    private CouponSpuCategoryRelationService couponSpuCategoryRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody CouponSpuCategoryRelationEntity params){
        return R.succeed( couponSpuCategoryRelationService.queryPage(params));
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(couponSpuCategoryRelationService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CouponSpuCategoryRelationEntity couponSpuCategoryRelation){
        return R.succeed(couponSpuCategoryRelationService.save(couponSpuCategoryRelation));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CouponSpuCategoryRelationEntity couponSpuCategoryRelation){ ;
        return R.succeed(couponSpuCategoryRelationService.updateById(couponSpuCategoryRelation));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){

        return R.succeed(couponSpuCategoryRelationService.removeByIds(Arrays.asList(ids)));
    }

}
