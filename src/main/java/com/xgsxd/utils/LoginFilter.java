package com.xgsxd.utils;

import com.xgsxd.blog.bean.User;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/admin/*") //指定过滤器过滤哪些路径
public class LoginFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //获取HttpServletRequest
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        //获取请求uri
        String uri = request.getRequestURI();

        System.out.println("uri:"+uri);
        //获取Session 从session中获取user对象
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("userInfo");
        if (uri.contains("/admin/login")){
            filterChain.doFilter(servletRequest,servletResponse);
        } else if (user != null){
            filterChain.doFilter(servletRequest,servletResponse);
        } else{
            request.getRequestDispatcher("/admin/login").forward(servletRequest,servletResponse);
            return;
        }

    }
}
