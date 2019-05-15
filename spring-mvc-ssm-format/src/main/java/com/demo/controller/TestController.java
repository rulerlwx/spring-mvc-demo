package com.demo.controller;

import com.demo.domain.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * Created by lwx on 2019/5/13.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/testConversion")
    public String testConversion(@RequestParam("apply_time")Date apply_time){
        System.out.println(apply_time);
        return "addUser";
    }
}
