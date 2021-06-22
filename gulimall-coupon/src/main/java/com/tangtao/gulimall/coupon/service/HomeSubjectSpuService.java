package com.tangtao.gulimall.coupon.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.coupon.entity.HomeSubjectSpuEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 专题商品
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:12
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    IPage queryPage(PageParam pageParam);
}

