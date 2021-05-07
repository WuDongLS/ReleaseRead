package com.atguigu.Dao;

import com.atguigu.Utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BaseDao {
    QueryRunner queryRunner = new QueryRunner();

    public int update(String sql,Object... args){
        Connection connection = JDBCUtils.getConnection();
        try {
            return queryRunner.update(connection,sql,args);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            JDBCUtils.release(connection);
        }
    }

    public <T> T queryForOne(Class<T> type,String sql,Object... args){
        Connection connection = JDBCUtils.getConnection();
        try {
            return queryRunner.query(connection,sql,new BeanHandler<>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            JDBCUtils.release(connection);
        }
    }

    public <T> List<T> queryForList(Class<T> type,String sql,Object... args){
        Connection connection = JDBCUtils.getConnection();
        try {
            return queryRunner.query(connection,sql,new BeanListHandler<>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            JDBCUtils.release(connection);
        }
    }

    public Object queryForSingleValue(String sql,Object... args){
        Connection connection = JDBCUtils.getConnection();
        try {
            return queryRunner.query(connection,sql,new ScalarHandler(),args);
        } catch (SQLException e) {
            e.printStackTrace();
            return new RuntimeException(e);
        }finally {
            JDBCUtils.release(connection);
        }
    }
}
