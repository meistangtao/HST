package com.tangtao.gulimall.order.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.order.entity.OrderReturnApplyEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 订单退货申请
 *
 * @author chenshun
 * @email tangtao@gmail.com
 * @date 2020-11-07 11:58:28
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    IPage queryPage(PageParam pageParam);
}

