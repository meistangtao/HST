package com.tangtao.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import com.tangtao.gulimall.product.dao.SpuInfoDao;
import com.tangtao.gulimall.product.entity.SpuInfoEntity;
import com.tangtao.gulimall.product.service.SpuInfoService;
import org.springframework.stereotype.Service;


@Service("spuInfoService")
public class SpuInfoServiceImpl extends ServiceImpl<SpuInfoDao, SpuInfoEntity> implements SpuInfoService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<SpuInfoEntity> page = this.page(
                new QueryPageHandler<SpuInfoEntity>().getPage(params),
                new QueryWrapper<SpuInfoEntity>()
        );

       return page;
    }

}