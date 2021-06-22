package com.tangtao.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.coupon.dao.SeckillSessionDao;
import com.tangtao.gulimall.coupon.entity.SeckillSessionEntity;
import com.tangtao.gulimall.coupon.service.SeckillSessionService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("seckillSessionService")
public class SeckillSessionServiceImpl extends ServiceImpl<SeckillSessionDao, SeckillSessionEntity> implements SeckillSessionService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<SeckillSessionEntity> page = this.page(
                new QueryPageHandler<SeckillSessionEntity>().getPage(params),
                new QueryWrapper<SeckillSessionEntity>()
        );

       return page;
    }

}