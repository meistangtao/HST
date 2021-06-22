package com.tangtao.gulimall.order.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.order.entity.MqMessageEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 
 *
 * @author chenshun
 * @email tangtao@gmail.com
 * @date 2020-11-07 11:58:28
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    IPage queryPage(PageParam pageParam);
}

