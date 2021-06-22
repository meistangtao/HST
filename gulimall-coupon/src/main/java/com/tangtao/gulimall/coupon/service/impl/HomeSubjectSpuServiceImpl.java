package com.tangtao.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.coupon.dao.HomeSubjectSpuDao;
import com.tangtao.gulimall.coupon.entity.HomeSubjectSpuEntity;
import com.tangtao.gulimall.coupon.service.HomeSubjectSpuService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("homeSubjectSpuService")
public class HomeSubjectSpuServiceImpl extends ServiceImpl<HomeSubjectSpuDao, HomeSubjectSpuEntity> implements HomeSubjectSpuService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<HomeSubjectSpuEntity> page = this.page(
                new QueryPageHandler<HomeSubjectSpuEntity>().getPage(params),
                new QueryWrapper<HomeSubjectSpuEntity>()
        );

       return page;
    }

}