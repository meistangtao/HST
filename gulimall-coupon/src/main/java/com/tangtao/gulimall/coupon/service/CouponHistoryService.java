package com.tangtao.gulimall.coupon.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.coupon.entity.CouponHistoryEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 优惠券领取历史记录
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:13
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    IPage queryPage(PageParam pageParam);
}

