package com.tangtao.gulimall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.order.dao.OrderReturnApplyDao;
import com.tangtao.gulimall.order.entity.OrderReturnApplyEntity;
import com.tangtao.gulimall.order.service.OrderReturnApplyService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("orderReturnApplyService")
public class OrderReturnApplyServiceImpl extends ServiceImpl<OrderReturnApplyDao, OrderReturnApplyEntity> implements OrderReturnApplyService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<OrderReturnApplyEntity> page = this.page(
                new QueryPageHandler<OrderReturnApplyEntity>().getPage(params),
                new QueryWrapper<OrderReturnApplyEntity>()
        );

       return page;
    }

}