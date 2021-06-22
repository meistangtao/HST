package com.tangtao.gulimall.order.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.order.entity.OrderReturnReasonEntity;
import com.tangtao.gulimall.order.service.OrderReturnReasonService;


/**
 * 退货原因
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:47:20
 */
@RestController
@RequestMapping("order/orderreturnreason")
public class OrderReturnReasonController {
    @Autowired
    private OrderReturnReasonService orderReturnReasonService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody OrderReturnReasonEntity params){
        IPage page = orderReturnReasonService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(orderReturnReasonService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody OrderReturnReasonEntity orderReturnReason){
        return R.succeed(orderReturnReasonService.save(orderReturnReason));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody OrderReturnReasonEntity orderReturnReason){
        return R.succeed(orderReturnReasonService.updateById(orderReturnReason));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(orderReturnReasonService.removeByIds(Arrays.asList(ids)));
    }

}
