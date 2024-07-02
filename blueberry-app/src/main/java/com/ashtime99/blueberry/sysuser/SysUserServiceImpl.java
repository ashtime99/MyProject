package com.ashtime99.blueberry.sysuser;

import com.alibaba.cola.catchlog.CatchAndLog;
import com.alibaba.cola.dto.SingleResponse;
import com.ashtime99.blueberry.api.SysUserServiceI;
import com.ashtime99.blueberry.dto.SysUserByUsernameQry;
import com.ashtime99.blueberry.dto.data.SysUserDTO;
import com.ashtime99.blueberry.sysuser.query.SysUserByUsernameQryExe;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xiayichao
 * @version 1.0
 * @since 2024-06-30
 */
@Service
@CatchAndLog
public class SysUserServiceImpl implements SysUserServiceI {

    @Resource
    private SysUserByUsernameQryExe sysUserByUsernameQryExe;

    @Override
    public SingleResponse<SysUserDTO> getSysUserByUsername(SysUserByUsernameQry sysUserByUsernameQry) {
        return sysUserByUsernameQryExe.execute(sysUserByUsernameQry);
    }
}
