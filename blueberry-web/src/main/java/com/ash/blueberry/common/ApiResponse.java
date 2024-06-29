package com.ash.blueberry.common;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 统一结果返回类
 *
 * @author xiayichao
 * @version 1.0
 * @since 2024-06-28
 */
@Data
@NoArgsConstructor
public class ApiResponse<T> {
    private Integer code;
    private LocalDateTime timestamp;
    private String message;
    private T data;

    public ApiResponse(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.timestamp = LocalDateTime.now();
    }

    // 静态工厂方法
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(200, "Success", data);
    }

    public static <T> ApiResponse<T> error(int code, String message) {
        return new ApiResponse<>(code, message, null);
    }
}
