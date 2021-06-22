package com.tangtao.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.coupon.dao.MemberPriceDao;
import com.tangtao.gulimall.coupon.entity.MemberPriceEntity;
import com.tangtao.gulimall.coupon.service.MemberPriceService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("memberPriceService")
public class MemberPriceServiceImpl extends ServiceImpl<MemberPriceDao, MemberPriceEntity> implements MemberPriceService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<MemberPriceEntity> page = this.page(
                new QueryPageHandler<MemberPriceEntity>().getPage(params),
                new QueryWrapper<MemberPriceEntity>()
        );

       return page;
    }

}