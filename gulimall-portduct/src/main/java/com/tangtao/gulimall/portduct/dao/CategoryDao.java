package com.tangtao.gulimall.portduct.dao;

import com.tangtao.gulimall.portduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenshun
 * @email tangtao@gmail.com
 * @date 2020-11-07 10:57:47
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
