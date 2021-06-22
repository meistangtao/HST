package com.tangtao.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.tangtao.gulimall.common.param.PageParam;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 采购信息
 * 
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 14:06:45
 */
@Data
@TableName("wms_purchase")
public class PurchaseEntity extends PageParam implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long assigneeId;
	/**
	 * 
	 */
	private String assigneeName;
	/**
	 * 
	 */
	private String phone;
	/**
	 * 
	 */
	private Integer priority;
	/**
	 * 
	 */
	private Integer status;
	/**
	 * 
	 */
	private Long wareId;
	/**
	 * 
	 */
	private BigDecimal amount;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date updateTime;

}
