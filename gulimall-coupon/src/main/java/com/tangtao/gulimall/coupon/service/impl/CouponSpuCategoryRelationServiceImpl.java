package com.tangtao.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.coupon.dao.CouponSpuCategoryRelationDao;
import com.tangtao.gulimall.coupon.entity.CouponSpuCategoryRelationEntity;
import com.tangtao.gulimall.coupon.service.CouponSpuCategoryRelationService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("couponSpuCategoryRelationService")
public class CouponSpuCategoryRelationServiceImpl extends ServiceImpl<CouponSpuCategoryRelationDao, CouponSpuCategoryRelationEntity> implements CouponSpuCategoryRelationService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<CouponSpuCategoryRelationEntity> page = this.page(
                new QueryPageHandler<CouponSpuCategoryRelationEntity>().getPage(params),
                new QueryWrapper<CouponSpuCategoryRelationEntity>()
        );

        return page;
    }

}