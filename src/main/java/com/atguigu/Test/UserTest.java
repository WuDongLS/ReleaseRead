package com.atguigu.Test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("user")
public class UserTest {

    @Value("十三")
    private String name;
    @Autowired(required = false)
    @Qualifier("user1")
//    @Resource(name = "user1")
    private User1 user1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User1 getUser1() {
        return user1;
    }

    public void setUser1(User1 user1) {
        this.user1 = user1;
    }

    @Override
    public String toString() {
        return "UserTest{" +
                "name='" + name + '\'' +
                ", user1=" + user1.push() +
                '}';
    }

    public void show(){
        System.out.println(toString());
    }
}
