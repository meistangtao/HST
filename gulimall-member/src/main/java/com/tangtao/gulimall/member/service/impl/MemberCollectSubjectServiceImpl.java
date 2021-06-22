package com.tangtao.gulimall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.member.dao.MemberCollectSubjectDao;
import com.tangtao.gulimall.member.entity.MemberCollectSubjectEntity;
import com.tangtao.gulimall.member.service.MemberCollectSubjectService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("memberCollectSubjectService")
public class MemberCollectSubjectServiceImpl extends ServiceImpl<MemberCollectSubjectDao, MemberCollectSubjectEntity> implements MemberCollectSubjectService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<MemberCollectSubjectEntity> page = this.page(
                new QueryPageHandler<MemberCollectSubjectEntity>().getPage(params),
                new QueryWrapper<MemberCollectSubjectEntity>()
        );

       return page;
    }

}