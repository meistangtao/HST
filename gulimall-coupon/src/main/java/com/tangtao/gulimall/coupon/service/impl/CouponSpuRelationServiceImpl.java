package com.tangtao.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.coupon.dao.CouponSpuRelationDao;
import com.tangtao.gulimall.coupon.entity.CouponSpuRelationEntity;
import com.tangtao.gulimall.coupon.service.CouponSpuRelationService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("couponSpuRelationService")
public class CouponSpuRelationServiceImpl extends ServiceImpl<CouponSpuRelationDao, CouponSpuRelationEntity> implements CouponSpuRelationService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<CouponSpuRelationEntity> page = this.page(
                new QueryPageHandler<CouponSpuRelationEntity>().getPage(params),
                new QueryWrapper<CouponSpuRelationEntity>()
        );

        return page;
    }

}