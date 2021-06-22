package com.tangtao.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import com.tangtao.gulimall.ware.dao.WareOrderTaskDetailDao;
import com.tangtao.gulimall.ware.entity.WareOrderTaskDetailEntity;
import com.tangtao.gulimall.ware.service.WareOrderTaskDetailService;
import org.springframework.stereotype.Service;


@Service("wareOrderTaskDetailService")
public class WareOrderTaskDetailServiceImpl extends ServiceImpl<WareOrderTaskDetailDao, WareOrderTaskDetailEntity> implements WareOrderTaskDetailService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<WareOrderTaskDetailEntity> page = this.page(
                new QueryPageHandler<WareOrderTaskDetailEntity>().getPage(params),
                new QueryWrapper<WareOrderTaskDetailEntity>()
        );

       return page;
    }

}