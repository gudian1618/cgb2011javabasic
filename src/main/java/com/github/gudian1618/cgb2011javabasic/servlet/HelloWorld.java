package com.github.gudian1618.cgb2011javabasic.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/2/19 7:05 下午
 */

public class HelloWorld extends HttpServlet {
    private static final long serialVersionUID = -1824477987940826988L;

    /**
     * 当浏览器发送请求访问当前Servlet,如果请求为GET提交,服务器将会调用doGet方法
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    /**
     * 当浏览器发送请求访问当前Servlet,如果请求为POST提交,服务器将会调用doPost方法
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
