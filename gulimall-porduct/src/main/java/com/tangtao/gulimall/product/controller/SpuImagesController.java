package com.tangtao.gulimall.product.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.product.entity.SpuImagesEntity;
import com.tangtao.gulimall.product.service.SpuImagesService;


/**
 * spu图片
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:52:07
 */
@RestController
@RequestMapping("product/spuimages")
public class SpuImagesController {
    @Autowired
    private SpuImagesService spuImagesService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody SpuImagesEntity params){
        IPage page = spuImagesService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(spuImagesService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SpuImagesEntity spuImages){
        return R.succeed(spuImagesService.save(spuImages));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SpuImagesEntity spuImages){
        return R.succeed(spuImagesService.updateById(spuImages));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(spuImagesService.removeByIds(Arrays.asList(ids)));
    }

}
