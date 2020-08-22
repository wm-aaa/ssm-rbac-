package cn.wolfcode.rbac.service.impl;

import cn.wolfcode.rbac.domain.Employee;
import cn.wolfcode.rbac.mapper.EmployeeMapper;
import cn.wolfcode.rbac.mapper.PermissionMapper;
import cn.wolfcode.rbac.mapper.RoleMapper;
import cn.wolfcode.rbac.util.PageResuilt;
import cn.wolfcode.rbac.util.QueryObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.List;

@Service
public class EmployeeServiceImpl implements cn.wolfcode.rbac.service.IEmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public void SaveOrUpdate(Employee employee) {
        if(employee.getId()==null){
//            id为空，增加操作
            employeeMapper.insert(employee);

        }else {
//            id不为空，修改操作
            employeeMapper.updateByPrimaryKey(employee);
//            删除中间表当前employee.id对应的行
            roleMapper.delectEmployee_roleByEmId(employee.getId());
        }
//        添加中间表数据
        Long id = employeeMapper.selecttoName(employee.getName());
        List roleIds = employee.getRoleIds();
        System.out.println("roleIds"+roleIds);
        if (roleIds!=null){
            for (int i=0;i<roleIds.size();i++){
                employeeMapper.insertToEmployeeRole(id,roleIds.get(i));
            }
        }
    }

    @Override
    public void delete(Long id) {
        employeeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Employee get(Long id) {
        return employeeMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Employee> listAll() {
        return employeeMapper.selectAll();
    }

    @Override
    public PageResuilt pag(QueryObject qo) {
//        先查询出数据库中符合客户需求的总条数，因为我们要判断使用哪个构造
        int totalCount = employeeMapper.pagForCount(qo);
//        判断查询出的总条数是否为0
        if (totalCount==0){
            //没有查询出数据，此时调用缺参构造方法
            return new PageResuilt(qo.getPageSize(),qo.getCurrentPage());
        }else {
            List<Employee> data = employeeMapper.pagForList(qo);
            return new PageResuilt(data,totalCount,qo.getCurrentPage(),qo.getPageSize());
        }
    }

    @Override
    public void selectByNameAndByPassword(Employee employee) {
        Employee employee1 = employeeMapper.selectByNameAndByPassword(employee);
        if (employee1 == null){
            //失败
            throw new RuntimeException("密码或用户名错误");
        }
        //成功,数据共享
        //不能直接调用表现层的api，但可以间接使用，使用spring封装的session
        //可以将表现层的api封装到一个工具中，然后调用工具类的方法来访问表现层api
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        requestAttributes.getRequest().getSession().setAttribute("EMPLOYEE_IN_SESSION" , employee1);


//        共享当前用户拥有的权限表达式
//        查询当前用户拥有的权限表达式
        List<String> expressions =  permissionMapper.selectExpressionsByEmpId(employee1.getId());
        requestAttributes.getRequest().getSession().setAttribute("Expressions_SESSION" , expressions);

    }
}
