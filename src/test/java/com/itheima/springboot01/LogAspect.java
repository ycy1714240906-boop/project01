package com.itheima.springboot01;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org. aspectj. lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Around("execution(* com.itheima.springboot01.Person.add(..))")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long begin = System.currentTimeMillis();

        Object result;
        try {
            // 执行目标方法并获取返回值
            result = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("方法执行异常: " + e.getMessage());
            throw e; // 重新抛出异常
        }

        long end = System.currentTimeMillis();
        System.out.println("方法执行耗时：" + (end - begin) + "毫秒");

        return result; // 返回方法执行结果
    }
}
