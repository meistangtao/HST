package com.tangtao.gulimall.coupon.controller;

import com.tangtao.gulimall.coupon.entity.CouponHistoryEntity;
import com.tangtao.gulimall.coupon.service.CouponHistoryService;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;



/**
 * 优惠券领取历史记录
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:13
 */
@RestController
@RequestMapping("coupon/couponhistory")
public class CouponHistoryController {
    @Autowired
    private CouponHistoryService couponHistoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody CouponHistoryEntity params){

        return R.succeed(couponHistoryService.queryPage(params));
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		CouponHistoryEntity couponHistory = couponHistoryService.getById(id);

        return R.succeed(couponHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CouponHistoryEntity couponHistory){
        return R.succeed(couponHistoryService.save(couponHistory));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CouponHistoryEntity couponHistory){
        return R.succeed(couponHistoryService.updateById(couponHistory));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){

        return R.succeed(couponHistoryService.removeByIds(Arrays.asList(ids)));
    }

}
