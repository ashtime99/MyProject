package com.ashtime99.blueberry.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一异常处理
 *
 * @author xiayichao
 * @version 1.0
 * @since 2024-06-28
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @Autowired
    private MessageSource messageSource;

    /**
     * 默认全局异常处理
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ApiResponse<String> handleException(Exception ex) {
        // 打印堆栈跟踪以便调试
        ex.printStackTrace();
        return ApiResponse.error(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
    }

    @ExceptionHandler(BlueberryException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ApiResponse<String> handleMyCustomException(HttpServletRequest request, BlueberryException ex) {
        String message =
            messageSource.getMessage(ex.getErrorCodeEnum().getErrCode(), ex.getArgs(), LocaleContextHolder.getLocale());
        return ApiResponse.error(400, "errCode:" + ex.getErrorCodeEnum().getErrCode() + ";" + message);
    }

    // 可以添加更多的异常处理方法来处理不同类型的异常
}
