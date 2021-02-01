package com.github.gudian1618.cgb2011javabasic.jdbc;

import java.sql.*;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/2/1 7:59 下午
 * JDBC快速入门测试
 * 1.注册数据库驱动
 * 2.获取数据库连接
 * 3.获取传输器
 * 4.发送sql到服务器执行并返回执行结果
 * 5.处理结果
 * 6.释放资源
 */

public class TestJdbc {

    public static void main(String[] args) {

        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;

        // 1.注册数据库驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // 2.获取数据库连接
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jt_db_test?characterEncoding=utf-8",
                "root", "123456"
            );
            // 3.获取传输器
            stat = conn.createStatement();
            // 4.发送sql到服务器执行并返回执行结果
            String sql = "select * from account";
            rs = stat.executeQuery(sql);
            // 5.处理结果
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double money = rs.getDouble("money");
                System.out.println(id + ":" + name + ":" + "money");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 6.释放资源
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

        System.out.println("执行完成!");
    }

}
