package com.tangtao.gulimall.ware.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.ware.entity.WareOrderTaskEntity;
import com.tangtao.gulimall.ware.service.WareOrderTaskService;


/**
 * 库存工作单
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 12:32:36
 */
@RestController
@RequestMapping("ware/wareordertask")
public class WareOrderTaskController {
    @Autowired
    private WareOrderTaskService wareOrderTaskService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody WareOrderTaskEntity params){
        IPage page = wareOrderTaskService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(wareOrderTaskService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WareOrderTaskEntity wareOrderTask){
        return R.succeed(wareOrderTaskService.save(wareOrderTask));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WareOrderTaskEntity wareOrderTask){
        return R.succeed(wareOrderTaskService.updateById(wareOrderTask));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(wareOrderTaskService.removeByIds(Arrays.asList(ids)));
    }

}
