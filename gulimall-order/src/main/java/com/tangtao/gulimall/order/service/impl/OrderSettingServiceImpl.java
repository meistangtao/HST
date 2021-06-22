package com.tangtao.gulimall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.order.dao.OrderSettingDao;
import com.tangtao.gulimall.order.entity.OrderSettingEntity;
import com.tangtao.gulimall.order.service.OrderSettingService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("orderSettingService")
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingDao, OrderSettingEntity> implements OrderSettingService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<OrderSettingEntity> page = this.page(
                new QueryPageHandler<OrderSettingEntity>().getPage(params),
                new QueryWrapper<OrderSettingEntity>()
        );

       return page;
    }

}