package com.tangtao.gulimall.member.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.member.entity.MemberLoginLogEntity;
import com.tangtao.gulimall.member.service.MemberLoginLogService;


/**
 * 会员登录记录
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:42:13
 */
@RestController
@RequestMapping("member/memberloginlog")
public class MemberLoginLogController {
    @Autowired
    private MemberLoginLogService memberLoginLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody MemberLoginLogEntity params){
        IPage page = memberLoginLogService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(memberLoginLogService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberLoginLogEntity memberLoginLog){
        return R.succeed(memberLoginLogService.save(memberLoginLog));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberLoginLogEntity memberLoginLog){
        return R.succeed(memberLoginLogService.updateById(memberLoginLog));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(memberLoginLogService.removeByIds(Arrays.asList(ids)));
    }

}
