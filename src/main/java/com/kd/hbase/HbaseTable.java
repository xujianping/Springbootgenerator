package com.kd.hbase;

import java.lang.annotation.*;

/**
 * @author happy
 * @version 0
 * @Package com.kd.hbase
 * @date 2018/5/3 21:45
 * @Description:自定义注解，用于获取table
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
@Inherited
public @interface HbaseTable {
    // 表名
    String tableName() default "";
}
