package com.tangtao.gulimall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.member.dao.MemberCollectSpuDao;
import com.tangtao.gulimall.member.entity.MemberCollectSpuEntity;
import com.tangtao.gulimall.member.service.MemberCollectSpuService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("memberCollectSpuService")
public class MemberCollectSpuServiceImpl extends ServiceImpl<MemberCollectSpuDao, MemberCollectSpuEntity> implements MemberCollectSpuService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<MemberCollectSpuEntity> page = this.page(
                new QueryPageHandler<MemberCollectSpuEntity>().getPage(params),
                new QueryWrapper<MemberCollectSpuEntity>()
        );

       return page;
    }

}