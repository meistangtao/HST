package com.tangtao.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.coupon.dao.CouponDao;
import com.tangtao.gulimall.coupon.entity.CouponEntity;
import com.tangtao.gulimall.coupon.service.CouponService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("couponService")
public class CouponServiceImpl extends ServiceImpl<CouponDao, CouponEntity> implements CouponService {

    @Override
    public IPage queryPage(PageParam pageParam) {
        IPage<CouponEntity> page = this.page(
                new QueryPageHandler<CouponEntity>().getPage(pageParam),
                new QueryWrapper<CouponEntity>()
        );

        return page;
    }

}