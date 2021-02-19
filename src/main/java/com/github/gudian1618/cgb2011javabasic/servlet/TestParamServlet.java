package com.github.gudian1618.cgb2011javabasic.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * @author zyd
 */
public class TestParamServlet extends HttpServlet {
    private static final long serialVersionUID = -6881992172544264390L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 处理响应中文乱码
        response.setContentType("text/html;charset=utf-8");
        // 获取一个response输出流
        PrintWriter out = response.getWriter();
        // 获取请求中所携带的数据(请求参数)
        String user = request.getParameter("user");
        System.out.println("user:" + user);
        String[] likes = request.getParameterValues("like");
        System.out.println("like=" + Arrays.toString(likes));
        out.write("TestParamServlet...");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
