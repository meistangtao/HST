package com.tangtao.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.utils.PageUtils;
import com.tangtao.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:13
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
