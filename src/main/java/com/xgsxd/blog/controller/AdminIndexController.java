package com.xgsxd.blog.controller;

import com.xgsxd.blog.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 首页
 *
 */
@Controller
@RequestMapping("/admin")
public class AdminIndexController {

    @Resource
    private IUserService userService;

    @RequestMapping("/index")
    public String adminIndex(HttpServletRequest request, Model model){
        int userCount = userService.countUsers(null); //首页显示用户个数
        String loginIp = request.getRemoteAddr(); //获取登录ip

        model.addAttribute("userCount", userCount);
        model.addAttribute("loginIp", loginIp);
        return "index";
    }

}
