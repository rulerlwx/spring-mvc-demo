package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lwx on 2019/5/15.
 */
@Controller
@RequestMapping("/test")
public class RestTestController {

    /**
     * 跳转到“增、删、改、查”页面
     */
    @GetMapping("/testRest")
    public String testRest(){
        return "restfull";
    }

    @PostMapping("/rest/{id}")
    public String testPost(@PathVariable("id")String id) {
        System.out.println("rest---POST--"+id);
        return "restfull";
    }

    @DeleteMapping("/rest/{id}")
    public String testDelete(@PathVariable("id")String id) {
        System.out.println("rest---Delete--"+id);
        return "restfull";
    }

    @PutMapping("/rest/{id}")
    public String testPUT(@PathVariable("id")String id) {
        System.out.println("rest---PUT--"+id);
        return "restfull";
    }

    @GetMapping("/rest/{id}")
    public String testGET(@PathVariable("id")String id) {
        System.out.println("rest---GET--"+id);
        return "restfull";
    }

}
