package com.tangtao.gulimall.common.param;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OrderParam {

    /**
     * 排序字段
     */
    @TableField(exist = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    protected String orderField;
    /**
     * 排序方式
     */
    @TableField(exist = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    protected String order;
}
