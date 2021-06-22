package com.tangtao.gulimall.coupon.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.coupon.entity.MemberPriceEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 商品会员价格
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:12
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    IPage queryPage(PageParam pageParam);
}

