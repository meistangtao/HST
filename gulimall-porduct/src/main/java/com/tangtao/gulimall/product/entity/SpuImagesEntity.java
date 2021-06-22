package com.tangtao.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import com.tangtao.gulimall.common.param.PageParam;
import lombok.Data;

/**
 * spu图片
 * 
 * @author chenshun
 * @email tangtao@gmail.com
 * @date 2020-11-07 10:57:46
 */
@Data
@TableName("pms_spu_images")
public class SpuImagesEntity extends PageParam implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * 图片名
	 */
	private String imgName;
	/**
	 * 图片地址
	 */
	private String imgUrl;
	/**
	 * 顺序
	 */
	private Integer imgSort;
	/**
	 * 是否默认图
	 */
	private Integer defaultImg;

}
