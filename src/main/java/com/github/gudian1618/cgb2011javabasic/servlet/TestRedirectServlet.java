package com.github.gudian1618.cgb2011javabasic.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author zyd
 * 重定向可以在不同软件内请求跳转
 */
@WebServlet(name = "TestRedirectServlet", value = "/TestRedirectServlet")
public class TestRedirectServlet extends HttpServlet {
    private static final long serialVersionUID = -236077796227403227L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 如果输出中文必须加入下面的代码
        response.setContentType("text/html;charset=utf-8");
        // 通过response获取一个输出流,可以向浏览器发送数据
        PrintWriter out = response.getWriter();

        System.out.println("TestRedirect.doGet()...");
        // 测试1:从TestRedirect重定向到test.jsp
        // response.sendRedirect("test.jsp");
        response.sendRedirect("http://www.baidu.com");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
