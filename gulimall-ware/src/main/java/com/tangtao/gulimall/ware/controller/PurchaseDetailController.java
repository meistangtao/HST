package com.tangtao.gulimall.ware.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.ware.entity.PurchaseDetailEntity;
import com.tangtao.gulimall.ware.service.PurchaseDetailService;


/**
 * 
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 12:32:36
 */
@RestController
@RequestMapping("ware/purchasedetail")
public class PurchaseDetailController {
    @Autowired
    private PurchaseDetailService purchaseDetailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody PurchaseDetailEntity params){
        IPage page = purchaseDetailService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(purchaseDetailService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PurchaseDetailEntity purchaseDetail){
        return R.succeed(purchaseDetailService.save(purchaseDetail));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PurchaseDetailEntity purchaseDetail){
        return R.succeed(purchaseDetailService.updateById(purchaseDetail));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(purchaseDetailService.removeByIds(Arrays.asList(ids)));
    }

}
