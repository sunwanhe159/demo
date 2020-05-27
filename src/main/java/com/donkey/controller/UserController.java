package com.donkey.controller;

import com.donkey.base.BaseController;
import com.donkey.dto.PageResult;
import com.donkey.entity.User;
import com.donkey.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zcool on 2020/5/14.
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController{

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public void registerUser (HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        userService.createUser(username,password,email);
    }

    @RequestMapping("/login")
    public PageResult loginUser (String email, String password) throws Exception{

        PageResult pageResult = restProcessor(() -> {
            User loginUser = userService.findByEmail(email);
            if (loginUser == null) {
                return PageResult.warn("用户不存在，请重新输入");
            }
            if (userService.checkUser(email,password)) {
                return PageResult.warn("密码错误");
            }
            String token = userService.LoginUser(loginUser);
            return PageResult.ok(token);

        });
        return pageResult;
    }

}
