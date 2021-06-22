package com.tangtao.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import com.tangtao.gulimall.product.dao.SkuSaleAttrValueDao;
import com.tangtao.gulimall.product.entity.SkuSaleAttrValueEntity;
import com.tangtao.gulimall.product.service.SkuSaleAttrValueService;
import org.springframework.stereotype.Service;


@Service("skuSaleAttrValueService")
public class SkuSaleAttrValueServiceImpl extends ServiceImpl<SkuSaleAttrValueDao, SkuSaleAttrValueEntity> implements SkuSaleAttrValueService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<SkuSaleAttrValueEntity> page = this.page(
                new QueryPageHandler<SkuSaleAttrValueEntity>().getPage(params),
                new QueryWrapper<SkuSaleAttrValueEntity>()
        );

       return page;
    }

}