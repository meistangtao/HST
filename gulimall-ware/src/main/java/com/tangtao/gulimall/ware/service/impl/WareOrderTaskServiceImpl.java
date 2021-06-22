package com.tangtao.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import com.tangtao.gulimall.ware.dao.WareOrderTaskDao;
import com.tangtao.gulimall.ware.entity.WareOrderTaskEntity;
import com.tangtao.gulimall.ware.service.WareOrderTaskService;
import org.springframework.stereotype.Service;


@Service("wareOrderTaskService")
public class WareOrderTaskServiceImpl extends ServiceImpl<WareOrderTaskDao, WareOrderTaskEntity> implements WareOrderTaskService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<WareOrderTaskEntity> page = this.page(
                new QueryPageHandler<WareOrderTaskEntity>().getPage(params),
                new QueryWrapper<WareOrderTaskEntity>()
        );

       return page;
    }

}