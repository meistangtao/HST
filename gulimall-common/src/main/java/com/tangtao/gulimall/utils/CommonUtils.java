package com.tangtao.gulimall.utils;

import java.util.Objects;

public class CommonUtils {

    public static <T> T checkNotNull(T t,String errorMessage) throws Exception {
        if(Objects.isNull(t)){
           throw  new Exception(errorMessage);
        }else {
            return t;
        }
    }

}
