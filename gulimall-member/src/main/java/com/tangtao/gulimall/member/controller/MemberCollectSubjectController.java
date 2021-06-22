package com.tangtao.gulimall.member.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.member.entity.MemberCollectSubjectEntity;
import com.tangtao.gulimall.member.service.MemberCollectSubjectService;


/**
 * 会员收藏的专题活动
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:42:14
 */
@RestController
@RequestMapping("member/membercollectsubject")
public class MemberCollectSubjectController {
    @Autowired
    private MemberCollectSubjectService memberCollectSubjectService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody MemberCollectSubjectEntity params){
        IPage page = memberCollectSubjectService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(memberCollectSubjectService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberCollectSubjectEntity memberCollectSubject){
        return R.succeed(memberCollectSubjectService.save(memberCollectSubject));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberCollectSubjectEntity memberCollectSubject){
        return R.succeed(memberCollectSubjectService.updateById(memberCollectSubject));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(memberCollectSubjectService.removeByIds(Arrays.asList(ids)));
    }

}
