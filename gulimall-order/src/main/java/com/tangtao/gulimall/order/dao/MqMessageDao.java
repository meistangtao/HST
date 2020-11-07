package com.tangtao.gulimall.order.dao;

import com.tangtao.gulimall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author chenshun
 * @email tangtao@gmail.com
 * @date 2020-11-07 11:58:28
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
