package com.tangtao.gulimall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.order.dao.OrderDao;
import com.tangtao.gulimall.order.entity.OrderEntity;
import com.tangtao.gulimall.order.service.OrderService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("orderService")
public class OrderServiceImpl extends ServiceImpl<OrderDao, OrderEntity> implements OrderService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<OrderEntity> page = this.page(
                new QueryPageHandler<OrderEntity>().getPage(params),
                new QueryWrapper<OrderEntity>()
        );

       return page;
    }

}