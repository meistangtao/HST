package com.tangtao.gulimall.coupon.controller;

import com.tangtao.gulimall.coupon.entity.CouponEntity;
import com.tangtao.gulimall.coupon.service.CouponService;
import com.tangtao.gulimall.common.env.ConfPropHelper;
import com.tangtao.gulimall.common.res.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;


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
@Api(value = "coupon/coupon", tags = "优惠券信息")
public class CouponController {
    @Resource
    private CouponService couponService;

    /**
     * 列表
     */
    @GetMapping
    @ApiOperation(value = "列表", response = R.class)
    public R list(){
        return R.succeed(ConfPropHelper.getString("coupon.name-tangtao"));
    }

    /**
     * 列表
     */
    @PostMapping("/list")
    @ApiOperation(value = "列表", response = R.class)
    public R list(@RequestBody @Validated @ApiParam CouponEntity pageParam){
        return R.succeed(couponService.queryPage(pageParam));
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    @ApiOperation(value = "信息", response = R.class)
    public R info(@ApiParam @PathVariable("id") Long id){
        return R.succeed(couponService.getById(id));
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    @ApiOperation(value = "保存", response = R.class)
    public R save(@RequestBody @ApiParam CouponEntity coupon){
        return R.succeed(couponService.save(coupon));
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改", response = R.class)
    public R update(@ApiParam @RequestBody CouponEntity coupon){
        return R.succeed(couponService.updateById(coupon));
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    @ApiOperation(value = "删除", response = R.class)
    public R delete(@ApiParam @RequestBody Long[] ids){
        return R.succeed(couponService.removeByIds(Arrays.asList(ids)));
    }

}
