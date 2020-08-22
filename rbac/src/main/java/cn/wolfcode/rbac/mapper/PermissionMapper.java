package cn.wolfcode.rbac.mapper;

import cn.wolfcode.rbac.domain.Permission;
import cn.wolfcode.rbac.util.QueryObject;

import java.util.List;

public interface PermissionMapper {
    List<String> selectExpressionsByEmpId(Long id);

    int deleteByPrimaryKey(Long id);

    int insert(Permission record);

    Permission selectByPrimaryKey(Long id);

    List<Permission> selectAll();

    int updateByPrimaryKey(Permission record);

    int pagForCount(QueryObject qo);

    List<Permission> pagForList(QueryObject qo);
}