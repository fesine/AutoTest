package com.fesine.autotest.server;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: 类描述
 * @author: Fesine
 * @createTime:2018/5/20
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/5/20
 */
@RestController
@RequestMapping("/v1")
@Api(value = "/",description = "这是我所有的post请求方法")
public class MyPostMethod {

    private Cookie cookie;

    @PostMapping("/login")
    @ApiOperation(value = "登录接口，成功后获取cookies",httpMethod = "POST")
    public String login(HttpServletResponse response,
                        @RequestParam(value = "username", required = true) String username,
                        @RequestParam(value = "password", required = true) String password) {

        if (username.equals("fesine") && password.equals("123456")) {
            cookie = new Cookie("login", "true");
            response.addCookie(cookie);
            return "恭喜您登录成功!";
        }
        return "用户名或密码输入不正确!";
    }

    //TODO 实现获取cookie，并进行登录验证，返回用户信息
}
