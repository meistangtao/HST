package com.tangtao.gulimall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.member.dao.GrowthChangeHistoryDao;
import com.tangtao.gulimall.member.entity.GrowthChangeHistoryEntity;
import com.tangtao.gulimall.member.service.GrowthChangeHistoryService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("growthChangeHistoryService")
public class GrowthChangeHistoryServiceImpl extends ServiceImpl<GrowthChangeHistoryDao, GrowthChangeHistoryEntity> implements GrowthChangeHistoryService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<GrowthChangeHistoryEntity> page = this.page(
                new QueryPageHandler<GrowthChangeHistoryEntity>().getPage(params),
                new QueryWrapper<GrowthChangeHistoryEntity>()
        );

       return page;
    }

}