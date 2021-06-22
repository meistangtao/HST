package com.tangtao.gulimall.coupon.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.coupon.entity.SeckillPromotionEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 秒杀活动
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:13
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    IPage queryPage(PageParam pageParam);
}

