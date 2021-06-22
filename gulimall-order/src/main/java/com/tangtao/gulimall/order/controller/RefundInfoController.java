package com.tangtao.gulimall.order.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.order.entity.RefundInfoEntity;
import com.tangtao.gulimall.order.service.RefundInfoService;


/**
 * 退款信息
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:47:20
 */
@RestController
@RequestMapping("order/refundinfo")
public class RefundInfoController {
    @Autowired
    private RefundInfoService refundInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody RefundInfoEntity params){
        IPage page = refundInfoService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(refundInfoService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RefundInfoEntity refundInfo){
        return R.succeed(refundInfoService.save(refundInfo));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody RefundInfoEntity refundInfo){
        return R.succeed(refundInfoService.updateById(refundInfo));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(refundInfoService.removeByIds(Arrays.asList(ids)));
    }

}
