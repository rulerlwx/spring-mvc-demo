package com.demo.service.impl;

import com.demo.dao.UserMapper;
import com.demo.domain.User;
import com.demo.service.UserService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lwx on 2019/5/11.
 */
@Service("userService")
public class UserServiceImpl  implements UserService {

    @Autowired
    SqlSessionTemplate sessionTemplate;

    @Autowired
    UserMapper userMapper;

    public Integer insertUser(User user) {
        return sessionTemplate.insert("com.demo.dao.UserMapper.insertUser", user);
    }

    @Override
    public List<User> listUsers() {
        return userMapper.listUsers();
    }

    @Override
    public List<User>  getUser(String name) {
        return userMapper.getUser(name);
    }
}
