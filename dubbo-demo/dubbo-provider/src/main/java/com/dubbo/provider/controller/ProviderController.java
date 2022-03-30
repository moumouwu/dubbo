package com.dubbo.provider.controller;

import com.dubbo.provider.pojo.User;
import com.dubbo.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author binSin
 * @date 2022/3/30
 */
@RestController
@RequestMapping("/user")
public class ProviderController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User get(@PathVariable int id) {
        return userService.getUserById(id);
    }
}
