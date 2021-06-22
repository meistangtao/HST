package com.tangtao.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.coupon.dao.SeckillSkuRelationDao;
import com.tangtao.gulimall.coupon.entity.SeckillSkuRelationEntity;
import com.tangtao.gulimall.coupon.service.SeckillSkuRelationService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("seckillSkuRelationService")
public class SeckillSkuRelationServiceImpl extends ServiceImpl<SeckillSkuRelationDao, SeckillSkuRelationEntity> implements SeckillSkuRelationService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<SeckillSkuRelationEntity> page = this.page(
                new QueryPageHandler<SeckillSkuRelationEntity>().getPage(params),
                new QueryWrapper<SeckillSkuRelationEntity>()
        );

       return page;
    }

}