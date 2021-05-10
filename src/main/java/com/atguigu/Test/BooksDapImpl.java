package com.atguigu.Test;

import com.atguigu.Pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Repository
public class BooksDapImpl implements BooksDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addUser(User user){
        String sql = "insert into t_user(username,password,email) values(?,?,?)";
        jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),user.getEmail());

    }

    @Override
    public void change() {
        String sql = "delete from t_user where id = ?";

        jdbcTemplate.update(sql,10);
    }


}
