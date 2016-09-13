package com.gang.practice.spring.aop;

import com.gang.practice.spring.po.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

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
        System.out.println("----------------查找用户----------------");
    }

    @Pointcut("execution(* com.gang.practice.spring.service.impl.*.add*(..))")
    private void addUser() {
        System.out.println("------切面----------添加用户----------------");
    }

    @Before("checkUser()")
    public void beforeCheck(JoinPoint point) {
        System.out.println(">>>>>>>> 准备搜查用户..........");
    }

    @After("checkUser()")
    public void afterCheck() {
        System.out.println(">>>>>>>> 搜查用户结束..........");
    }

    @Before("addUser()")
    public void beforeAdd(JoinPoint point) {
        System.out.println("@Before：模拟权限检查...");
        System.out.println("@Before：目标方法为：" +
                point.getSignature().getDeclaringTypeName() +
                "." + point.getSignature().getName());
        Object[] objects = point.getArgs();
        User user = new User();
        for (Object object : objects) {
            if (object instanceof User) {
                user = (User) object;
                System.out.println("-------user--------" + user.toString());
            }
        }
        System.out.println("@Before：参数为：" + Arrays.toString(point.getArgs()));
        System.out.println("@Before：被织入的目标对象为：" + point.getTarget());
        System.out.println("------------增加用户--add----------Start-------");
    }

    @After("addUser()")
    public void afterAdd() {
        System.out.println("------------增加用户------add----------End------");
    }

    @Around("checkUser()")
    public Object doAround(ProceedingJoinPoint point) throws Throwable {
        System.out.println("进入方法---环绕通知");
        Object[] args = point.getArgs();
        if (args != null && args.length > 0 && args[0].getClass() == String.class) {
            args[0] = "改变后的参数1";
        }
        Object returnValue = point.proceed(args);
        System.out.println("退出方法---环绕通知");
        return "原返回值：" + returnValue + "，这是返回结果的后缀";

    }

    @Around("addUser()")
    public Object doAroundAdd(ProceedingJoinPoint point) throws Throwable {
        System.out.println("进入方法---环绕通知");
        System.out.println("@Around：执行目标方法之前...");
        //访问目标方法的参数：
        Object[] args = point.getArgs();
        if (args != null && args.length > 0 && args[0].getClass() == String.class) {
            args[0] = "改变后的参数1";
        }
        //用改变后的参数执行目标方法
        Object returnValue = point.proceed(args);
        System.out.println("@Around：执行目标方法之后...");
        System.out.println("@Around：被织入的目标对象为：" + point.getTarget());
        System.out.println("退出方法---环绕通知");
        return "原返回值：" + returnValue + "，这是返回结果的后缀";
    }
}
