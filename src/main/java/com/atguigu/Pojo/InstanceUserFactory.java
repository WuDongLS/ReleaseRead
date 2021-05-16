package com.atguigu.Pojo;

public class InstanceUserFactory {


    public User getUser(String username,String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setId(1);
        user.setEmail(username+password);
        return user;
    }
}
