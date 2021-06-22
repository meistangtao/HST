package com.tangtao.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.coupon.dao.CouponHistoryDao;
import com.tangtao.gulimall.coupon.entity.CouponHistoryEntity;
import com.tangtao.gulimall.coupon.service.CouponHistoryService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("couponHistoryService")
public class CouponHistoryServiceImpl extends ServiceImpl<CouponHistoryDao, CouponHistoryEntity> implements CouponHistoryService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<CouponHistoryEntity> page = this.page(
                new QueryPageHandler<CouponHistoryEntity>().getPage(params),
                new QueryWrapper<CouponHistoryEntity>()
        );

        return page;
    }

}