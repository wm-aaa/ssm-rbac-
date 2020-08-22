package cn.wolfcode.rbac.controller;

import cn.wolfcode.rbac.domain.Department;
import cn.wolfcode.rbac.domain.Employee;
import cn.wolfcode.rbac.domain.Role;
import cn.wolfcode.rbac.service.DepartmentService;
import cn.wolfcode.rbac.service.IEmployeeService;
import cn.wolfcode.rbac.service.RoleService;
import cn.wolfcode.rbac.util.EmployeeQueryObject;
import cn.wolfcode.rbac.util.PageResuilt;
import cn.wolfcode.rbac.util.RequiredPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private RoleService roleService;

    @RequiredPermission({"员工列表","employee:list"})
    @RequestMapping("/list")
    private String list(Model model, EmployeeQueryObject qo){
//        查询带分页效果的信息

        System.out.println("------------++++"+qo.getDeptId()+"-----+++"+qo.getKeyword());
        if (qo.getKeyword()==""){qo.setKeyword(null);}

        PageResuilt pageResuilt = employeeService.pag(qo);
        model.addAttribute("pageResult",pageResuilt);
        model.addAttribute("qo",qo);
        List<Department> departments = departmentService.listAll();
        model.addAttribute("departments",departments);
        return "employee/list";
    }

    @RequiredPermission({"员工删除","employee:delete"})
    @RequestMapping("/delete")
    public String delete(long id){
        employeeService.delete(id);
        //redirect:重定向，不携带参数
        return "redirect:/employee/list";
    }

    @RequiredPermission({"员工编辑","employee:input"})
    @RequestMapping("/input")
    public String input(Long id,Model model) {

        if(id!=null){
            Employee employee = employeeService.get(id);
            model.addAttribute("employee",employee);
        }
        List<Role> roles = roleService.listAll();
        List<Department> departments = departmentService.listAll();
        model.addAttribute("departments",departments);
        model.addAttribute("roles",roles);
        return "employee/input";
    }

    @RequiredPermission({"员工保存或更新","employee:list"})
    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(Employee employee){
        System.out.println("-----"+employee.getDept().getId());
        employeeService.SaveOrUpdate(employee);
        return "redirect:/employee/list";
    }
}
