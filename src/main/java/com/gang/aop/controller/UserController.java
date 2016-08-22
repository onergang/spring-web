package com.gang.aop.controller;

import com.gang.aop.po.User;
import com.gang.aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

/**
 * @ClassName: UserController
 * @Description:
 * @Copyright: Copyright (c) 2016
 * @Company: 伟业我爱我家
 * @Author GaoGang
 * @Date 2016-08-09 14:08
 * @Version V1.0
 */
@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    @Qualifier("userService")
    private UserService<User> userService;

    @RequestMapping("/index/{type}")
    public String userOperation(@PathVariable("type") String type) {
        System.out.println("---------index-----------------"+type);
        String result =type;
        switch (result) {
            case "1":
                result = "users/add";
                break;
            case "2":
                result = "users/edit";
                break;
            default:
                result = "users/hello";

        }

        return result;
    }

    @RequestMapping("/add")
    public ModelAndView addUser(User user) {
        System.out.println("----------add----------------" + new Date());
        System.out.println("------------data--------------" + user.toString());
        ModelAndView mv=new ModelAndView();
        mv.setViewName("users/add");
        mv.addObject("ok","成功");
        return mv;
    }

    @RequestMapping("/edit")
    public String editUser(@ModelAttribute User user) {
        System.out.println("----------edit----------------" + new Date());
        System.out.println("------------edit--------------" + user.toString());
        if (userService.editUser(user)) {
            System.out.println("-------ok----------------");
        }
        return "/users/edit";
    }
    public static void main(String args[]){
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/mydb?user=root&password=123456";
            //定义连接数据库的url
            conn= DriverManager.getConnection(url);   //获取数据库连接
            System.out.println("数据库连接成功！"+conn);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
