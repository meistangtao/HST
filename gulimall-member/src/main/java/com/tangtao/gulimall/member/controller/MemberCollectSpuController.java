package com.tangtao.gulimall.member.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.member.entity.MemberCollectSpuEntity;
import com.tangtao.gulimall.member.service.MemberCollectSpuService;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


/**
 * 会员收藏的商品
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:42:14
 */
@RestController
@RequestMapping("member/membercollectspu")
public class MemberCollectSpuController {
    @Autowired
    private MemberCollectSpuService memberCollectSpuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody MemberCollectSpuEntity params){
        IPage page = memberCollectSpuService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(memberCollectSpuService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberCollectSpuEntity memberCollectSpu){
        return R.succeed(memberCollectSpuService.save(memberCollectSpu));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberCollectSpuEntity memberCollectSpu){
        return R.succeed(memberCollectSpuService.updateById(memberCollectSpu));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(memberCollectSpuService.removeByIds(Arrays.asList(ids)));
    }

}
