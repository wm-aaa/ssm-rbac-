package cn.wolfcode.rbac.controller;


import cn.wolfcode.rbac.domain.Permission;
import cn.wolfcode.rbac.domain.Role;
import cn.wolfcode.rbac.service.PermissionService;
import cn.wolfcode.rbac.service.RoleService;
import cn.wolfcode.rbac.util.PageResuilt;
import cn.wolfcode.rbac.util.QueryObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;
    @Autowired
    private PermissionService permissionService;

    @RequestMapping("/list")
    private String list(Model model, QueryObject qo){
//        查询带分页效果的信息
        PageResuilt pageResuilt = roleService.pag(qo);
        model.addAttribute("pageResult",pageResuilt);
        return "role/list";
    }

    @RequestMapping("/delete")
    public String delete(long id){
        roleService.delete(id);
        //redirect:重定向，不携带参数
        return "redirect:/role/list";
    }

    @RequestMapping("/input")
    public String input(Long id,Model model) {
        if(id!=null){
            Role role = roleService.get(id);
            model.addAttribute("role",role);
        }
        List<Permission> permissions =  permissionService.listAll();
        model.addAttribute("permissions",permissions);
        return "role/input";
    }

    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(Role role){
        System.out.println("---->"+role);
        roleService.SaveOrUpdate(role);
        return "redirect:/role/list";
    }
}
