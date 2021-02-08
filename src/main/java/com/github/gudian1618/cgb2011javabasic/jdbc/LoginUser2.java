package com.github.gudian1618.cgb2011javabasic.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/2/3 8:46 下午
 * 模拟用户登录
 * 通过java的PreparedStatement方法对象,来保证对象的sql安全
 */

public class LoginUser2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1.提示用户登录
        System.out.println("请登录:");
        // 2.提示用户输入用户名并接收
        System.out.println("请输入用户名:");
        String user = sc.nextLine();
        // 3.提示用户输入密码
        System.out.println("请输入密码:");
        String pwd = sc.nextLine();
        // 4.调用login方法实现登录
        login(user, pwd);
    }

    /**
     * 根据用户名和密码查询user表,如果能够查询到数据则允许登录,否则登录失败
     *
     * @param user
     * @param pwd
     */
    private static void login(String user, String pwd) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // 注册驱动并获取连接
            conn = JdbcUtil.getConn();
            // 获取传输器并发送sql到服务器执行,并返回执行结果
            String sql = "select * from user where username=? and password=?";
            ps = conn.prepareStatement(sql);
            // 设置SQL参数
            ps.setString(1, user);
            ps.setString(2, pwd);

            // 指向SQL语句
            rs = ps.executeQuery();

            // 处理结果
            if (rs.next()) {
                System.out.println("恭喜您登陆成功!");
            } else {
                System.out.println("登录失败!用户名和密码错误!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(conn, ps, rs);
        }

    }

}
