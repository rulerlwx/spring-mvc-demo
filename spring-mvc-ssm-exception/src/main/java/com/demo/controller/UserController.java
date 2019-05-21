package com.demo.controller;

import com.demo.domain.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * Created by lwx on 2019/5/11.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/addUser")
    public String addUser(@Valid User user, BindingResult result) throws Exception {
        userService.insertUser(user);
        return "addUser";
    }

    /**
     * 这里可以捕捉到dao/service层抛出的异常,进行统一处理，可否？
     *
     * TODO...
     *
     */
    @ResponseBody
    @ExceptionHandler({Exception.class})
    public String handleException(Exception ex) {
        System.out.println("出错了："+ex);
        String message = ex.getMessage();
        return "error";
    }
}
