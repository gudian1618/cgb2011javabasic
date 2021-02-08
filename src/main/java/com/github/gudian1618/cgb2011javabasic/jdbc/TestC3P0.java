package com.github.gudian1618.cgb2011javabasic.jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/2/8 8:59 下午
 * 测试C3P0连接池的使用
 */

public class TestC3P0 {

    @Test
    public void testFindAll() {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;

        // 1.创建一个连接池对象(容器)
        ComboPooledDataSource pool = new ComboPooledDataSource();

        try {
            // 2.设置连接数据库的基本信息
            // pool.setDriverClass("com.mysql.jdbc.Driver");
            // pool.setJdbcUrl("jdbc:mysql:///jt_db_test?characterEncoding=utf-8");
            // pool.setUser("root");
            // pool.setPassword("123456");

            // 3.从连接池中获取连接对象
            conn = pool.getConnection();
            stat = conn.createStatement();

            String sql = "select * from account";
            rs = stat.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double money = rs.getDouble("money");
                System.out.println(id + ":" + name + ":" + money);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 4.换回连接池中
            // 如果连接对象使我们自己获取的一个连接对象,调用conn.close方法是将连接关闭还给数据库
            // 如果是通过连接池创建爱你的一个连接对象,由于连接池在将连接返回之前,对连接对象进行了改造,
            // 将连接对象的close方法改为了还连接到连接池中,因此同样是调用conn.close方法将连接还回到连接池中
            JdbcUtil.close(conn, stat, rs);
        }
    }

}
