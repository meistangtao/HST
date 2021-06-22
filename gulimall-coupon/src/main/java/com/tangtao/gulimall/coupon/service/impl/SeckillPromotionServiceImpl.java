package com.tangtao.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.coupon.dao.SeckillPromotionDao;
import com.tangtao.gulimall.coupon.entity.SeckillPromotionEntity;
import com.tangtao.gulimall.coupon.service.SeckillPromotionService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("seckillPromotionService")
public class SeckillPromotionServiceImpl extends ServiceImpl<SeckillPromotionDao, SeckillPromotionEntity> implements SeckillPromotionService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<SeckillPromotionEntity> page = this.page(
                new QueryPageHandler<SeckillPromotionEntity>().getPage(params),
                new QueryWrapper<SeckillPromotionEntity>()
        );

       return page;
    }

}