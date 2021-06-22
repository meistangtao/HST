package com.tangtao.gulimall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.order.dao.PaymentInfoDao;
import com.tangtao.gulimall.order.entity.PaymentInfoEntity;
import com.tangtao.gulimall.order.service.PaymentInfoService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("paymentInfoService")
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoDao, PaymentInfoEntity> implements PaymentInfoService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<PaymentInfoEntity> page = this.page(
                new QueryPageHandler<PaymentInfoEntity>().getPage(params),
                new QueryWrapper<PaymentInfoEntity>()
        );

       return page;
    }

}