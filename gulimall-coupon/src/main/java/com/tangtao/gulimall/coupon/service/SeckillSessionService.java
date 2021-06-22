package com.tangtao.gulimall.coupon.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.coupon.entity.SeckillSessionEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 秒杀活动场次
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:13
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    IPage queryPage(PageParam pageParam);
}

