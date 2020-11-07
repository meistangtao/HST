package com.tangtao.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.utils.PageUtils;
import com.tangtao.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 14:06:45
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

