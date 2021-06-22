package com.tangtao.gulimall.ware.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.ware.entity.WareOrderTaskDetailEntity;
import com.tangtao.gulimall.ware.service.WareOrderTaskDetailService;


/**
 * 库存工作单
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 12:32:36
 */
@RestController
@RequestMapping("ware/wareordertaskdetail")
public class WareOrderTaskDetailController {
    @Autowired
    private WareOrderTaskDetailService wareOrderTaskDetailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody WareOrderTaskDetailEntity params){
        IPage page = wareOrderTaskDetailService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(wareOrderTaskDetailService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WareOrderTaskDetailEntity wareOrderTaskDetail){
        return R.succeed(wareOrderTaskDetailService.save(wareOrderTaskDetail));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WareOrderTaskDetailEntity wareOrderTaskDetail){
        return R.succeed(wareOrderTaskDetailService.updateById(wareOrderTaskDetail));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(wareOrderTaskDetailService.removeByIds(Arrays.asList(ids)));
    }

}
