package com.atguigu.Utils;

import org.junit.Test;

import java.sql.Connection;

public class JDBCUtilsTest {
    Connection connection = null;

    @Test
    public void getConnection() {
        connection = JDBCUtils.getConnection();
        System.out.println(connection);
    }

    @Test
    public void release() {
        JDBCUtils.release(connection);
    }
}
