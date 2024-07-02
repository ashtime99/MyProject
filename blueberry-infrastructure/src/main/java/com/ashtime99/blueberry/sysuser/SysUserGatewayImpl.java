package com.ashtime99.blueberry.sysuser;

import com.ashtime99.blueberry.domain.sysuser.SysUser;
import com.ashtime99.blueberry.domain.sysuser.gateway.SysUserGateway;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xiayichao
 * @version 1.0
 * @since 2024-06-30
 */
@Component
public class SysUserGatewayImpl implements SysUserGateway {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser getSysUserByUsername(String username) {
        SysUserDo sysUserDo =
            sysUserMapper.selectOne(new LambdaQueryWrapper<SysUserDo>().eq(SysUserDo::getUsername, username));
        return SysUserConverter.INSTANCE.doToEntity(sysUserDo);
    }
}
