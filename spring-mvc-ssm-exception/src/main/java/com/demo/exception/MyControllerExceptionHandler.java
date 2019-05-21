package com.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lwx on 2019/5/21.
 */
@ControllerAdvice
public class MyControllerExceptionHandler {

    @ResponseBody
    @ExceptionHandler({Exception.class})
    public String handleException(Exception ex) {
        System.out.println("出错了："+ex);
        String message = ex.getMessage();
        return "error";
    }
}
