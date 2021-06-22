package com.tangtao.gulimall.coupon.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.coupon.entity.SpuBoundsEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 商品spu积分设置
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:12
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    IPage queryPage(PageParam pageParam);
}

