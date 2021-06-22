package com.tangtao.gulimall.coupon.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.coupon.entity.HomeSubjectEntity;
import com.tangtao.gulimall.common.param.PageParam;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:13
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    IPage queryPage(PageParam pageParam);
}

