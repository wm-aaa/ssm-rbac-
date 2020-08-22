package cn.wolfcode.rbac.controller;


import cn.wolfcode.rbac.domain.Department;
import cn.wolfcode.rbac.service.DepartmentService;

import cn.wolfcode.rbac.util.PageResuilt;
import cn.wolfcode.rbac.util.QueryObject;
import cn.wolfcode.rbac.util.RequiredPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/department")

public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequiredPermission({"部门列表","department:list"})
    @RequestMapping("/list")
    private String list(Model model, QueryObject qo){
//        查询带分页效果的信息
        PageResuilt pageResuilt = departmentService.pag(qo);
        model.addAttribute("pageResult",pageResuilt);
        return "department/list";
    }

    @RequiredPermission({"部门删除","department:delete"})
    @RequestMapping("/delete")
    public String delete(long id){
        departmentService.delete(id);
        //redirect:重定向，不携带参数
        return "redirect:/department/list";
    }

    @RequiredPermission({"部门编辑","department:input"})
    @RequestMapping("/input")
    public String input(Long id,Model model) {
        if(id!=null){
            Department department = departmentService.get(id);
            model.addAttribute("d",department);
        }
        return "department/input";
    }

    @RequiredPermission({"部门保存或更新","department:saveOrUpdate"})
    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(Department department){
        departmentService.SaveOrUpdate(department);
        return "redirect:/department/list";
    }
}
