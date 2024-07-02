package com.ashtime99.blueberry.sysuser.query;

import com.alibaba.cola.dto.SingleResponse;
import com.ashtime99.blueberry.domain.sysuser.SysUser;
import com.ashtime99.blueberry.dto.SysUserByUsernameQry;
import com.ashtime99.blueberry.dto.data.SysUserDTO;
import com.ashtime99.blueberry.sysuser.SysUserConverter;
import com.ashtime99.blueberry.sysuser.SysUserGatewayImpl;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author xiayichao
 * @version 1.0
 * @since 2024-07-01
 */
@Component
public class SysUserByUsernameQryExe {

    @Resource
    private SysUserGatewayImpl sysUserGateway;

    public SingleResponse<SysUserDTO> execute(SysUserByUsernameQry sysUserByUsernameQry) {
        SysUser sysUser = sysUserGateway.getSysUserByUsername(sysUserByUsernameQry.getUsername());
        return SingleResponse.of(SysUserConverter.INSTANCE.entityToDTO(sysUser));
    }
}
