package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lwx on 2019/5/21.
 */
@Controller
@RequestMapping("/exception")
public class ExceptionTestController {

    @RequestMapping("/test")
    public String testException(){
        int i = 1/0;
        return "index";
    }
}
