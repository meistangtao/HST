package com.tangtao.gulimall.coupon.controller;

import com.tangtao.gulimall.coupon.entity.HomeSubjectSpuEntity;
import com.tangtao.gulimall.coupon.service.HomeSubjectSpuService;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;



/**
 * 专题商品
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:12
 */
@RestController
@RequestMapping("coupon/homesubjectspu")
public class HomeSubjectSpuController {
    @Autowired
    private HomeSubjectSpuService homeSubjectSpuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody HomeSubjectSpuEntity params){
        return R.succeed(homeSubjectSpuService.queryPage(params));
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(homeSubjectSpuService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HomeSubjectSpuEntity homeSubjectSpu){
        return R.succeed(homeSubjectSpuService.save(homeSubjectSpu));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HomeSubjectSpuEntity homeSubjectSpu){
        return R.succeed(homeSubjectSpuService.updateById(homeSubjectSpu));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(homeSubjectSpuService.removeByIds(Arrays.asList(ids)));
    }

}
