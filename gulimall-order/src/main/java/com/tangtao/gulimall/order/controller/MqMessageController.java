package com.tangtao.gulimall.order.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.order.entity.MqMessageEntity;
import com.tangtao.gulimall.order.service.MqMessageService;


/**
 * 
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:47:21
 */
@RestController
@RequestMapping("order/mqmessage")
public class MqMessageController {
    @Autowired
    private MqMessageService mqMessageService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody MqMessageEntity params){
        IPage page = mqMessageService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{messageId}")
    public R info(@PathVariable("messageId") String messageId){
        return R.succeed(mqMessageService.getById(messageId));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MqMessageEntity mqMessage){
        return R.succeed(mqMessageService.save(mqMessage));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MqMessageEntity mqMessage){
        return R.succeed(mqMessageService.updateById(mqMessage));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] messageIds){
        return R.succeed(mqMessageService.removeByIds(Arrays.asList(messageIds)));
    }

}
