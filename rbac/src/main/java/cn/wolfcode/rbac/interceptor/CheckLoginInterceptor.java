package cn.wolfcode.rbac.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//定义登入拦截器
public class CheckLoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object employee_in_session = request.getSession().getAttribute("EMPLOYEE_IN_SESSION");
        if (employee_in_session == null){
            //没有登入，返回登入页面,拦截
            response.sendRedirect("/login.jsp");
            return false;
        }
        return true;
    }
}
