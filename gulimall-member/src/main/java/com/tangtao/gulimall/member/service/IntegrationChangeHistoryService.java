package com.tangtao.gulimall.member.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.member.entity.IntegrationChangeHistoryEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 积分变化历史记录
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 14:03:01
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    IPage queryPage(PageParam pageParam);
}

