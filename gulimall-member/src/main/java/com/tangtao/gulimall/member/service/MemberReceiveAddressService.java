package com.tangtao.gulimall.member.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.member.entity.MemberReceiveAddressEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 会员收货地址
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 14:03:01
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    IPage queryPage(PageParam pageParam);
}

