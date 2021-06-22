package com.tangtao.gulimall.coupon.service.impl;

import com.tangtao.gulimall.common.param.PageParam;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.common.param.QueryPageHandler;

import com.tangtao.gulimall.coupon.dao.HomeAdvDao;
import com.tangtao.gulimall.coupon.entity.HomeAdvEntity;
import com.tangtao.gulimall.coupon.service.HomeAdvService;


@Service("homeAdvService")
public class HomeAdvServiceImpl extends ServiceImpl<HomeAdvDao, HomeAdvEntity> implements HomeAdvService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<HomeAdvEntity> page = this.page(
                new QueryPageHandler<HomeAdvEntity>().getPage(params),
                new QueryWrapper<HomeAdvEntity>()
        );

        return page;
    }

}