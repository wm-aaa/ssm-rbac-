package cn.wolfcode.rbac.service.impl;


import cn.wolfcode.rbac.domain.Role;
import cn.wolfcode.rbac.mapper.RoleMapper;
import cn.wolfcode.rbac.util.PageResuilt;
import cn.wolfcode.rbac.util.QueryObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements cn.wolfcode.rbac.service.RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public void SaveOrUpdate(Role role) {
        if(role.getId()==null){
//            id为空，增加操作
            roleMapper.insert(role);
        }else {
//            id不为空，修改操作
            roleMapper.updateByPrimaryKey(role);
//            删除中间表
            System.out.println(role.getId()+"删除id");
            roleMapper.deleteRole_permissionByRole_id(role.getId());
        }
//        添加中间表
        Long id = roleMapper.selectByPrimaryName(role.getName());
        List<Long> permissionIds = role.getPermissionIds();
        if (permissionIds != null){
            for (Long permissionId : permissionIds){
                System.out.println("进去了");
                roleMapper.insertToRolePermission(id,permissionId);
            }
        }
    }

    @Override
    public void delete(Long id) {
        roleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Role get(Long id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Role> listAll() {
        return roleMapper.selectAll();
    }

    @Override
    public PageResuilt pag(QueryObject qo) {
//        先查询出数据库中符合客户需求的总条数，因为我们要判断使用哪个构造
        int totalCount = roleMapper.pagForCount(qo);
//        判断查询出的总条数是否为0
        if (totalCount==0){
            //没有查询出数据，此时调用缺参构造方法
            return new PageResuilt(qo.getPageSize(),qo.getCurrentPage());
        }else {
            List<Role> data = roleMapper.pagForList(qo);
            return new PageResuilt(data,totalCount,qo.getCurrentPage(),qo.getPageSize());
        }
    }
}
