package com.ashtime99.blueberry.sysuser;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;

/**
 * 系统用户DO
 *
 * @author xiayichao
 * @version 1.0
 * @since 2024-06-30
 */
@EqualsAndHashCode(callSuper = true)
@TableName("b_sys_user")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysUserDo extends Model<SysUserDo> {
    private String sysUserId;
    private String username;
    private String password;
    private String phone;
    private String createTime;
    private String updateTime;
}
