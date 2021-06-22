package com.tangtao.gulimall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.member.dao.MemberLoginLogDao;
import com.tangtao.gulimall.member.entity.MemberLoginLogEntity;
import com.tangtao.gulimall.member.service.MemberLoginLogService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("memberLoginLogService")
public class MemberLoginLogServiceImpl extends ServiceImpl<MemberLoginLogDao, MemberLoginLogEntity> implements MemberLoginLogService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<MemberLoginLogEntity> page = this.page(
                new QueryPageHandler<MemberLoginLogEntity>().getPage(params),
                new QueryWrapper<MemberLoginLogEntity>()
        );

       return page;
    }

}