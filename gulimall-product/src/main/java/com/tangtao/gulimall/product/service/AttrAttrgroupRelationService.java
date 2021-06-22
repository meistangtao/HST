package com.tangtao.gulimall.product.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.product.entity.AttrAttrgroupRelationEntity;

/**
 * 属性&属性分组关联
 *
 * @author chenshun
 * @email tangtao@gmail.com
 * @date 2020-11-07 10:57:48
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    IPage queryPage(PageParam pageParam);
}

