package com.tangtao.gulimall.member.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.member.entity.IntegrationChangeHistoryEntity;
import com.tangtao.gulimall.member.service.IntegrationChangeHistoryService;


/**
 * 积分变化历史记录
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:42:13
 */
@RestController
@RequestMapping("member/integrationchangehistory")
public class IntegrationChangeHistoryController {
    @Autowired
    private IntegrationChangeHistoryService integrationChangeHistoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody IntegrationChangeHistoryEntity params){
        IPage page = integrationChangeHistoryService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(integrationChangeHistoryService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody IntegrationChangeHistoryEntity integrationChangeHistory){
        return R.succeed(integrationChangeHistoryService.save(integrationChangeHistory));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody IntegrationChangeHistoryEntity integrationChangeHistory){
        return R.succeed(integrationChangeHistoryService.updateById(integrationChangeHistory));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(integrationChangeHistoryService.removeByIds(Arrays.asList(ids)));
    }

}
