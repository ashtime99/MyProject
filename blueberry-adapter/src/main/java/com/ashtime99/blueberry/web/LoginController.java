package com.ashtime99.blueberry.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录接口
 *
 * @author xiayichao
 * @version 1.0
 * @since 2024-06-29
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    // @RequestMapping("doLogin")
    // public String doLogin(String username, String password) {
    //     // 此处仅作模拟示例，真实项目需要从数据库中查询数据进行比对
    //     if ("zhang".equals(username) && "123456".equals(password)) {
    //         StpUtil.login(10001);
    //         return "登录成功";
    //     }
    //     return "登录失败";
    // }
    //
    // @RequestMapping("isLogin")
    // public String isLogin() {
    //     return "当前会话是否登录：" + StpUtil.isLogin();
    // }

}
