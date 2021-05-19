package com.ck.Interceptor;


import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class LoginCheckIntercetor extends HandlerInterceptorAdapter {
    private List<String> strings;

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    //拦截器登入
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        //调用request对象的getServletPath()方法获取路径
//        String path= request.getServletPath();
//        //判断是否为登录页面（如果是放行）
//        if(strings.contains(path) ||strings.contains(path+"?page=login")){
//            return true;
//        }
//        //因为传过来的是用户对象所以进行强转
//        HyUse loginuse = (HyUse)request.getSession().getAttribute("loginuse");
//        if(loginuse == null && loginuse.getHi_id() != 0 ){
//            //如果没有登录成功这重定向到login页面
//            response.sendRedirect("redirect:page?page=login");
//            return false;
//        }
//        return true;
//    }
}