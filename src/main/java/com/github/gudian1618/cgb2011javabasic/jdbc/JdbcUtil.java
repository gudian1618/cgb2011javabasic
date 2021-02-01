package com.github.gudian1618.cgb2011javabasic.jdbc;

import java.sql.*;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/2/1 10:28 下午
 * 释放关闭jdbc资源工具类
 */

public class JdbcUtil {

    /**
     * 注册驱动并获取连接对象
     * @return conn
     */
    public static Connection getConn() {
        // 注册驱动并获取连接
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jt_db_test?characterEncoding" +
                "=utf-8", "root", "123456");
            // 将连接返回
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 释放资源
     * @param conn
     * @param stat
     * @param rs
     */
    public static void close(Connection conn, Statement stat, ResultSet rs) {
        // 释放资源
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                rs = null;
            }
        }
        if (stat != null) {
            // 6.释放资源
            try {
                stat.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                stat = null;
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                conn = null;
            }
        }
    }

}
