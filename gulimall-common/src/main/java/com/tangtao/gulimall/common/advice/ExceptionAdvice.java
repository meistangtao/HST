package com.tangtao.gulimall.common.advice;

import com.tangtao.gulimall.common.enums.ErrorEnum;
import com.tangtao.gulimall.common.exception.GulimallException;
import com.tangtao.gulimall.common.res.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.security.sasl.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice(
        annotations = {RestController.class, Controller.class}
)
@Slf4j
public class ExceptionAdvice {


    public ExceptionAdvice() {
    }

    private R handleApiException(GulimallException e, HttpServletRequest request) {
        log.error(String.format("【%s】请求异常 code:%s reason:%s IP:%s", request.getRequestURL().toString(), e.getCode(), e.getMessage(), request.getRemoteHost()));
        return R.failed(e.getCode(), e.getMessage());
    }

    private R handleArgumentNotValidException(MethodArgumentNotValidException e, HttpServletRequest request) {
        List<ObjectError> errors = e.getBindingResult().getAllErrors();
        List<String> messages = new ArrayList<>();
        for (ObjectError error : errors) {
            messages.add(error.getDefaultMessage());
        }
        String info = String.join(";", messages);
        log.error(String.format("【%s】请求异常 code:-1 reason:%s IP:%s", request.getRequestURL().toString(), info, request.getRemoteHost()));
        return R.failed(ErrorEnum.PARAM_ERROR);
    }


    private R handleHttpMessageNotReadableException(HttpServletRequest request) {
        log.error(String.format("【%s】请求异常 code:%s reason:%s", request.getRequestURL().toString(), HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase()));
        return R.failed(ErrorEnum.PARAM_ERROR);
    }

    private R handleHttpRequestMethodNotSupportedException(HttpServletRequest request) {
        log.error(String.format("【%s】请求异常 code:%s reason:%s", request.getRequestURL().toString(), HttpStatus.METHOD_NOT_ALLOWED.value(), HttpStatus.METHOD_NOT_ALLOWED.getReasonPhrase()));
        return R.failed(ErrorEnum.PARAM_ERROR);
    }

    private R handleHttpMediaTypeNotSupportedException(HttpServletRequest request) {
        log.error(String.format("【%s】请求异常 code:%s reason:%s", request.getRequestURL().toString(), HttpStatus.UNSUPPORTED_MEDIA_TYPE.value(), HttpStatus.UNSUPPORTED_MEDIA_TYPE.getReasonPhrase()));
        return R.failed(ErrorEnum.PARAM_ERROR);
    }

    private R handleAuthenticationException(HttpServletRequest request) {
        log.error(String.format("【%s】请求异常 code:%s reason:%s", request.getRequestURL().toString(), HttpStatus.UNAUTHORIZED.value(), HttpStatus.UNAUTHORIZED.getReasonPhrase()));
        return R.failed(ErrorEnum.PARAM_ERROR);
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({Exception.class})
    public R handleException(Exception e, HttpServletRequest request) {
        if (e instanceof GulimallException) {
            return handleApiException((GulimallException) e, request);
        }

        if (e instanceof MethodArgumentNotValidException) {
            return handleArgumentNotValidException((MethodArgumentNotValidException) e, request);
        }

        if (e instanceof HttpMessageNotReadableException) {
            return handleHttpMessageNotReadableException(request);
        }

        if (e instanceof HttpRequestMethodNotSupportedException) {
            return handleHttpRequestMethodNotSupportedException(request);
        }

        if (e instanceof HttpMediaTypeNotSupportedException) {
            return handleHttpMediaTypeNotSupportedException(request);
        }

        if (e instanceof AuthenticationException) {
            return handleAuthenticationException(request);
        }

        log.error(String.format("【%s】请求异常 code:%s reason:%s", request.getRequestURL().toString(), HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase()), e);
        return R.failed(-1, "http 500：internal server error");
    }
}
