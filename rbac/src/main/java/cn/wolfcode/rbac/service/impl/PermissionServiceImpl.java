package cn.wolfcode.rbac.service.impl;


import cn.wolfcode.rbac.domain.Permission;
import cn.wolfcode.rbac.mapper.PermissionMapper;
import cn.wolfcode.rbac.mapper.RoleMapper;
import cn.wolfcode.rbac.service.PermissionService;
import cn.wolfcode.rbac.util.PageResuilt;
import cn.wolfcode.rbac.util.QueryObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public void SaveOrUpdate(Permission permission) {
        if(permission.getId()==null){
//            id为空，增加操作
            permissionMapper.insert(permission);
        }else {
//            id不为空，修改操作
            permissionMapper.updateByPrimaryKey(permission);
        }
    }

    @Override
    public void delete(Long id) {
        permissionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Permission get(Long id) {
        return permissionMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Permission> listAll() {
        return permissionMapper.selectAll();
    }

    @Override
    public PageResuilt pag(QueryObject qo) {
//        先查询出数据库中符合客户需求的总条数，因为我们要判断使用哪个构造
        int totalCount = permissionMapper.pagForCount(qo);
//        判断查询出的总条数是否为0
        if (totalCount==0){
            //没有查询出数据，此时调用缺参构造方法
            return new PageResuilt(qo.getPageSize(),qo.getCurrentPage());
        }else {
            List<Permission> data = permissionMapper.pagForList(qo);
            return new PageResuilt(data,totalCount,qo.getCurrentPage(),qo.getPageSize());
        }
    }
}
