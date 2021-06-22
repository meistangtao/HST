package com.tangtao.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import com.tangtao.gulimall.product.dao.SkuInfoDao;
import com.tangtao.gulimall.product.entity.SkuInfoEntity;
import com.tangtao.gulimall.product.service.SkuInfoService;
import org.springframework.stereotype.Service;


@Service("skuInfoService")
public class SkuInfoServiceImpl extends ServiceImpl<SkuInfoDao, SkuInfoEntity> implements SkuInfoService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<SkuInfoEntity> page = this.page(
                new QueryPageHandler<SkuInfoEntity>().getPage(params),
                new QueryWrapper<SkuInfoEntity>()
        );

       return page;
    }

}