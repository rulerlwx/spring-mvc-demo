package com.demo.service.impl;

import com.demo.dao.UserMapper;
import com.demo.domain.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lwx on 2019/5/11.
 */
@Service("userService")
public class UserServiceImpl  implements UserService {

    @Autowired
    UserMapper userMapper;

    public Integer insertUser(User user) {
        return userMapper.insertUser(user);
    }
}
