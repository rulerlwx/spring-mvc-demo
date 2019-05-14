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
     * 页面 406 —— 需要添加 jackson 依赖
     *
     * 如下注解使用：
     * @DateTimeFormat(pattern = "yyyy-MM-dd")
     *  private Date birthday;
     *
     * 只对存入时格式化吗，取出时的格式却是 wangwu,Sun May 12 00:00:00 GMT+08:00 2019   ????
     * 答：存入时是springmvc在做工作，从数据库中取出是mybatis在做，不相同。可以使用@JsonFormat
     */
    @ResponseBody
    @RequestMapping("/getUser")
    public List<User> getUser(String name, Model model){
        List<User> userList = userService.getUser(name);

        for(User user: userList) {
            System.out.println(user.getName()+","+user.getBirthday());
        }

        return userList;
    }

    @ResponseBody
    @RequestMapping("/listUsers")
    public List<User> listUsers(){
        return userService.listUsers();
    }


}
