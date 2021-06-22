package com.tangtao.gulimall.ware.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.ware.entity.WareInfoEntity;

/**
 * 仓库信息
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2020-11-07 14:06:45
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    IPage queryPage(PageParam pageParam);
}

