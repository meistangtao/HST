package com.tangtao.gulimall.order.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.order.entity.OrderOperateHistoryEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 订单操作历史记录
 *
 * @author chenshun
 * @email tangtao@gmail.com
 * @date 2020-11-07 11:58:28
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    IPage queryPage(PageParam pageParam);
}

