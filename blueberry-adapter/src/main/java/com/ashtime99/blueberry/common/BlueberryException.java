package com.ashtime99.blueberry.common;

import lombok.Getter;

/**
 * 自定义异常类
 *
 * @author xiayichao
 * @version 1.0
 * @since 2024-06-28
 */
@Getter
public class BlueberryException extends RuntimeException {
    private final ErrorCodeEnum errorCodeEnum;
    private final Object[] args;

    public BlueberryException(ErrorCodeEnum errorCodeEnum, Object... args) {
        super(errorCodeEnum.getMessage());
        this.errorCodeEnum = errorCodeEnum;
        this.args = args;
    }
}
