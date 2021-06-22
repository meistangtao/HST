package com.tangtao.gulimall.member.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.member.entity.MemberCollectSubjectEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 会员收藏的专题活动
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 14:03:01
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    IPage queryPage(PageParam pageParam);
}

