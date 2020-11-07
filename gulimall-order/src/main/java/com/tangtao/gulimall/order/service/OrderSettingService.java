package com.tangtao.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.utils.PageUtils;
import com.tangtao.gulimall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author chenshun
 * @email tangtao@gmail.com
 * @date 2020-11-07 11:58:27
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

