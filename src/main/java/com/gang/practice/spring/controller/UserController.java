package com.gang.practice.spring.controller;

import com.gang.practice.spring.po.User;
import com.gang.practice.spring.service.UserService;
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
 * @Description: Controller
 * @Author GaoGang
 * @Date 2016-08-22 15:54
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
        ModelAndView mv=new ModelAndView();
        boolean b=userService.addUser(user);
        if(b){
            mv.setViewName("users/add");
            mv.addObject("ok","成功");
        }
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
}
