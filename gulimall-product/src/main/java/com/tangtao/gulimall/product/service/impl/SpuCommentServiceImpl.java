package com.tangtao.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import com.tangtao.gulimall.product.dao.SpuCommentDao;
import com.tangtao.gulimall.product.entity.SpuCommentEntity;
import com.tangtao.gulimall.product.service.SpuCommentService;
import org.springframework.stereotype.Service;


@Service("spuCommentService")
public class SpuCommentServiceImpl extends ServiceImpl<SpuCommentDao, SpuCommentEntity> implements SpuCommentService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<SpuCommentEntity> page = this.page(
                new QueryPageHandler<SpuCommentEntity>().getPage(params),
                new QueryWrapper<SpuCommentEntity>()
        );

       return page;
    }

}