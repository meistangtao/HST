package com.tangtao.gulimall.common.advice;

import com.tangtao.gulimall.common.res.R;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@RestControllerAdvice(
        annotations = {RestController.class}
)
public class RestResponseAdvice implements ResponseBodyAdvice<Object> {


    public RestResponseAdvice() {
    }

    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        methodParameter.getContainingClass().getPackage();
        return true;
    }

    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        if (o instanceof R) {
            return o;
        }
        R<Object> res = new R<>();
        res.succeed();
        res.setData(o);
        return res;
    }
}
