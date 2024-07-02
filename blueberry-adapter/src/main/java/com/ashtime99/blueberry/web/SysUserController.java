package com.ashtime99.blueberry.web;

import com.alibaba.cola.dto.SingleResponse;
import com.ashtime99.blueberry.api.SysUserServiceI;
import com.ashtime99.blueberry.dto.SysUserByUsernameQry;
import com.ashtime99.blueberry.dto.data.SysUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiayichao
 * @version 1.0
 * @since 2024-06-30
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private SysUserServiceI sysUserService;

    @GetMapping(value = "/helloworld")
    public String helloWorld() {
        return "Hello, welcome to COLA world!";
    }

    @GetMapping(value = "/name")
    public SingleResponse<SysUserDTO> getSysUserByName(@RequestParam String name) {
        SysUserByUsernameQry sysUserByUsernameQry = new SysUserByUsernameQry();
        sysUserByUsernameQry.setUsername(name);
        return sysUserService.getSysUserByUsername(sysUserByUsernameQry);
    }

}
