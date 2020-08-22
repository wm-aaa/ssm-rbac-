package cn.wolfcode.rbac.controller;

import cn.wolfcode.rbac.mapper.PermissionMapper;
import cn.wolfcode.rbac.service.PermissionService;
import cn.wolfcode.rbac.util.PageResuilt;
import cn.wolfcode.rbac.util.QueryObject;
import cn.wolfcode.rbac.util.RequiredPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/permission")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    @RequiredPermission({"权限列表","permission:list"})
    @RequestMapping("/list")
    private String list(Model model, QueryObject qo){
//        查询带分页效果的信息
        PageResuilt pageResuilt = permissionService.pag(qo);
        model.addAttribute("pageResult",pageResuilt);
        return "permission/list";
    }

    @RequiredPermission({"权限删除","permission:delete"})
    @RequestMapping("/delete")
    public String delete(long id){
        permissionService.delete(id);
        //redirect:重定向，不携带参数
        return "redirect:/permission/list";
    }
}
