package com.tangtao.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.tangtao.gulimall.common.param.PageParam;
import lombok.Data;

import java.io.Serializable;

/**
 * 优惠券与产品关联
 * 
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:14
 */
@Data
@TableName("sms_coupon_spu_relation")
public class CouponSpuRelationEntity  extends PageParam implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 优惠券id
	 */
	private Long couponId;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * spu_name
	 */
	private String spuName;

}
