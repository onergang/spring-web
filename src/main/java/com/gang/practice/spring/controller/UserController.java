package com.gang.practice.spring.controller;

import com.gang.practice.spring.po.User;
import com.gang.practice.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

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

    @RequestMapping("/{type}")
    public String userOperation(@PathVariable("type") String type) {
        String result = type;
        switch (result) {
            case "1":
                result = "users/login";
                break;
            case "2":
                result = "users/add";
                break;
            case "3":
                result = "users/edit";
                break;
            default:
                result = "users/hello";

        }
        return result;
    }

    @RequestMapping("/login")
    public String userLogin(User user) {
        String userId = userService.checkUser(user);
        String viewName = "users/add";
        if (userId != null && !userId.trim().isEmpty()) {
            viewName = "redirect:/users/detail/" + userId;
        }
        return viewName;
    }

    @RequestMapping("/add")
    public ModelAndView addUser(User user) {
        ModelAndView mv = new ModelAndView();
        boolean b = userService.addUser(user);
        if (b) {
            mv.setViewName("users/add");
            mv.addObject("ok", "成功");
        }
        return mv;
    }

    @RequestMapping("/edit/{userId}")
    public String editUserSkip(@PathVariable("userId") Integer userId, Model model) {
        if (null != userId)
            model.addAttribute("user", userService.getUserInfo(userId));
        return "/users/edit";
    }

    @RequestMapping("/edit")
    public String editUser(@ModelAttribute User user) {
        String viewName = "/users/edit";
        if (null != user) {
            boolean flag = userService.editUser(user);
            if (flag)
                viewName = "/users/detail";
        }
        return viewName;
    }

    @RequestMapping("/list")
    public Model getUserList(Model model) {
        List<User> users = userService.getUserList();
        model.addAttribute("users", users);
        return model;
    }

    @RequestMapping("/detail/{id}")
    public String getUserInfo(@PathVariable("id") Integer id, Model model) {
        User user = userService.getUserInfo(id);
        model.addAttribute("user", user);
        return "users/detail";
    }

    @RequestMapping("/delete/{id}")
    public String removeUser(@PathVariable("id") Integer id, Model model) {
        boolean b = userService.deleteUser(id);
        if (b) {
//            model.addAttribute("user", user);
        }
        return "redirect:/users/add";
    }
}
