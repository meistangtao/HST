package com.tangtao.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import com.tangtao.gulimall.product.dao.SpuInfoDescDao;
import com.tangtao.gulimall.product.entity.SpuInfoDescEntity;
import com.tangtao.gulimall.product.service.SpuInfoDescService;
import org.springframework.stereotype.Service;


@Service("spuInfoDescService")
public class SpuInfoDescServiceImpl extends ServiceImpl<SpuInfoDescDao, SpuInfoDescEntity> implements SpuInfoDescService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<SpuInfoDescEntity> page = this.page(
                new QueryPageHandler<SpuInfoDescEntity>().getPage(params),
                new QueryWrapper<SpuInfoDescEntity>()
        );

       return page;
    }

}