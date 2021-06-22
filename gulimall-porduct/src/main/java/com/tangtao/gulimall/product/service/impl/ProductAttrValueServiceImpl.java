package com.tangtao.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import com.tangtao.gulimall.product.dao.ProductAttrValueDao;
import com.tangtao.gulimall.product.entity.ProductAttrValueEntity;
import com.tangtao.gulimall.product.service.ProductAttrValueService;
import org.springframework.stereotype.Service;


@Service("productAttrValueService")
public class ProductAttrValueServiceImpl extends ServiceImpl<ProductAttrValueDao, ProductAttrValueEntity> implements ProductAttrValueService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<ProductAttrValueEntity> page = this.page(
                new QueryPageHandler<ProductAttrValueEntity>().getPage(params),
                new QueryWrapper<ProductAttrValueEntity>()
        );

       return page;
    }

}