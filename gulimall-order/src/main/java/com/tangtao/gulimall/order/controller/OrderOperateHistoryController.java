package com.tangtao.gulimall.order.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.order.entity.OrderOperateHistoryEntity;
import com.tangtao.gulimall.order.service.OrderOperateHistoryService;


/**
 * 订单操作历史记录
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:47:20
 */
@RestController
@RequestMapping("order/orderoperatehistory")
public class OrderOperateHistoryController {
    @Autowired
    private OrderOperateHistoryService orderOperateHistoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody OrderOperateHistoryEntity params){
        IPage page = orderOperateHistoryService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(orderOperateHistoryService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody OrderOperateHistoryEntity orderOperateHistory){
        return R.succeed(orderOperateHistoryService.save(orderOperateHistory));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody OrderOperateHistoryEntity orderOperateHistory){
        return R.succeed(orderOperateHistoryService.updateById(orderOperateHistory));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(orderOperateHistoryService.removeByIds(Arrays.asList(ids)));
    }

}
