package cn.wolfcode.rbac.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Role {
    private Long id;

    private String name;

    private String sn;

    private List<Permission> permissions;

    private List<Long> permissionIds;


}