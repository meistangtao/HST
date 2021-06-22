package com.tangtao.gulimall.ware.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.ware.entity.WareInfoEntity;
import com.tangtao.gulimall.ware.service.WareInfoService;


/**
 * 仓库信息
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 12:32:36
 */
@RestController
@RequestMapping("ware/wareinfo")
public class WareInfoController {
    @Autowired
    private WareInfoService wareInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody WareInfoEntity params){
        IPage page = wareInfoService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(wareInfoService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WareInfoEntity wareInfo){
        return R.succeed(wareInfoService.save(wareInfo));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WareInfoEntity wareInfo){
        return R.succeed(wareInfoService.updateById(wareInfo));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(wareInfoService.removeByIds(Arrays.asList(ids)));
    }

}
