package com.tangtao.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.tangtao.gulimall.common.param.PageParam;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 成长值变化历史记录
 * 
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 14:03:01
 */
@Data
@TableName("ums_growth_change_history")
public class GrowthChangeHistoryEntity extends PageParam implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * create_time
	 */
	private Date createTime;
	/**
	 * 改变的值（正负计数）
	 */
	private Integer changeCount;
	/**
	 * 备注
	 */
	private String note;
	/**
	 * 积分来源[0-购物，1-管理员修改]
	 */
	private Integer sourceType;

}
