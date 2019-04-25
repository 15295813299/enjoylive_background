package com.qf.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String uri = httpServletRequest.getRequestURI();
        Object info = httpServletRequest.getSession().getAttribute("userInfo");
        if (uri.indexOf("bgLoginCheck")!=-1||uri.indexOf("login2.html")!=-1||info!=null){
            return true;
        }
//        httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/login2.html");
        httpServletRequest.getRequestDispatcher("/login2.html").forward(httpServletRequest,httpServletResponse);
        return false;


    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
