package com.springapp;

import com.gang.practice.spring.po.User;
import com.gang.practice.spring.service.UserService;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: AopTest
 * @Description:
 * @Copyright: Copyright (c) 2016
 * @Company: 伟业我爱我家
 * @Author GaoGang
 * @Date 2016-08-09 15:38
 * @Version V1.0
 */
public class AopTest {

    public static UserService<User> userService;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        AbstractApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
        userService = (UserService) cxt.getBean("userService");
    }


    public static  void main(String arg[]){
        try {
            setUpBeforeClass();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void saveTest() {
        userService.addUser(new User());
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}
