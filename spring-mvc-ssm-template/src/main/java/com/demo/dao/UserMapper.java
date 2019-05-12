package com.demo.dao;

import com.demo.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by lwx on 2019/5/11.
 */
@Repository
public interface UserMapper {
    Integer insertUser(User user);
}
