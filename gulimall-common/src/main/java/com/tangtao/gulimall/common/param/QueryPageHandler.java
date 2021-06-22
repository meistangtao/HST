/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.tangtao.gulimall.common.param;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tangtao.gulimall.common.constant.Constant;
import com.tangtao.gulimall.common.xss.SQLFilter;
import org.apache.commons.lang.StringUtils;

/**
 * 查询参数
 *
 *
 */
public class QueryPageHandler<T> {

    public IPage<T> getPage(PageParam pageParam) {
        return this.getPage(pageParam, null, false);
    }

    public IPage<T> getPage(PageParam pageParam, String defaultOrderField, boolean isAsc) {

        //分页对象
        Page<T> page = new Page<>(pageParam.getPage(), pageParam.getSize());

        //排序字段
        //防止SQL注入（因为sidx、order是通过拼接SQL实现排序的，会有SQL注入风险）
        String orderField = SQLFilter.sqlInject(pageParam.getOrderField());
        //前端字段排序
        if(StringUtils.isNotEmpty(orderField) && StringUtils.isNotEmpty(pageParam.getOrder())){
            if(Constant.ASC.equalsIgnoreCase(pageParam.getOrder())) {
                return  page.addOrder(OrderItem.asc(orderField));
            }else {
                return page.addOrder(OrderItem.desc(orderField));
            }
        }

        //没有排序字段，则不排序
        if(StringUtils.isBlank(defaultOrderField)){
            return page;
        }

        //默认排序
        if(isAsc) {
            page.addOrder(OrderItem.asc(defaultOrderField));
        }else {
            page.addOrder(OrderItem.desc(defaultOrderField));
        }

        return page;
    }
}
