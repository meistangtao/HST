package com.tangtao.gulimall.member.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.member.entity.MemberStatisticsInfoEntity;
import com.tangtao.gulimall.member.service.MemberStatisticsInfoService;


/**
 * 会员统计信息
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:42:13
 */
@RestController
@RequestMapping("member/memberstatisticsinfo")
public class MemberStatisticsInfoController {
    @Autowired
    private MemberStatisticsInfoService memberStatisticsInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody MemberStatisticsInfoEntity params){
        IPage page = memberStatisticsInfoService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(memberStatisticsInfoService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberStatisticsInfoEntity memberStatisticsInfo){
        return R.succeed(memberStatisticsInfoService.save(memberStatisticsInfo));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberStatisticsInfoEntity memberStatisticsInfo){
        return R.succeed(memberStatisticsInfoService.updateById(memberStatisticsInfo));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(memberStatisticsInfoService.removeByIds(Arrays.asList(ids)));
    }

}
