package cn.wolfcode.rbac.service;

import cn.wolfcode.rbac.domain.Employee;
import cn.wolfcode.rbac.domain.Role;
import cn.wolfcode.rbac.util.PageResuilt;
import cn.wolfcode.rbac.util.QueryObject;

import java.util.List;

public interface RoleService {
    /**
     * 新增OR修改操作
     * @param role
     */
    void SaveOrUpdate(Role role);

    /**
     * 删除操作
     */
    void delete(Long id);

    /**
     * 单个查询操作
     */
    Role get(Long id);

    /**
     * 查所有
     */
    List<Role> listAll();

    PageResuilt pag(QueryObject qo);
}
