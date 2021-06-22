package com.tangtao.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.coupon.dao.SkuLadderDao;
import com.tangtao.gulimall.coupon.entity.SkuLadderEntity;
import com.tangtao.gulimall.coupon.service.SkuLadderService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;



@Service("skuLadderService")
public class SkuLadderServiceImpl extends ServiceImpl<SkuLadderDao, SkuLadderEntity> implements SkuLadderService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<SkuLadderEntity> page = this.page(
                new QueryPageHandler<SkuLadderEntity>().getPage(params),
                new QueryWrapper<SkuLadderEntity>()
        );

       return page;
    }

}