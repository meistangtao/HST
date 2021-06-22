package com.tangtao.gulimall.ware.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.ware.entity.WareOrderTaskDetailEntity;

/**
 * 库存工作单
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 14:06:45
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    IPage queryPage(PageParam pageParam);
}

