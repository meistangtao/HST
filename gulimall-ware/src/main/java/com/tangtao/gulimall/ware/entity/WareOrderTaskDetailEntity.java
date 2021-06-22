package com.tangtao.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.tangtao.gulimall.common.param.PageParam;
import lombok.Data;

import java.io.Serializable;

/**
 * 库存工作单
 * 
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 14:06:45
 */
@Data
@TableName("wms_ware_order_task_detail")
public class WareOrderTaskDetailEntity  extends PageParam implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * sku_name
	 */
	private String skuName;
	/**
	 * 购买个数
	 */
	private Integer skuNum;
	/**
	 * 工作单id
	 */
	private Long taskId;
	/**
	 * 仓库id
	 */
	private Long wareId;
	/**
	 * 1-已锁定  2-已解锁  3-扣减
	 */
	private Integer lockStatus;

}
