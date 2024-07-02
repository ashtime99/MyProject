package com.ashtime99.blueberry.api;

import com.alibaba.cola.dto.SingleResponse;
import com.ashtime99.blueberry.dto.SysUserByUsernameQry;
import com.ashtime99.blueberry.dto.data.SysUserDTO;

/**
 * @author xiayichao
 * @version 1.0
 * @since 2024-06-30
 */
public interface SysUserServiceI {
    SingleResponse<SysUserDTO> getSysUserByUsername(SysUserByUsernameQry sysUserByUsernameQry);
}
