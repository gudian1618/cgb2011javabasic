package com.github.gudian1618.cgb2011javabasic.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author zyd
 */
public class AServlet extends HttpServlet {
    private static final long serialVersionUID = -7934713627477809053L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 如果输出中文必须加入下面的代码
        response.setContentType("text/html;charset=utf-8");
        // 通过response获取一个输出流,可以向浏览器发送数据
        PrintWriter out = response.getWriter();

        // ===============将请求从A转发到B================
        System.out.println("AServlet.doGet()....");

        // 转发前往request对象的map集合中存入一个数据
        request.setAttribute("name", "刘德华");

        request.getRequestDispatcher("BServlet").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
