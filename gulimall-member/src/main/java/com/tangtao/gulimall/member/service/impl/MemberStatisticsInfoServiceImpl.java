package com.tangtao.gulimall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.member.dao.MemberStatisticsInfoDao;
import com.tangtao.gulimall.member.entity.MemberStatisticsInfoEntity;
import com.tangtao.gulimall.member.service.MemberStatisticsInfoService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("memberStatisticsInfoService")
public class MemberStatisticsInfoServiceImpl extends ServiceImpl<MemberStatisticsInfoDao, MemberStatisticsInfoEntity> implements MemberStatisticsInfoService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<MemberStatisticsInfoEntity> page = this.page(
                new QueryPageHandler<MemberStatisticsInfoEntity>().getPage(params),
                new QueryWrapper<MemberStatisticsInfoEntity>()
        );

       return page;
    }

}