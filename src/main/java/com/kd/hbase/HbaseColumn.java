package com.kd.hbase;

import java.lang.annotation.*;

/**
 * @author happy
 * @version 0
 * @Package com.kd.hbase
 * @date 2018/5/3 21:44
 * @Description:自定义注解，用于描述字段所属的 family与qualifier. 也就是hbase的列与列簇
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
@Inherited
public @interface HbaseColumn {
    // 列簇
    String family() default "";

    // 列
    String qualifier() default "";

    // 时间戳
    boolean timestamp() default false;
}
