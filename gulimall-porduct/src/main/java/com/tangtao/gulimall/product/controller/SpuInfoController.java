package com.tangtao.gulimall.product.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.product.entity.SpuInfoEntity;
import com.tangtao.gulimall.product.service.SpuInfoService;


/**
 * spu信息
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:52:06
 */
@RestController
@RequestMapping("product/spuinfo")
public class SpuInfoController {
    @Autowired
    private SpuInfoService spuInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody SpuInfoEntity params){
        IPage page = spuInfoService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(spuInfoService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SpuInfoEntity spuInfo){
        return R.succeed(spuInfoService.save(spuInfo));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SpuInfoEntity spuInfo){
        return R.succeed(spuInfoService.updateById(spuInfo));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(spuInfoService.removeByIds(Arrays.asList(ids)));
    }

}
