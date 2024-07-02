package com.ashtime99.blueberry.domain.sysuser;

import com.alibaba.cola.domain.Entity;
import lombok.Data;

/**
 * 系统用户
 *
 * @author xiayichao
 * @version 1.0
 * @since 2024-06-30
 */
@Data
@Entity
public class SysUser {
    private String sysUserId;
    private String username;
    private String password;
    private String phone;
    private String createTime;
    private String updateTime;
}
