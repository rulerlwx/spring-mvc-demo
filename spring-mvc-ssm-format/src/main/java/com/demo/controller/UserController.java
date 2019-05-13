package com.demo.controller;

import com.demo.domain.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * Created by lwx on 2019/5/11.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/addUser")
    public String addUser(@Valid User user, BindingResult result){
        user.setBirthday(new Date());
        userService.insertUser(user);
        return "addUser";
    }

    /**
     * 返回JSON数据，TODO...
     *
     * 页面 406
     *
     *     @DateTimeFormat(pattern = "yyyy-MM-dd")
            private Date birthday;
            只对存入时格式化吗，取出时的格式却是 wangwu,Sun May 12 00:00:00 GMT+08:00 2019   ????
     */
    //@ResponseBody
    @RequestMapping("/getUser")
    public String getUser(String name, Model model){
        List<User> userList = userService.getUser(name);
        System.out.println(userList.get(0).getName()+","+userList.get(0).getBirthday());
        model.addAttribute("userList", userList);
        return "userInfo";
    }

    //@ResponseBody
    @RequestMapping("/listUsers")
    public List<User> listUsers(){
        return userService.listUsers();
    }


}
