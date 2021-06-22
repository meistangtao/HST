package com.tangtao.gulimall.member.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.member.entity.MemberLoginLogEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 会员登录记录
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 14:03:01
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    IPage queryPage(PageParam pageParam);
}

