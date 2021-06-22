package com.tangtao.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import com.tangtao.gulimall.product.dao.AttrAttrgroupRelationDao;
import com.tangtao.gulimall.product.entity.AttrAttrgroupRelationEntity;
import com.tangtao.gulimall.product.service.AttrAttrgroupRelationService;
import org.springframework.stereotype.Service;


@Service("attrAttrgroupRelationService")
public class AttrAttrgroupRelationServiceImpl extends ServiceImpl<AttrAttrgroupRelationDao, AttrAttrgroupRelationEntity> implements AttrAttrgroupRelationService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<AttrAttrgroupRelationEntity> page = this.page(
                new QueryPageHandler<AttrAttrgroupRelationEntity>().getPage(params),
                new QueryWrapper<AttrAttrgroupRelationEntity>()
        );

       return page;
    }

}