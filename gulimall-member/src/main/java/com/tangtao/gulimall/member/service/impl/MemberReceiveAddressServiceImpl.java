package com.tangtao.gulimall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.member.dao.MemberReceiveAddressDao;
import com.tangtao.gulimall.member.entity.MemberReceiveAddressEntity;
import com.tangtao.gulimall.member.service.MemberReceiveAddressService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("memberReceiveAddressService")
public class MemberReceiveAddressServiceImpl extends ServiceImpl<MemberReceiveAddressDao, MemberReceiveAddressEntity> implements MemberReceiveAddressService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<MemberReceiveAddressEntity> page = this.page(
                new QueryPageHandler<MemberReceiveAddressEntity>().getPage(params),
                new QueryWrapper<MemberReceiveAddressEntity>()
        );

       return page;
    }

}