package com.tangtao.gulimall.coupon.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.coupon.entity.CouponSpuRelationEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 优惠券与产品关联
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:14
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    IPage queryPage(PageParam pageParam);
}

