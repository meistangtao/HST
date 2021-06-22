package com.tangtao.gulimall.product.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tangtao.gulimall.product.entity.CommentReplayEntity;
import com.tangtao.gulimall.product.service.CommentReplayService;


/**
 * 商品评价回复关系
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:52:07
 */
@RestController
@RequestMapping("product/commentreplay")
public class CommentReplayController {
    @Autowired
    private CommentReplayService commentReplayService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody CommentReplayEntity params){
        IPage page = commentReplayService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        return R.succeed(commentReplayService.getById(id));
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CommentReplayEntity commentReplay){
        return R.succeed(commentReplayService.save(commentReplay));
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CommentReplayEntity commentReplay){
        return R.succeed(commentReplayService.updateById(commentReplay));
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        return R.succeed(commentReplayService.removeByIds(Arrays.asList(ids)));
    }

}
