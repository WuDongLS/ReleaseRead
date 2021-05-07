package com.atguigu.Impl;

import com.atguigu.Dao.BaseDao;
import com.atguigu.Dao.UserServiceDao;
import com.atguigu.Pojo.User;

public class UserServiceImpl extends BaseDao implements UserServiceDao {
    @Override
    public void registerUser(User user) {
        String sql = "insert into t_user(username,password,email) values (?,?,?)";
        update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }

    @Override
    public User login(User user) {
        String sql = "select * from t_user where username = ? and password = ?";
        return queryForOne(User.class,sql,user.getUsername(),user.getPassword());
    }

    @Override
    public boolean existsUsername(String username) {
        String sql = "select * from t_user where username = ?";
        if (queryForOne(User.class,sql,username) != null){
            return true;
        }
        return false;
    }
}
