package com.tangtao.gulimall.product.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.product.entity.SkuSaleAttrValueEntity;
import com.tangtao.gulimall.product.service.SkuSaleAttrValueService;


/**
 * sku销售属性&值
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:52:08
 */
@RestController
@RequestMapping("product/skusaleattrvalue")
public class SkuSaleAttrValueController {
    @Autowired
    private SkuSaleAttrValueService skuSaleAttrValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody SkuSaleAttrValueEntity params){
        IPage page = skuSaleAttrValueService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(skuSaleAttrValueService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SkuSaleAttrValueEntity skuSaleAttrValue){
        return R.succeed(skuSaleAttrValueService.save(skuSaleAttrValue));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SkuSaleAttrValueEntity skuSaleAttrValue){
        return R.succeed(skuSaleAttrValueService.updateById(skuSaleAttrValue));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(skuSaleAttrValueService.removeByIds(Arrays.asList(ids)));
    }

}
