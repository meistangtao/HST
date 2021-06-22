package com.tangtao.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import com.tangtao.gulimall.product.dao.AttrDao;
import com.tangtao.gulimall.product.entity.AttrEntity;
import com.tangtao.gulimall.product.service.AttrService;
import org.springframework.stereotype.Service;


@Service("attrService")
public class AttrServiceImpl extends ServiceImpl<AttrDao, AttrEntity> implements AttrService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<AttrEntity> page = this.page(
                new QueryPageHandler<AttrEntity>().getPage(params),
                new QueryWrapper<AttrEntity>()
        );

       return page;
    }

}