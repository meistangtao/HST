package com.tangtao.gulimall.coupon.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.coupon.entity.HomeAdvEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 首页轮播广告
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:14
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    IPage queryPage(PageParam pageParam);
}

