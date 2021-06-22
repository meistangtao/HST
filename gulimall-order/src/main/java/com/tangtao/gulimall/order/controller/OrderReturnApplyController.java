package com.tangtao.gulimall.order.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.order.entity.OrderReturnApplyEntity;
import com.tangtao.gulimall.order.service.OrderReturnApplyService;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


/**
 * 订单退货申请
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:47:21
 */
@RestController
@RequestMapping("order/orderreturnapply")
public class OrderReturnApplyController {
    @Autowired
    private OrderReturnApplyService orderReturnApplyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody OrderReturnApplyEntity params){
        IPage page = orderReturnApplyService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(orderReturnApplyService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody OrderReturnApplyEntity orderReturnApply){
        return R.succeed(orderReturnApplyService.save(orderReturnApply));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody OrderReturnApplyEntity orderReturnApply){
        return R.succeed(orderReturnApplyService.updateById(orderReturnApply));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(orderReturnApplyService.removeByIds(Arrays.asList(ids)));
    }

}
