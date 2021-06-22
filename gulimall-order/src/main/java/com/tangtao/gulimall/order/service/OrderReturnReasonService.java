package com.tangtao.gulimall.order.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.order.entity.OrderReturnReasonEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 退货原因
 *
 * @author chenshun
 * @email tangtao@gmail.com
 * @date 2020-11-07 11:58:27
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    IPage queryPage(PageParam pageParam);
}

