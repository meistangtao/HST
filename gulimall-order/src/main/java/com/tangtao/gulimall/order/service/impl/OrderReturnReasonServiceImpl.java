package com.tangtao.gulimall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.order.dao.OrderReturnReasonDao;
import com.tangtao.gulimall.order.entity.OrderReturnReasonEntity;
import com.tangtao.gulimall.order.service.OrderReturnReasonService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("orderReturnReasonService")
public class OrderReturnReasonServiceImpl extends ServiceImpl<OrderReturnReasonDao, OrderReturnReasonEntity> implements OrderReturnReasonService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<OrderReturnReasonEntity> page = this.page(
                new QueryPageHandler<OrderReturnReasonEntity>().getPage(params),
                new QueryWrapper<OrderReturnReasonEntity>()
        );

       return page;
    }

}