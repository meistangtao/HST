package com.tangtao.gulimall.coupon.controller;

import com.tangtao.gulimall.coupon.entity.HomeAdvEntity;
import com.tangtao.gulimall.coupon.service.HomeAdvService;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


/**
 * 首页轮播广告
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:14
 */
@RestController
@RequestMapping("coupon/homeadv")
public class HomeAdvController {
    @Autowired
    private HomeAdvService homeAdvService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody HomeAdvEntity params){
        return R.succeed(homeAdvService.queryPage(params));
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(homeAdvService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HomeAdvEntity homeAdv){
        return R.succeed(homeAdvService.save(homeAdv));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HomeAdvEntity homeAdv){
        return R.succeed(homeAdvService.updateById(homeAdv));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(homeAdvService.removeByIds(Arrays.asList(ids)));
    }

}
