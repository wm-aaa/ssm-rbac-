package cn.wolfcode.rbac.interceptor;




import cn.wolfcode.rbac.domain.Employee;
import cn.wolfcode.rbac.util.RequiredPermission;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.lang.reflect.Method;
import java.util.List;

//权限拦截器
public class SecurityInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Employee currentEmp = (Employee)request.getSession().getAttribute("EMPLOYEE_IN_SESSION");

//        如果当前用户是超级管理员
        if(currentEmp.getAdmin()){
            return true;
        }

//        如果当前访问的方法不需要权限，方行
//        获取用户当前访问的方法对象
        HandlerMethod hm = (HandlerMethod) handler;
        Method method = hm.getMethod();

//        判断当前方法是否有贴RequiredPermission注解
        if (!method.isAnnotationPresent(RequiredPermission.class)){
            return true;
        }
//        获取注解类：RequiredPermission.class
        RequiredPermission requiredPermission = method.getAnnotation(RequiredPermission.class);
        String expression =  requiredPermission.value()[1];

//        获取当前用户拥有的权限表达式
        List<String> expressions = (List<String>) request.getSession().getAttribute("Expressions_SESSION");

        //如果当前用户有权限，方行
        if(expressions.contains(expression)){
            return true;
        }

        //如果当前用户没有权限，跳转到没有权限页面：请求转发
        request.getRequestDispatcher("/WEB-INF/views/common/nopermission.jsp").forward(request,response);
        return false;
    }
}
