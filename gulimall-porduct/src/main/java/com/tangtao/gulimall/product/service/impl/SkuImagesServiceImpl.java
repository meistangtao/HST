package com.tangtao.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import com.tangtao.gulimall.product.dao.SkuImagesDao;
import com.tangtao.gulimall.product.entity.SkuImagesEntity;
import com.tangtao.gulimall.product.service.SkuImagesService;
import org.springframework.stereotype.Service;


@Service("skuImagesService")
public class SkuImagesServiceImpl extends ServiceImpl<SkuImagesDao, SkuImagesEntity> implements SkuImagesService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<SkuImagesEntity> page = this.page(
                new QueryPageHandler<SkuImagesEntity>().getPage(params),
                new QueryWrapper<SkuImagesEntity>()
        );

       return page;
    }

}