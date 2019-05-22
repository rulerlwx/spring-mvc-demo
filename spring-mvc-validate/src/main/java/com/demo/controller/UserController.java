package com.demo.controller;

import com.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

/**
 * MVC 校验
 *
 *
 * Created by lwx on 2019/5/10.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 跳转到添加用户页面
     */
    @RequestMapping("/addUser")
    public String addUser(){
        return "addUser";
    }

    /**
     * 添加用户
     *
     * @ModelAttribute 可以将 user 带到页面
     */
    @RequestMapping("/saveUser")
    public String saveUser(@Valid @ModelAttribute User user, BindingResult result){
        if(result.hasErrors()){
            List<FieldError> fieldErrors = result.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                System.out.println(fieldError.getField()+","+fieldError.getDefaultMessage());
            }
        }
        return "addUser";
    }
    @GetMapping("/getUserById")
    public String getUserById() {
        System.out.println("----------getUserById------------");
        return "addUser";
    }
}
