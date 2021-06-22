package com.tangtao.gulimall.member.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.member.entity.MemberCollectSpuEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 会员收藏的商品
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 14:03:02
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    IPage queryPage(PageParam pageParam);
}

