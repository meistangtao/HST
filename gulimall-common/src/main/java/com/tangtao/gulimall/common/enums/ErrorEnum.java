package com.tangtao.gulimall.common.enums;

public enum ErrorEnum {
    INTERNAL_ERROR(50001, "内部程序错误，请联系管理员"),
    NET_ERROR(50005, "网络错误"),
    CHAIN_ERROR(50006, "区块链访问失败"),
    SIGN_ERROR(51001, "签名验证失败"),
    TIME_ERROR(51002, "时间戳验证失败"),
    PARAM_ERROR(51011, "参数错误"),
    CONTENT_OVERFLOW(51012, "内容超限"),
    RECORD_NOT_FOUND(51013, "记录不存在"),
    SUBCODE_ERROR(51014, "无效的业务码"),
    SUBNAME_DUPLICATE(51015, "业务名称已注册"),
    INVALID_RECORD_ID(51016, "记录ID无效"),
    SCORE_TYPE_ERROR(52001, "积分类型错误"),
    ;

    private int code;

    private String msg;

    ErrorEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ErrorEnum getEnum(int code) {
        for (ErrorEnum ele : ErrorEnum.values()) {
            if (ele.code() == code) {
                return ele;
            }
        }
        return null;
    }

    public String msg() {
        return msg;
    }

    public int code() {
        return code;
    }
}
