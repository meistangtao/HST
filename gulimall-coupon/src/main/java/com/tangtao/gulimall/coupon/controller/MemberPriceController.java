package com.tangtao.gulimall.coupon.controller;

import com.tangtao.gulimall.coupon.entity.MemberPriceEntity;
import com.tangtao.gulimall.coupon.service.MemberPriceService;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


/**
 * 商品会员价格
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:12
 */
@RestController
@RequestMapping("coupon/memberprice")
public class MemberPriceController {
    @Autowired
    private MemberPriceService memberPriceService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody MemberPriceEntity params){
        return R.succeed(memberPriceService.queryPage(params));
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(memberPriceService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberPriceEntity memberPrice){
        return R.succeed(memberPriceService.save(memberPrice));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberPriceEntity memberPrice){
        return R.succeed(memberPriceService.updateById(memberPrice));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(memberPriceService.removeByIds(Arrays.asList(ids)));
    }

}
