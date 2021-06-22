package com.tangtao.gulimall.member.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.member.entity.MemberReceiveAddressEntity;
import com.tangtao.gulimall.member.service.MemberReceiveAddressService;


/**
 * 会员收货地址
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:42:13
 */
@RestController
@RequestMapping("member/memberreceiveaddress")
public class MemberReceiveAddressController {
    @Autowired
    private MemberReceiveAddressService memberReceiveAddressService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody MemberReceiveAddressEntity params){
        IPage page = memberReceiveAddressService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(memberReceiveAddressService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberReceiveAddressEntity memberReceiveAddress){
        return R.succeed(memberReceiveAddressService.save(memberReceiveAddress));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberReceiveAddressEntity memberReceiveAddress){
        return R.succeed(memberReceiveAddressService.updateById(memberReceiveAddress));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(memberReceiveAddressService.removeByIds(Arrays.asList(ids)));
    }

}
