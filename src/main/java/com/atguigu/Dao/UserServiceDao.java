package com.atguigu.Dao;

import com.atguigu.Pojo.User;

public interface UserServiceDao {
    public void registerUser(User user);
    public User login(User user);
    public boolean existsUsername(String username);
    //如何实现修改用户信息
    public boolean updateById(Integer id,User user);
}
