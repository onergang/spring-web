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
            viewName = "redirect:/users/" + userId + "/detail";
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

    @RequestMapping("/{userId}/edit")
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
        // 在需要使用指定数据库的地方加上这个
//        DataSourceContextHolder.setDataSourceType(DataSourceType.SLAVE.getName());
        List<User> users = userService.getUserList();
        model.addAttribute("users", users);
        return model;
    }

    @RequestMapping("/{userId}/detail")
    public String getUserInfo(@PathVariable("userId") Integer userId, Model model) {
        User user = userService.getUserInfo(userId);
        model.addAttribute("user", user);
        return "users/detail";
    }

    @RequestMapping("/{userId}/delete")
    public String removeUser(@PathVariable("userId") Integer userId, Model model) {
        boolean b = userService.deleteUser(userId);
        if (b) {
//            model.addAttribute("user", user);
        }
        return "redirect:/users/list";
    }
}
