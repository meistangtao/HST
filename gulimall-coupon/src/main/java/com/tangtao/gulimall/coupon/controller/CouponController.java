package com.tangtao.gulimall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import com.tangtao.gulimall.coupon.entity.CouponEntity;
import com.tangtao.gulimall.coupon.service.CouponService;
import com.tangtao.gulimall.utils.ConfPropHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import com.tangtao.gulimall.utils.PageUtils;
import com.tangtao.gulimall.utils.R;



/**
 * 优惠券信息
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:13
 */
@RefreshScope
@RestController
@RequestMapping("coupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    /**
     * 列表
     */
    @GetMapping
    public R list(){
        return R.ok().put("name", ConfPropHelper.getString("coupon.name-tangtao"));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
