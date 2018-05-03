package com.kd.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author happy
 * @version 0
 * @Package com.kd.aop
 * @date 2018/5/3 21:53
 * @Description:自定义注解AOP切面打印消息
 */

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface AopExample {
    String desc() default "无信息";
}
