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

        System.out.println("==============================");
        // ======练习:获取注册表单中的请求参数

        // 获取请求中的username
        String username = request.getParameter("username");
        System.out.println("username=" + username);
        // 获取请求中的pwd
        String pwd = request.getParameter("pwd");
        System.out.println("pwd=" + pwd);
        // 获取请求中的gender
        String gender = request.getParameter("gender");
        System.out.println("gender=" + gender);
        // 获取请求中的like
        String like = request.getParameter("like");
        System.out.println("like=" + like);
        // 获取请求中的city
        String city = request.getParameter("city");
        System.out.println("city=" + city);
        // 获取请求中的descriptregist.htmlion
        String description = request.getParameter("description");
        System.out.println("description=" + description);

        out.write("TestParamServlet...");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
