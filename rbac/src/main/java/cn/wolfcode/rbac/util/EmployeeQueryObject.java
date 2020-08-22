package cn.wolfcode.rbac.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeQueryObject extends QueryObject {
    private String keyword; //查询关键字
    private Long deptId = -1L; //部门id,设置默认值为-1，表示查询全部
}
