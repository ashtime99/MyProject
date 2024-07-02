package com.ashtime99.blueberry.domain.sysuser.gateway;

import com.ashtime99.blueberry.domain.sysuser.SysUser;

/**
 * @author xiayichao
 * @version 1.0
 * @since 2024-06-30
 */
public interface SysUserGateway {
    /**
     * 按 用户名 查询用户
     *
     * @param username 用户名
     * @return com.ashtime99.blueberry.domain.SysUser.SysUser
     * @author xiayichao
     * @since 2024-06-30
     */
    SysUser getSysUserByUsername(String username);
}
