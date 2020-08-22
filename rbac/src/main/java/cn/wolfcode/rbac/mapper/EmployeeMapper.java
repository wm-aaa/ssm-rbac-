package cn.wolfcode.rbac.mapper;

import cn.wolfcode.rbac.domain.Employee;
import cn.wolfcode.rbac.util.QueryObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Employee record);

    Employee selectByPrimaryKey(Long id);

    List<Employee> selectAll();

    int updateByPrimaryKey(Employee record);

    int pagForCount(QueryObject qo);

    List<Employee> pagForList(QueryObject qo);

    void insertToEmployeeRole(@Param("id") Long id, @Param("roleIds") Object roleIds);


    Long selecttoName(@Param("name") String name);

    Employee selectByNameAndByPassword(Employee employee);
}