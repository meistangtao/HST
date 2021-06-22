package com.tangtao.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import com.tangtao.gulimall.ware.dao.WareSkuDao;
import com.tangtao.gulimall.ware.entity.WareSkuEntity;
import com.tangtao.gulimall.ware.service.WareSkuService;
import org.springframework.stereotype.Service;


@Service("wareSkuService")
public class WareSkuServiceImpl extends ServiceImpl<WareSkuDao, WareSkuEntity> implements WareSkuService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<WareSkuEntity> page = this.page(
                new QueryPageHandler<WareSkuEntity>().getPage(params),
                new QueryWrapper<WareSkuEntity>()
        );

       return page;
    }

}