package cn.wolfcode.rbac.mapper;

import cn.wolfcode.rbac.domain.Role;
import cn.wolfcode.rbac.util.QueryObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    Role selectByPrimaryKey(Long id);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);

    List<Role> pagForList(QueryObject qo);

    int pagForCount(QueryObject qo);

    void delectEmployee_roleByEmId(Long id);

    void deleteRole_permissionByRole_id(Long id);

    Long selectByPrimaryName(String name);

    void insertToRolePermission(@Param("id") Long id,@Param("permissionId") Long permissionId);

}