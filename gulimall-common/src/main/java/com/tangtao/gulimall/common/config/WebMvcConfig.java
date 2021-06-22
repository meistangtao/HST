/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.tangtao.gulimall.common.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.tangtao.gulimall.common.env.ConfPropHelper;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Slf4j
public class WebMvcConfig implements WebMvcConfigurer {

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDialectType("mysql");
        return page;
    }

    @Bean
    public Docket createRestApi() {
        String gulimallSwaggerControllerPackage = ConfPropHelper.getString("gulimall.swagger.controller-package");
        log.info("gulimallSwaggerControllerPackage:{}",gulimallSwaggerControllerPackage);

        return new Docket(DocumentationType.SWAGGER_2)
                .enable(ConfPropHelper.getBoolean("gulimall.swagger.enable"))
                .apiInfo(apiInfo())
                .select()
                //加了ApiOperation注解的类，才生成接口文档
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                //包下的类，才生成接口文档
                .apis(RequestHandlerSelectors.basePackage(gulimallSwaggerControllerPackage))
                .paths(PathSelectors.any())
                .build()
//            .securitySchemes(security())
                ;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("谷粒商城")
//                .description("谷粒商城")
//                .termsOfServiceUrl("https://www.renren.io")
                .version("3.0.0")
                .build();
    }


}