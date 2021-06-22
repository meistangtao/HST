package com.tangtao.gulimall.common.exception;

import com.tangtao.gulimall.common.enums.ErrorEnum;
import lombok.Data;

@Data
public class GulimallException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    protected String msg;
    protected int code ;

    public GulimallException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public GulimallException(ErrorEnum ee) {
        super(ee.msg());
        this.code = ee.code();
        this.msg=ee.msg();
    }

    public GulimallException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public GulimallException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public GulimallException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }
}
