package com.dubbo.provider.service;

import com.dubbo.provider.pojo.User;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @author binSin
 * @date 2022/3/30
 */
@Component
@DubboService(version = "1.0.0",interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

    public User getUserById(Integer id) {
        return User.builder().id(id).age(id).name("张三18087").build();
    }
}
