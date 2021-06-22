package com.tangtao.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import com.tangtao.gulimall.ware.dao.PurchaseDetailDao;
import com.tangtao.gulimall.ware.entity.PurchaseDetailEntity;
import com.tangtao.gulimall.ware.service.PurchaseDetailService;
import org.springframework.stereotype.Service;


@Service("purchaseDetailService")
public class PurchaseDetailServiceImpl extends ServiceImpl<PurchaseDetailDao, PurchaseDetailEntity> implements PurchaseDetailService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<PurchaseDetailEntity> page = this.page(
                new QueryPageHandler<PurchaseDetailEntity>().getPage(params),
                new QueryWrapper<PurchaseDetailEntity>()
        );

       return page;
    }

}