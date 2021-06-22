package com.tangtao.gulimall.common.env;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
@Slf4j
public class ConfPropHelper implements EnvironmentAware {

    private static Environment environment;

    @Override
    public void setEnvironment(@NotNull Environment environment) {
        ConfPropHelper.environment=environment;
        log.debug("setEnvironment:{}",environment);
    }

    public static String getString(String key){
        log.debug("get config key:{}",key);
        return ConfPropHelper.environment.getProperty(key);
    }

    public static String getString(String key,String defaultValue){
        log.debug("get config key:{}",key);
        return ConfPropHelper.environment.getProperty(key,defaultValue);
    }

    public static Integer getInteger(String key){
        log.debug("getInteger key:{}",key);
        String value = ConfPropHelper.environment.getProperty(key);
        return StrUtil.isBlank(value)?null: Integer.parseInt(value.trim());
    }

    public static Integer getInteger(String key,Integer defaultValue){
        log.debug("getInteger key:{}",key);
        String value = ConfPropHelper.environment.getProperty(key);
        return StrUtil.isBlank(value)?defaultValue:Integer.parseInt(value.trim());
    }

    public static Long getLong(String key){
        log.debug("getInteger key:{}",key);
        String value = ConfPropHelper.environment.getProperty(key);
        return StrUtil.isBlank(value)?null:Long.parseLong(value.trim());
    }

    public static Long getLong(String key,Long defaultValue){
        log.debug("getInteger key:{}",key);
        String value = ConfPropHelper.environment.getProperty(key);
        return StrUtil.isBlank(value)?defaultValue:Long.parseLong(value.trim());
    }

    public static Boolean getBoolean(String key){
        log.debug("getBoolean key:{}",key);
        String value = ConfPropHelper.environment.getProperty(key);
        log.debug("getBoolean value:{}",value);
        return StrUtil.isBlank(value)?null:Boolean.parseBoolean(value.trim());
    }

    public static Boolean getBoolean(String key,Boolean defaultValue){
        log.debug("getInteger key:{}",key);
        String value = ConfPropHelper.environment.getProperty(key);
        log.debug("getInteger value:{}",value);
        return StrUtil.isBlank(value)?defaultValue:Boolean.parseBoolean(value.trim());
    }
}
