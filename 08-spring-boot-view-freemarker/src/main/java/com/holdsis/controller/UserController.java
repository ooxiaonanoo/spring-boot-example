package com.holdsis.controller;

import com.holdsis.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("/showUserList")
    public String showUserList(Model model) {
        List<User> userList = new ArrayList<User>();
        userList.add(new User(1, "测试1号", 22));
        userList.add(new User(2, "测试2号", 24));
        userList.add(new User(3, "测试3号", 26));
        model.addAttribute("userList", userList);
        //根据配置文件在WEB-INF/jsp/目录下返回对应JSP
        return "userList";
    }
}
