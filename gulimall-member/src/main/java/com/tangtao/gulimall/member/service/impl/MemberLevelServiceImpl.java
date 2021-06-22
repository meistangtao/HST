package com.tangtao.gulimall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.member.dao.MemberLevelDao;
import com.tangtao.gulimall.member.entity.MemberLevelEntity;
import com.tangtao.gulimall.member.service.MemberLevelService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("memberLevelService")
public class MemberLevelServiceImpl extends ServiceImpl<MemberLevelDao, MemberLevelEntity> implements MemberLevelService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<MemberLevelEntity> page = this.page(
                new QueryPageHandler<MemberLevelEntity>().getPage(params),
                new QueryWrapper<MemberLevelEntity>()
        );

       return page;
    }

}