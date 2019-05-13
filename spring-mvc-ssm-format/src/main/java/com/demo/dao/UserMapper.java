package com.demo.dao;

import com.demo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lwx on 2019/5/11.
 */
@Repository
public interface UserMapper {
    Integer insertUser(User user);

    List<User> listUsers();

    List<User>  getUser(String name);

}
