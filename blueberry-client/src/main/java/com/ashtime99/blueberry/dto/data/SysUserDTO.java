package com.ashtime99.blueberry.dto.data;

import lombok.Data;

/**
 * @author xiayichao
 * @version 1.0
 * @since 2024-07-01
 */
@Data
public class SysUserDTO {
    private String sysUserId;
    private String username;
    private String password;
    private String phone;
    private String createTime;
    private String updateTime;
}
