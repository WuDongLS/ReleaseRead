package com.atguigu.Test1;

import com.atguigu.Pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int save(){
        User user  = new User(null,"12","13","45");
        String sql = "insert into t_user(username,password,email) values (?,?,?)";
        return jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }
}
