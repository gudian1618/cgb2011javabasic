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
 */
@WebServlet(name = "/HelloServlet")
public class HelloServlet extends HttpServlet {

    private static final long serialVersionUID = -1209297918670834228L;

    /**
     * 当浏览器发送请求访问当前Servlet,如果请求为GET提交,服务器将会调用doGet方法
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 如果输出中文必须加入下面的代码
        response.setContentType("text/html;charset=utf-8");
        // 通过response获取一个输出流,可以向浏览器发送数据

        PrintWriter out = response.getWriter();
        out.write("hello world...!你好");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
