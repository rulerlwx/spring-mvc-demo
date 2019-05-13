package com.demo.service;

import com.demo.domain.User;

import java.util.List;

/**
 * Created by lwx on 2019/5/11.
 */
public interface UserService {
    Integer insertUser(User user);

    List<User> listUsers();

    List<User>  getUser(String name);

}
