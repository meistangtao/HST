package com.tangtao.gulimall.common.param;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tangtao.gulimall.common.enums.ErrorEnum;
import com.tangtao.gulimall.common.exception.GulimallException;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.constraints.Positive;
import java.util.Set;

@Data
public class PageParam extends OrderParam{
    @ApiModelProperty("页码，从1开始")
    @Positive(message = "非法的页码")
    @TableField(exist = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    protected Integer page;

    @Positive(message = "非法的分页大小")
    @ApiModelProperty("分页大小")
    @TableField(exist = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    protected Integer size;


    public Integer getPage() {
        return page != null ? page : 1;
    }

    public Integer getSize() {
        return size != null ? size : 20;
    }

    public PageParam() {
    }

    public PageParam(Integer page, Integer size) {
        this.page = page;
        this.size = size;
        Set<ConstraintViolation<PageParam>> set = Validation.buildDefaultValidatorFactory().getValidator().validate(this);
        for (ConstraintViolation<PageParam> cv : set) {
            throw new GulimallException(ErrorEnum.PARAM_ERROR);
        }
    }
}
