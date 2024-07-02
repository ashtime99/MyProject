package com.ashtime99.blueberry.sysuser;

import com.ashtime99.blueberry.domain.sysuser.SysUser;
import com.ashtime99.blueberry.dto.data.SysUserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author xiayichao
 * @version 1.0
 * @since 2024-06-30
 */
@Mapper
public interface SysUserConverter {
    SysUserConverter INSTANCE = Mappers.getMapper(SysUserConverter.class);

    SysUser doToEntity(SysUserDo sysUserDo);

    SysUserDTO entityToDTO(SysUser sysUser);

}
