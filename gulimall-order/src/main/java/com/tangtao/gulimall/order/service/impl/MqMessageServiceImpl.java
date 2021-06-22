package com.tangtao.gulimall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tangtao.gulimall.order.dao.MqMessageDao;
import com.tangtao.gulimall.order.entity.MqMessageEntity;
import com.tangtao.gulimall.order.service.MqMessageService;
import com.tangtao.gulimall.common.param.PageParam;
import com.tangtao.gulimall.common.param.QueryPageHandler;
import org.springframework.stereotype.Service;


@Service("mqMessageService")
public class MqMessageServiceImpl extends ServiceImpl<MqMessageDao, MqMessageEntity> implements MqMessageService {

    @Override
    public IPage queryPage(PageParam params) {
        IPage<MqMessageEntity> page = this.page(
                new QueryPageHandler<MqMessageEntity>().getPage(params),
                new QueryWrapper<MqMessageEntity>()
        );

       return page;
    }

}