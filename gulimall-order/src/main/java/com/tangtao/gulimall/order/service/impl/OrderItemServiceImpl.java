package com.tangtao.gulimall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.order.dao.OrderItemDao;
import com.tangtao.gulimall.order.entity.OrderItemEntity;
import com.tangtao.gulimall.order.service.OrderItemService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("orderItemService")
public class OrderItemServiceImpl extends ServiceImpl<OrderItemDao, OrderItemEntity> implements OrderItemService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<OrderItemEntity> page = this.page(
                new QueryPageHandler<OrderItemEntity>().getPage(params),
                new QueryWrapper<OrderItemEntity>()
        );

       return page;
    }

}