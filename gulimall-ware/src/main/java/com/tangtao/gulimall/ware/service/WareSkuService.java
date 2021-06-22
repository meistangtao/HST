package com.tangtao.gulimall.ware.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.ware.entity.WareSkuEntity;

/**
 * 商品库存
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 14:06:45
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    IPage queryPage(PageParam pageParam);
}

