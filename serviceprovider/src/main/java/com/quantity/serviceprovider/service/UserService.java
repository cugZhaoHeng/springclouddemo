package com.quantity.serviceprovider.service;

import com.quantity.serviceprovider.mapper.UserMapper;
import com.quantity.serviceprovider.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhaoheng
 * @DATE 2019/7/25
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User queryUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
