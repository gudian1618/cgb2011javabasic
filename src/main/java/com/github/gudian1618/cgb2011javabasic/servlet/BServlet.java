package com.github.gudian1618.cgb2011javabasic.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BServlet extends HttpServlet {
    private static final long serialVersionUID = 7875451044264277242L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 如果输出中文必须加入下面的代码
        response.setContentType("text/html;charset=utf-8");
        // 通过response获取一个输出流,可以向浏览器发送数据
        PrintWriter out = response.getWriter();

        // 获取在AServlet中往request独享的map集合里存入的name属性值
        Object name = (String) request.getAttribute("name");
        System.out.println("BServlet:name=" + name);

        System.out.println("BServlet.doGet()....");

        out.write("Hello BServlet.doGet()...");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
