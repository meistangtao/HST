package com.tangtao.gulimall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.member.dao.MemberDao;
import com.tangtao.gulimall.member.entity.MemberEntity;
import com.tangtao.gulimall.member.service.MemberService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("memberService")
public class MemberServiceImpl extends ServiceImpl<MemberDao, MemberEntity> implements MemberService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<MemberEntity> page = this.page(
                new QueryPageHandler<MemberEntity>().getPage(params),
                new QueryWrapper<MemberEntity>()
        );

       return page;
    }

}