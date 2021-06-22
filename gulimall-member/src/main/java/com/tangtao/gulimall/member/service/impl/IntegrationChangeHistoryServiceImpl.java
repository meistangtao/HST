package com.tangtao.gulimall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.member.dao.IntegrationChangeHistoryDao;
import com.tangtao.gulimall.member.entity.IntegrationChangeHistoryEntity;
import com.tangtao.gulimall.member.service.IntegrationChangeHistoryService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("integrationChangeHistoryService")
public class IntegrationChangeHistoryServiceImpl extends ServiceImpl<IntegrationChangeHistoryDao, IntegrationChangeHistoryEntity> implements IntegrationChangeHistoryService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<IntegrationChangeHistoryEntity> page = this.page(
                new QueryPageHandler<IntegrationChangeHistoryEntity>().getPage(params),
                new QueryWrapper<IntegrationChangeHistoryEntity>()
        );

       return page;
    }

}