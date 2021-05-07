package com.atguigu.Dao;


import com.atguigu.Pojo.User;
import org.junit.Test;

import java.util.List;

public class BaseDaoTest {

    BaseDao baseDao = new BaseDao();
    @Test
    public void update() {
        String sql = "insert into t_user(id,username,password,email) values (?,?,?,?)";
        baseDao.update(sql,3,"阿七","666","666@163.com");
    }

    @Test
    public void queryForOne() {
        String sql = "select * from t_user where id = ?";
        System.out.println(baseDao.queryForOne(User.class,sql,3));
    }

    @Test
    public void queryForList() {
        String sql = "select * from t_user";
        List<User> users = baseDao.queryForList(User.class, sql);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void queryForSingleValue() {
        String sql = "select count(*) from t_user";
        Number number = (Number) baseDao.queryForSingleValue(sql);
        System.out.println(number.intValue());
    }
}
