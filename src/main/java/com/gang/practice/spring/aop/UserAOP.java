package com.gang.practice.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @ClassName: UserAop
 * @Description:
 * @Author GaoGang
 * @Date 2016-08-09 14:11
 * @Version V1.0
 */
@Aspect
@Component
public class UserAOP {
    @Pointcut("execution(* com.gang.practice.spring.service.impl.*.find*(..))")
    public void checkUser() {
        //com.gang.aop.service.impl
        System.out.println("----------------查找用户----------------");
    }

    @Pointcut("execution(* com.gang.practice.spring.service.impl.*.add*(..))")
    public void addUser() {
        System.out.println("------切面----------添加用户----------------");
    }

    @Before("checkUser()")
    public void beforeCheck() {
        System.out.println(">>>>>>>> 准备搜查用户..........");
    }

    @After("checkUser()")
    public void afterCheck() {
        System.out.println(">>>>>>>> 搜查用户结束..........");
    }

    @Before("addUser()")
    public void beforeAdd() {
        System.out.println("------------增加用户--add----------Start-------");
    }

    @After("addUser()")
    public void afterAdd() {
        System.out.println("------------增加用户------add----------End------");
    }

    @Around("checkUser()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("进入方法---环绕通知");
        Object o = pjp.proceed();
        System.out.println("退出方法---环绕通知");
        return o;
    }
    @Around("addUser()")
    public Object doAroundAdd(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("进入方法---环绕通知");
        Object o = pjp.proceed();
        System.out.println("退出方法---环绕通知");
        return o;
    }
}
