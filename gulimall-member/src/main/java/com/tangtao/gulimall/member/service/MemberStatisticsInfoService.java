package com.tangtao.gulimall.member.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.member.entity.MemberStatisticsInfoEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 会员统计信息
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 14:03:01
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    IPage queryPage(PageParam pageParam);
}

