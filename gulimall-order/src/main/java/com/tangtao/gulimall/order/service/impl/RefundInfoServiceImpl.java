package com.tangtao.gulimall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.order.dao.RefundInfoDao;
import com.tangtao.gulimall.order.entity.RefundInfoEntity;
import com.tangtao.gulimall.order.service.RefundInfoService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("refundInfoService")
public class RefundInfoServiceImpl extends ServiceImpl<RefundInfoDao, RefundInfoEntity> implements RefundInfoService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<RefundInfoEntity> page = this.page(
                new QueryPageHandler<RefundInfoEntity>().getPage(params),
                new QueryWrapper<RefundInfoEntity>()
        );

       return page;
    }

}