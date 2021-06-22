package com.tangtao.gulimall.coupon.service.impl;

import com.tangtao.gulimall.common.param.PageParam;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.common.param.QueryPageHandler;

import com.tangtao.gulimall.coupon.dao.HomeSubjectDao;
import com.tangtao.gulimall.coupon.entity.HomeSubjectEntity;
import com.tangtao.gulimall.coupon.service.HomeSubjectService;


@Service("homeSubjectService")
public class HomeSubjectServiceImpl extends ServiceImpl<HomeSubjectDao, HomeSubjectEntity> implements HomeSubjectService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<HomeSubjectEntity> page = this.page(
                new QueryPageHandler<HomeSubjectEntity>().getPage(params),
                new QueryWrapper<HomeSubjectEntity>()
        );

        return page;
    }

}