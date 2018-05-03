package com.kd.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author happy
 * @version 0
 * @Package com.kd.aop
 * @date 2018/5/3 21:54
 * @Description:实现自定义拦截切面类
 */

@Component
@Aspect
public class AspectExample {

    @Pointcut(value = "@annotation(com.kd.aop.AopExample)")
    public void access() {

    }

    @Before("access()")
    public void deBefore(JoinPoint joinPoint) throws Throwable {
        System.out.println("second before");
    }

    @Around("@annotation(handlerLog)")
    public Object around(ProceedingJoinPoint pjp, AopExample handlerLog) {
        // 获取注解里的值
        System.out.println("second around:" + handlerLog.desc());
        try {
            return pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }
}
