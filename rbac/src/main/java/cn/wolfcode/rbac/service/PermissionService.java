package cn.wolfcode.rbac.service;


import cn.wolfcode.rbac.domain.Permission;
import cn.wolfcode.rbac.util.PageResuilt;
import cn.wolfcode.rbac.util.QueryObject;

import java.util.List;

public interface PermissionService {
    /**
     * 新增OR修改操作
     * @param permission
     */
    void SaveOrUpdate(Permission permission);

    /**
     * 删除操作
     */
    void delete(Long id);

    /**
     * 单个查询操作
     */
    Permission get(Long id);

    /**
     * 查所有
     */
    List<Permission> listAll();

    PageResuilt pag(QueryObject qo);
}
