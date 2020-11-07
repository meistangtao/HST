package com.tangtao.gulimall.coupon.dao;

import com.tangtao.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:13
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
