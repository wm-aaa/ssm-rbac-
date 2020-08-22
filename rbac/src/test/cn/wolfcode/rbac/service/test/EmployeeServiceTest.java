package cn.wolfcode.rbac.service.test;

import cn.wolfcode.rbac.domain.Employee;
import cn.wolfcode.rbac.service.IEmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmployeeServiceTest {

    @Autowired
    private IEmployeeService employeeService;

    @Test
    public void saveOrUpdate() {
        Employee employee = new Employee(null,"王无","123456","12345@qq.com",20,false,6L);
        employeeService.SaveOrUpdate(employee);
    }

    @Test
    public void delete() {
        employeeService.delete(19L);
    }

    @Test
    public void get() {
        Employee employee = employeeService.get(1L);
        System.out.println(employee);
    }

    @Test
    public void listAll() {
        List<Employee> employeeList = employeeService.listAll();
        System.out.println(employeeList);
    }
}