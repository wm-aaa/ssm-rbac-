package cn.wolfcode.rbac.service;

import cn.wolfcode.rbac.domain.Department;
import cn.wolfcode.rbac.domain.Employee;
import cn.wolfcode.rbac.util.PageResuilt;
import cn.wolfcode.rbac.util.QueryObject;

import java.util.List;

public interface DepartmentService {
    /**
     * 新增OR修改操作
     * @param department
     */
    void SaveOrUpdate(Department department);

    /**
     * 删除操作
     */
    void delete(Long id);

    /**
     * 单个查询操作
     */
    Department get(Long id);

    /**
     * 查所有
     */
    List<Department> listAll();

    PageResuilt pag(QueryObject qo);
}
