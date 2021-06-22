package com.tangtao.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.coupon.dao.SeckillSkuNoticeDao;
import com.tangtao.gulimall.coupon.entity.SeckillSkuNoticeEntity;
import com.tangtao.gulimall.coupon.service.SeckillSkuNoticeService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("seckillSkuNoticeService")
public class SeckillSkuNoticeServiceImpl extends ServiceImpl<SeckillSkuNoticeDao, SeckillSkuNoticeEntity> implements SeckillSkuNoticeService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<SeckillSkuNoticeEntity> page = this.page(
                new QueryPageHandler<SeckillSkuNoticeEntity>().getPage(params),
                new QueryWrapper<SeckillSkuNoticeEntity>()
        );

       return page;
    }

}