package com.tangtao.gulimall.member.dao;

import com.tangtao.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 14:03:01
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
