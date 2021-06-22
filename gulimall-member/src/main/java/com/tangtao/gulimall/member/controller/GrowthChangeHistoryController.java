package com.tangtao.gulimall.member.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.member.entity.GrowthChangeHistoryEntity;
import com.tangtao.gulimall.member.service.GrowthChangeHistoryService;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


/**
 * 成长值变化历史记录
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:42:13
 */
@RestController
@RequestMapping("member/growthchangehistory")
public class GrowthChangeHistoryController {
    @Autowired
    private GrowthChangeHistoryService growthChangeHistoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody GrowthChangeHistoryEntity params){
        IPage page = growthChangeHistoryService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(growthChangeHistoryService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GrowthChangeHistoryEntity growthChangeHistory){
        return R.succeed(growthChangeHistoryService.save(growthChangeHistory));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GrowthChangeHistoryEntity growthChangeHistory){
        return R.succeed(growthChangeHistoryService.updateById(growthChangeHistory));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(growthChangeHistoryService.removeByIds(Arrays.asList(ids)));
    }

}
