package cn.wolfcode.rbac.controller;


import cn.wolfcode.rbac.domain.Employee;
import cn.wolfcode.rbac.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @Autowired
    private IEmployeeService iEmployeeService;

    @RequestMapping("/login")
    private String login(Employee employee , Model model){
        try {
             iEmployeeService.selectByNameAndByPassword(employee);
            //登入成功,重定向进入
            return "redirect:/department/list";
        }catch (Exception e){
            //登入失败，请求转发返回登入页面
            e.printStackTrace();
            model.addAttribute("errorMsg",e.getMessage());
            //forward:请求转发
            return  "forward:/login.jsp";
        }
    }


}
