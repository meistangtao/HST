package com.tangtao.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import com.tangtao.gulimall.ware.dao.WareInfoDao;
import com.tangtao.gulimall.ware.entity.WareInfoEntity;
import com.tangtao.gulimall.ware.service.WareInfoService;
import org.springframework.stereotype.Service;


@Service("wareInfoService")
public class WareInfoServiceImpl extends ServiceImpl<WareInfoDao, WareInfoEntity> implements WareInfoService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<WareInfoEntity> page = this.page(
                new QueryPageHandler<WareInfoEntity>().getPage(params),
                new QueryWrapper<WareInfoEntity>()
        );

       return page;
    }

}