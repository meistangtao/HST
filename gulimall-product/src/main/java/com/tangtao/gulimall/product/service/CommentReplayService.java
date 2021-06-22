package com.tangtao.gulimall.product.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.product.entity.CommentReplayEntity;

/**
 * 商品评价回复关系
 *
 * @author chenshun
 * @email tangtao@gmail.com
 * @date 2020-11-07 10:57:47
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    IPage queryPage(PageParam pageParam);
}

