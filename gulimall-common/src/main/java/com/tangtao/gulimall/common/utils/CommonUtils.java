package com.tangtao.gulimall.common.utils;

import com.tangtao.gulimall.common.exception.GulimallException;

import java.util.Objects;

public class CommonUtils {

    public static <T> T checkNotNull(T t,String errorMessage) throws Exception {
        if(Objects.isNull(t)){
           throw  new GulimallException(errorMessage);
        }else {
            return t;
        }
    }

}
