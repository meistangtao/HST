/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.tangtao.gulimall.common.res;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.enums.ErrorEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class R<T>{
	private static final long serialVersionUID = 1L;

	@ApiModelProperty("状态码")
	private int code;
	@ApiModelProperty("描述")
	private String message;
	@ApiModelProperty("数据")
	private T data;

	public void succeed0() {
		this.code = 0;
		this.message = "succeed";
	}

	public static <T> R<T> succeed() {
		R restRes = new R();
		restRes.setCode(0);
		restRes.setMessage("succeed");
		return restRes;
	}

	public static <T> R<T> succeed(T body) {
		R<T> restRes = new R();
		restRes.succeed0();
		restRes.setData(body);
		return restRes;
	}

	public static R<IPage> succeed(IPage page) {
		R<IPage> restRes = new R();
		restRes.succeed0();
		restRes.setData(page);
		return restRes;
	}

	public static R failed(int code, String message) {
		R restRes = new R();
		restRes.setCode(code);
		restRes.setMessage(message);
		return restRes;
	}

	public static R failed(ErrorEnum errorEnum) {
		R restRes = new R();
		restRes.setCode(errorEnum.code());
		restRes.setMessage(errorEnum.msg());
		return restRes;
	}

	public R() {
	}

}
