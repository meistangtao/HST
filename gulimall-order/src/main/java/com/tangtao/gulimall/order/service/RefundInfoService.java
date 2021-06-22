package com.tangtao.gulimall.order.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.order.entity.RefundInfoEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 退款信息
 *
 * @author chenshun
 * @email tangtao@gmail.com
 * @date 2020-11-07 11:58:28
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    IPage queryPage(PageParam pageParam);
}

