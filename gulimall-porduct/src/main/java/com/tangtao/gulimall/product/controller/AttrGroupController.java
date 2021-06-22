package com.tangtao.gulimall.product.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.product.entity.AttrGroupEntity;
import com.tangtao.gulimall.product.service.AttrGroupService;


/**
 * 属性分组
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:52:08
 */
@RestController
@RequestMapping("product/attrgroup")
public class AttrGroupController {
    @Autowired
    private AttrGroupService attrGroupService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody AttrGroupEntity params){
        IPage page = attrGroupService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{attrGroupId}")
    public R info(@PathVariable("attrGroupId") Long attrGroupId){
        return R.succeed(attrGroupService.getById(attrGroupId));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody AttrGroupEntity attrGroup){
        return R.succeed(attrGroupService.save(attrGroup));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody AttrGroupEntity attrGroup){
        return R.succeed(attrGroupService.updateById(attrGroup));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] attrGroupIds){
        return R.succeed(attrGroupService.removeByIds(Arrays.asList(attrGroupIds)));
    }

}
