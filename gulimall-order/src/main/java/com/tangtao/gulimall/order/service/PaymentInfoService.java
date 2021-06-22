package com.tangtao.gulimall.order.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.order.entity.PaymentInfoEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 支付信息表
 *
 * @author chenshun
 * @email tangtao@gmail.com
 * @date 2020-11-07 11:58:27
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    IPage queryPage(PageParam pageParam);
}

