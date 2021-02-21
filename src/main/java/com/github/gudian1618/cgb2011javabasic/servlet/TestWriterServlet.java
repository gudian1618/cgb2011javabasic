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
 * 通知浏览器用utf-8编码响应数据
 * 服务器也使用相同的编码方式
 */
@WebServlet(name = "TestWriterServlet", value = "/TestWriterServlet")
public class TestWriterServlet extends HttpServlet {
    private static final long serialVersionUID = 164268833668465227L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 如果输出中文必须加入下面的代码
        response.setContentType("text/html;charset=utf-8");
        // 通过response获取一个输出流,可以向浏览器发送数据
        PrintWriter out = response.getWriter();

        out.write("Hello 你好 123...");

        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
