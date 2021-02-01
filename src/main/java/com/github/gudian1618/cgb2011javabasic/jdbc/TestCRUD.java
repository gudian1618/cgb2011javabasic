package com.github.gudian1618.cgb2011javabasic.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/2/1 9:59 下午
 * 测试jdbc增删改查
 */

public class TestCRUD {

    @Test
    public void testInsert() {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;

        try {
            // 注册驱动并获取连接
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jd_db_test?characterEncoding=utf-8", "root",
                "123456");
            // 获取传输器
            stat = conn.createStatement();
            // 发送SQL到服务器执行,并返回结果
            String sql = "insert into account values(null, 'join', 3500)";
            int rows = stat.executeUpdate(sql);
            // 处理结果
            System.out.println("影响行数: " + rows);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            JdbcUtil.close(conn, stat, rs);
        }

    }

    @Test
    public void testUpdate() {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;

        try {
            // 注册驱动并获取连接
            conn = JdbcUtil.getConn();
            // 获取传输器
            stat = conn.createStatement();
            // 发送SQL到服务器执行,并返回结果
            String sql = "update account set money = 1500 where name='join'";
            int rows = stat.executeUpdate(sql);
            // 处理结果
            System.out.println("影响行数: " + rows);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            JdbcUtil.close(conn, stat, rs);
        }
    }

    @Test
    public void testFind() {

    }

    @Test
    public void testDelete() {

    }

}
