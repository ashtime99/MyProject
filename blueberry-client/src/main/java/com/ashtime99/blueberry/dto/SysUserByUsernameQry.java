package com.ashtime99.blueberry.dto;

import com.alibaba.cola.dto.Query;
import lombok.Data;

/**
 * @author xiayichao
 * @version 1.0
 * @since 2024-06-30
 */
@Data
public class SysUserByUsernameQry extends Query {
    private String username;
}
