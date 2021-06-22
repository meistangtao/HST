package com.tangtao.gulimall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.order.dao.OrderOperateHistoryDao;
import com.tangtao.gulimall.order.entity.OrderOperateHistoryEntity;
import com.tangtao.gulimall.order.service.OrderOperateHistoryService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("orderOperateHistoryService")
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryDao, OrderOperateHistoryEntity> implements OrderOperateHistoryService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<OrderOperateHistoryEntity> page = this.page(
                new QueryPageHandler<OrderOperateHistoryEntity>().getPage(params),
                new QueryWrapper<OrderOperateHistoryEntity>()
        );

       return page;
    }

}