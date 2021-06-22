package com.tangtao.gulimall.coupon.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.coupon.entity.CouponEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 优惠券信息
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:13
 */
public interface CouponService extends IService<CouponEntity> {

    IPage queryPage(PageParam pageParam);
}

