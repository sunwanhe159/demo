package com.donkey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sunwh
 * Created by zcool on 2020/5/13.
 */
@Controller
public class PageController {

    /**
     * 主页。
     * @return
     */
    public String indexPage() {
        return "index";
    }

    /**
     * 用户注册页面。
     * @return
     */
    @RequestMapping("/register")
    public String userRegisterPage() {
        return "/user/register";
    }

    /**
     * 用户登陆页面。
     * @return
     */
    @RequestMapping("/login")
    public String userLoginPage() {
        return "/user/login";
    }

}
