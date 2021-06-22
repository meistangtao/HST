package com.tangtao.gulimall.product.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.product.entity.SkuImagesEntity;
import com.tangtao.gulimall.product.service.SkuImagesService;


/**
 * sku图片
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:52:07
 */
@RestController
@RequestMapping("product/skuimages")
public class SkuImagesController {
    @Autowired
    private SkuImagesService skuImagesService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody SkuImagesEntity params){
        IPage page = skuImagesService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(skuImagesService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SkuImagesEntity skuImages){
        return R.succeed(skuImagesService.save(skuImages));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SkuImagesEntity skuImages){
        return R.succeed(skuImagesService.updateById(skuImages));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(skuImagesService.removeByIds(Arrays.asList(ids)));
    }

}
