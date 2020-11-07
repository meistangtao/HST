package com.tangtao.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.utils.PageUtils;
import com.tangtao.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 13:57:12
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
