package cn.wolfcode.rbac.service.impl;

import cn.wolfcode.rbac.domain.Department;
import cn.wolfcode.rbac.mapper.DepartmentMapper;
import cn.wolfcode.rbac.util.PageResuilt;
import cn.wolfcode.rbac.util.QueryObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements cn.wolfcode.rbac.service.DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public void SaveOrUpdate(Department department) {
        if(department.getId()==null){
//            id为空，增加操作
            departmentMapper.insert(department);
        }else {
//            id不为空，修改操作
            departmentMapper.updateByPrimaryKey(department);


        }
    }

    @Override
    public void delete(Long id) {
        departmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Department get(Long id) {
        return departmentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Department> listAll() {
        return departmentMapper.selectAll();
    }

    @Override
    public PageResuilt pag(QueryObject qo) {
//        先查询出数据库中符合客户需求的总条数，因为我们要判断使用哪个构造
        int totalCount = departmentMapper.pagForCount(qo);
//        判断查询出的总条数是否为0
        if (totalCount==0){
            //没有查询出数据，此时调用缺参构造方法
            return new PageResuilt(qo.getPageSize(),qo.getCurrentPage());
        }else {
            List<Department> data = departmentMapper.pagForList(qo);
            return new PageResuilt(data,totalCount,qo.getCurrentPage(),qo.getPageSize());
        }
    }
}
