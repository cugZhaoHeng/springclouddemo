package com.quantity.serviceprovider.controller;

import com.quantity.serviceprovider.pojo.User;
import com.quantity.serviceprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoheng
 * @DATE 2019/7/25
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User queryUserById(@PathVariable("id") Long id) {
        return this.userService.queryUserById(id);
    }
}
