package com.tangtao.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import com.tangtao.gulimall.product.dao.SpuImagesDao;
import com.tangtao.gulimall.product.entity.SpuImagesEntity;
import com.tangtao.gulimall.product.service.SpuImagesService;
import org.springframework.stereotype.Service;


@Service("spuImagesService")
public class SpuImagesServiceImpl extends ServiceImpl<SpuImagesDao, SpuImagesEntity> implements SpuImagesService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<SpuImagesEntity> page = this.page(
                new QueryPageHandler<SpuImagesEntity>().getPage(params),
                new QueryWrapper<SpuImagesEntity>()
        );

       return page;
    }

}