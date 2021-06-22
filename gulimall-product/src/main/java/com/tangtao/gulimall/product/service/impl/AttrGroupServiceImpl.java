package com.tangtao.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import com.tangtao.gulimall.product.dao.AttrGroupDao;
import com.tangtao.gulimall.product.entity.AttrGroupEntity;
import com.tangtao.gulimall.product.service.AttrGroupService;
import org.springframework.stereotype.Service;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<AttrGroupEntity> page = this.page(
                new QueryPageHandler<AttrGroupEntity>().getPage(params),
                new QueryWrapper<AttrGroupEntity>()
        );

       return page;
    }

}