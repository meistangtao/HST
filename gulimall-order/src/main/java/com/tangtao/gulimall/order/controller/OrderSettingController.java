package com.tangtao.gulimall.order.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.order.entity.OrderSettingEntity;
import com.tangtao.gulimall.order.service.OrderSettingService;


/**
 * 订单配置信息
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:47:20
 */
@RestController
@RequestMapping("order/ordersetting")
public class OrderSettingController {
    @Autowired
    private OrderSettingService orderSettingService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody OrderSettingEntity params){
        IPage page = orderSettingService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(orderSettingService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody OrderSettingEntity orderSetting){
        return R.succeed(orderSettingService.save(orderSetting));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody OrderSettingEntity orderSetting){
        return R.succeed(orderSettingService.updateById(orderSetting));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(orderSettingService.removeByIds(Arrays.asList(ids)));
    }

}
