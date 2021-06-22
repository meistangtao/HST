package com.tangtao.gulimall.product.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tangtao.gulimall.common.res.R;
import com.tangtao.gulimall.product.entity.CategoryEntity;
import com.tangtao.gulimall.product.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;


/**
 * 商品三级分类
 *
 * @author tangtao
 * @email tangtao@gmail.com
 * @date 2021-06-22 11:52:08
 */
@RestController
@RequestMapping("product/category")
@Api(value = "product/category", tags = "商品三级分类")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 列表
     */
    @PostMapping("/list")
    @ApiOperation(value = "列表", response = R.class)
    public R list(@RequestBody CategoryEntity params){
        IPage page = categoryService.queryPage(params);

        return R.succeed(page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{catId}")
    @ApiOperation(value = "信息", response = R.class)
    public R info(@PathVariable("catId") Long catId){
        return R.succeed(categoryService.getById(catId));
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    @ApiOperation(value = "保存", response = R.class)
    public R save(@RequestBody CategoryEntity category){
        return R.succeed(categoryService.save(category));
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    @ApiOperation(value = "修改", response = R.class)
    public R update(@RequestBody CategoryEntity category){
        return R.succeed(categoryService.updateById(category));
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    @ApiOperation(value = "删除", response = R.class)
    public R delete(@RequestBody Long[] catIds){
        return R.succeed(categoryService.removeByIds(Arrays.asList(catIds)));
    }

}
