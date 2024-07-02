package com.ashtime99.blueberry.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 错误码枚举
 *
 * @author xiayichao
 * @version 1.0
 * @since 2024-06-28
 */
@Getter
@AllArgsConstructor
public enum ErrorCodeEnum {
    /** 错误码 **/
    UPDATE_ERROR("P1000", "更新失败"),

    ;

    private final String errCode;
    private final String message;
}
