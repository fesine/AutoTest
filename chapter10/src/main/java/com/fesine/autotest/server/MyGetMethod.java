package com.fesine.autotest.server;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * @description: 类描述
 * @author: Fesine
 * @createTime:2018/5/20
 * @update:修改内容
 * @author: Fesine
 * @updateTime:2018/5/20
 */
@RestController
@Api(value = "/",description = "这是我所有的get方法请求")
public class MyGetMethod {

    @GetMapping("/getCookies")
    @ApiOperation(value = "获取cookies信息",httpMethod = "GET")
    public String getCookies(HttpServletResponse response) {
        Cookie cookie = new Cookie("login", "true");
        response.addCookie(cookie);
        return "恭喜你获取cookies信息成功！";
    }

    @GetMapping("/getWithCookies")
    @ApiOperation(value = "带有cookies信息的请求", httpMethod = "GET")
    public String getWithCookies(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (Objects.isNull(cookies)) {
            return "请求访问必须要有cookies";
        }
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("login") && cookie.getValue().equals("true")) {
                return "恭喜你带有cookies访问成功！";
            }
        }
        return "请求访问必须要有cookies！";
    }
}
