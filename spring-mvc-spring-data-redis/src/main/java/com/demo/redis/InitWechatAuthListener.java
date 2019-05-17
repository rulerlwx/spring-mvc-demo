package com.demo.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * 初始化生成微信token
 * Created by lwx on 2019/5/17.
 */
public class InitWechatAuthListener implements ApplicationListener<ContextRefreshedEvent> {

    //private static final Logger logger = Logger.getLogger(InitWechatAuthListener.class);

    @Autowired
    private MyRedisCacheManager myRedisCacheManager;

    private static boolean isStart = false; // 防止二次调用

    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (!isStart) {
            isStart = true;
            String token = null;
//            token = HttpReqUtil.getAccessToken(WechatConfig.APP_ID,WechatConfig.APP_SECRET);
            myRedisCacheManager.set("phil_token", token, 3600); //1小时
        }
    }
}
