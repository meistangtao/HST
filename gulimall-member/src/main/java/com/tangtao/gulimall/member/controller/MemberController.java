package com.tangtao.gulimall.member.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.member.entity.MemberEntity;
import com.tangtao.gulimall.member.service.MemberService;


/**
 * 会员
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:42:14
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody MemberEntity params){
        IPage page = memberService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(memberService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
        return R.succeed(memberService.save(member));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
        return R.succeed(memberService.updateById(member));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(memberService.removeByIds(Arrays.asList(ids)));
    }

}
