package com.tangtao.gulimall.member.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.member.entity.MemberLevelEntity;
import com.tangtao.gulimall.member.service.MemberLevelService;


/**
 * 会员等级
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:42:13
 */
@RestController
@RequestMapping("member/memberlevel")
public class MemberLevelController {
    @Autowired
    private MemberLevelService memberLevelService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody MemberLevelEntity params){
        IPage page = memberLevelService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(memberLevelService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberLevelEntity memberLevel){
        return R.succeed(memberLevelService.save(memberLevel));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberLevelEntity memberLevel){
        return R.succeed(memberLevelService.updateById(memberLevel));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(memberLevelService.removeByIds(Arrays.asList(ids)));
    }

}
