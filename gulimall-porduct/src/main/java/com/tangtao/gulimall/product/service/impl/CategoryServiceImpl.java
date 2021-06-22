package com.tangtao.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import com.tangtao.gulimall.product.dao.CategoryDao;
import com.tangtao.gulimall.product.entity.CategoryEntity;
import com.tangtao.gulimall.product.service.CategoryService;
import org.springframework.stereotype.Service;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<CategoryEntity> page = this.page(
                new QueryPageHandler<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

       return page;
    }

}