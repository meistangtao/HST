package com.tangtao.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import com.tangtao.gulimall.product.dao.CommentReplayDao;
import com.tangtao.gulimall.product.entity.CommentReplayEntity;
import com.tangtao.gulimall.product.service.CommentReplayService;
import org.springframework.stereotype.Service;


@Service("commentReplayService")
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayDao, CommentReplayEntity> implements CommentReplayService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<CommentReplayEntity> page = this.page(
                new QueryPageHandler<CommentReplayEntity>().getPage(params),
                new QueryWrapper<CommentReplayEntity>()
        );

       return page;
    }

}