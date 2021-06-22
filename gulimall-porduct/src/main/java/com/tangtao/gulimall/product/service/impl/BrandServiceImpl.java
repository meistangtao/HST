package com.tangtao.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import com.tangtao.gulimall.product.dao.BrandDao;
import com.tangtao.gulimall.product.entity.BrandEntity;
import com.tangtao.gulimall.product.service.BrandService;
import org.springframework.stereotype.Service;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @Override
    public IPage queryPage(PageParam params) {

        IPage<BrandEntity> page = this.page(
                new QueryPageHandler<BrandEntity>().getPage(params),
                new QueryWrapper<BrandEntity>()
        );

       return page;
    }

}