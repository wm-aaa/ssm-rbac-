package cn.wolfcode.rbac.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private Long id;

    private String name;

    private String password;

    private String email;

    private Integer age;

    private Boolean admin = false;  //是否是管理员

    private Department dept;

    private List roleIds;

    private List<Role> roles;


}