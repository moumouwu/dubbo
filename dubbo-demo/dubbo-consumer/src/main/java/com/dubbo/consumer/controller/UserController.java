package com.dubbo.consumer.controller;

import com.dubbo.provider.pojo.User;
import com.dubbo.provider.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author binSin
 * @date 2022/3/30
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @DubboReference(version = "*", protocol = "dubbo", loadbalance = "roundrobin")
    private UserService userService;

    @RequestMapping("/{id}")
    public User getUser(@PathVariable("id") int id) {
        User user = userService.getUserById(id);
        log.info("response from provider: {}", user);
        return user;
    }
}

