package com.tangtao.gulimall.coupon.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.coupon.entity.SkuFullReductionEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 商品满减信息
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:13
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    IPage queryPage(PageParam pageParam);
}

