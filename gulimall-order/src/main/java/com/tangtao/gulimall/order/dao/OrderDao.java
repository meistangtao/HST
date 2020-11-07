package com.tangtao.gulimall.order.dao;

import com.tangtao.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chenshun
 * @email tangtao@gmail.com
 * @date 2020-11-07 11:58:28
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
