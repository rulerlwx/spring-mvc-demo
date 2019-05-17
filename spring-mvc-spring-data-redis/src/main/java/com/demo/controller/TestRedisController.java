package com.demo.controller;

import com.demo.redis.MyRedisCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lwx on 2019/5/17.
 */
@Controller
@RequestMapping("/redis")
public class TestRedisController {

    @Autowired
    public MyRedisCacheManager redisCacheManager;

    @Autowired
    public RedisTemplate redisTemplate;

    @ResponseBody
    @RequestMapping("/test")
    public Object testRedis(){
        redisCacheManager.set("redis", "test");
        System.out.println(redisCacheManager.get("redis"));
        return redisCacheManager.get("redis");
    }
}
