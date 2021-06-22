package com.tangtao.gulimall.product.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.product.entity.SkuInfoEntity;

/**
 * sku信息
 *
 * @author chenshun
 * @email tangtao@gmail.com
 * @date 2020-11-07 10:57:47
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    IPage queryPage(PageParam pageParam);
}

