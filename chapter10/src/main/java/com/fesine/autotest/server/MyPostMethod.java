package com.fesine.autotest.server;

import com.fesine.autotest.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/v1")
@Api(value = "/", description = "这是我所有的post请求方法")
public class MyPostMethod {

    private Cookie cookie;

    @PostMapping("/login")
    @ApiOperation(value = "登录接口，成功后获取cookies", httpMethod = "POST")
    public String login(HttpServletResponse response,
                        @RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password) {

        if (username.equals("fesine") && password.equals("123456")) {
            cookie = new Cookie("login", "true");
            response.addCookie(cookie);
            return "恭喜您登录成功!";
        }
        return "用户名或密码输入不正确!";
    }

    /**
     * 实现获取cookie，并进行登录验证，返回用户信息
     *
     * @param request
     * @param u
     * @return
     */
    @PostMapping("/getUserList")
    @ApiOperation(value = "获取用户列表", httpMethod = "POST")
    public Object getUserList(HttpServletRequest request, @RequestBody User u) {
        User user;
        Cookie[] cookies = request.getCookies();
        if(Objects.isNull(cookies)){
            return "cookies信息不存在";
        }
        for (Cookie c : cookies) {
            if (c.getName().equals("login") && c.getValue().equals("true") && u.getUsername()
                    .equals("fesine") && u.getPassword().equals("123456")) {
                user = new User();
                user.setName("soly");
                user.setAge(18);
                user.setSex("male");
                return user;
            }
        }
        return "参数不合法！";
    }

}
