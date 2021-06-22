package com.tangtao.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.coupon.dao.SpuBoundsDao;
import com.tangtao.gulimall.coupon.entity.SpuBoundsEntity;
import com.tangtao.gulimall.coupon.service.SpuBoundsService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("spuBoundsService")
public class SpuBoundsServiceImpl extends ServiceImpl<SpuBoundsDao, SpuBoundsEntity> implements SpuBoundsService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<SpuBoundsEntity> page = this.page(
                new QueryPageHandler<SpuBoundsEntity>().getPage(params),
                new QueryWrapper<SpuBoundsEntity>()
        );

       return page;
    }

}