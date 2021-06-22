package com.tangtao.gulimall.product.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.product.entity.CategoryBrandRelationEntity;

/**
 * 品牌分类关联
 *
 * @author chenshun
 * @email tangtao@gmail.com
 * @date 2020-11-07 10:57:47
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    IPage queryPage(PageParam pageParam);
}

