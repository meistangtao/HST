package com.tangtao.gulimall.coupon.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.coupon.entity.SeckillSkuNoticeEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 秒杀商品通知订阅
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:13
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    IPage queryPage(PageParam pageParam);
}

