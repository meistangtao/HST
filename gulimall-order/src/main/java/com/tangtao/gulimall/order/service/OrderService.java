package com.tangtao.gulimall.order.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.order.entity.OrderEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 订单
 *
 * @author chenshun
 * @email tangtao@gmail.com
 * @date 2020-11-07 11:58:28
 */
public interface OrderService extends IService<OrderEntity> {

    IPage queryPage(PageParam pageParam);
}

