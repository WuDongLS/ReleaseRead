package com.atguigu.Impl;


import com.atguigu.Pojo.User;
import org.junit.Test;

public class UserServiceImplTest {
    UserServiceImpl userService = new UserServiceImpl();

    @Test
    public void registerUser() {
        User user = new User(null,"十三","777","777@163.com");
        userService.registerUser(user);
    }

    @Test
    public void login() {
        User user = new User(null,"十三","777",null);
        User login = userService.login(user);
        System.out.println(login);
    }

    @Test
    public void existsUsername() {
        System.out.println(userService.existsUsername("十三"));
    }
}
