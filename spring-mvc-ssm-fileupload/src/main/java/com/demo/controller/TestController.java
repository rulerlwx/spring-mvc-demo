package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

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
