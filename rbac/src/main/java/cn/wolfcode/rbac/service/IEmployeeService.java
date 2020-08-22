package cn.wolfcode.rbac.service;

import cn.wolfcode.rbac.domain.Employee;
import cn.wolfcode.rbac.util.PageResuilt;
import cn.wolfcode.rbac.util.QueryObject;

import java.util.List;

public interface IEmployeeService {
    /**
     * 新增OR修改操作
     * @param employee
     */
    void SaveOrUpdate(Employee employee);

    /**
     * 删除操作
     */
    void delete(Long id);

    /**
     * 单个查询操作
     */
    Employee get(Long id);

    /**
     * 查所有
     */
    List<Employee> listAll();

    PageResuilt pag(QueryObject qo);

    void selectByNameAndByPassword(Employee employee);
}
