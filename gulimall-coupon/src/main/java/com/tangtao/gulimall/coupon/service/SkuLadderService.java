package com.tangtao.gulimall.coupon.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.coupon.entity.SkuLadderEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 商品阶梯价格
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:12
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    IPage queryPage(PageParam pageParam);
}

