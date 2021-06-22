package com.tangtao.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import com.tangtao.gulimall.ware.dao.PurchaseDao;
import com.tangtao.gulimall.ware.entity.PurchaseEntity;
import com.tangtao.gulimall.ware.service.PurchaseService;
import org.springframework.stereotype.Service;


@Service("purchaseService")
public class PurchaseServiceImpl extends ServiceImpl<PurchaseDao, PurchaseEntity> implements PurchaseService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<PurchaseEntity> page = this.page(
                new QueryPageHandler<PurchaseEntity>().getPage(params),
                new QueryWrapper<PurchaseEntity>()
        );

       return page;
    }

}