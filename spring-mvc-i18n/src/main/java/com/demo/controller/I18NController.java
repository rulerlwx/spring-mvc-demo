package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lwx on 2019/5/15.
 */
@Controller
@RequestMapping("/test")
public class I18NController {

    @RequestMapping("/i18n")
    public String testI18n(){
        return "i18n";
    }
}
