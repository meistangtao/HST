package com.tangtao.gulimall.coupon.controller;

import com.tangtao.gulimall.coupon.entity.HomeSubjectEntity;
import com.tangtao.gulimall.coupon.service.HomeSubjectService;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;



/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:13
 */
@RestController
@RequestMapping("coupon/homesubject")
public class HomeSubjectController {
    @Autowired
    private HomeSubjectService homeSubjectService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody HomeSubjectEntity params){
        return R.succeed(homeSubjectService.queryPage(params));
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(homeSubjectService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HomeSubjectEntity homeSubject){
        return R.succeed(homeSubjectService.save(homeSubject));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HomeSubjectEntity homeSubject){
        return R.succeed(homeSubjectService.updateById(homeSubject));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(homeSubjectService.removeByIds(Arrays.asList(ids)));
    }

}
