package com.demo.controller;

import com.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by lwx on 2019/5/10.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/addUser")
    public String addUser(@Valid User user, BindingResult result){
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
