package com.tangtao.gulimall.order.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.order.entity.OrderSettingEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 订单配置信息
 *
 * @author chenshun
 * @email tangtao@gmail.com
 * @date 2020-11-07 11:58:27
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    IPage queryPage(PageParam pageParam);
}

