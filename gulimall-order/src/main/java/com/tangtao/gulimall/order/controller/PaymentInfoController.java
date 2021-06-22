package com.tangtao.gulimall.order.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.order.entity.PaymentInfoEntity;
import com.tangtao.gulimall.order.service.PaymentInfoService;


/**
 * 支付信息表
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:47:20
 */
@RestController
@RequestMapping("order/paymentinfo")
public class PaymentInfoController {
    @Autowired
    private PaymentInfoService paymentInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody PaymentInfoEntity params){
        IPage page = paymentInfoService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(paymentInfoService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PaymentInfoEntity paymentInfo){
        return R.succeed(paymentInfoService.save(paymentInfo));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PaymentInfoEntity paymentInfo){
        return R.succeed(paymentInfoService.updateById(paymentInfo));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(paymentInfoService.removeByIds(Arrays.asList(ids)));
    }

}
