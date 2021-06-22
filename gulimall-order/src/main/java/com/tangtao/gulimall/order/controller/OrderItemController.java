package com.tangtao.gulimall.order.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.order.entity.OrderItemEntity;
import com.tangtao.gulimall.order.service.OrderItemService;


/**
 * 订单项信息
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:47:21
 */
@RestController
@RequestMapping("order/orderitem")
public class OrderItemController {
    @Autowired
    private OrderItemService orderItemService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody OrderItemEntity params){
        IPage page = orderItemService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(orderItemService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody OrderItemEntity orderItem){
        return R.succeed(orderItemService.save(orderItem));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody OrderItemEntity orderItem){
        return R.succeed(orderItemService.updateById(orderItem));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(orderItemService.removeByIds(Arrays.asList(ids)));
    }

}
