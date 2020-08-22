package cn.wolfcode.rbac.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//指定能贴的位置:贴在方法上
@Target(ElementType.METHOD)
//指定保存的时期（源码/字节码/运行时期）
@Retention(RetentionPolicy.RUNTIME)//:运行时期
public @interface RequiredPermission {

    String[] value();
}
