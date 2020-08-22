package cn.wolfcode.rbac.controller;


import cn.wolfcode.rbac.domain.Employee;
import cn.wolfcode.rbac.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

//退出
@Controller
public class LogoutController {

    @RequestMapping("/logout")
    private String logout(HttpSession session){

//        销毁数据对象session
        session.invalidate();
        return "redirect:login.jsp";

    }


}
