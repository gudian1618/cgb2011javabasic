package com.github.gudian1618.cgb2011javabasic.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zyd
 * 负责查询所有的门店信息
 */
@WebServlet(name = "DoorListServlet", value = "/DoorListServlet")
public class DoorListServlet extends HttpServlet {
    private static final long serialVersionUID = -6198093269215691195L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 如果输出中文必须加入下面的代码
        response.setContentType("text/html;charset=utf-8");
        // 通过response获取一个输出流,可以向浏览器发送数据
        PrintWriter out = response.getWriter();

        // 1.模拟查询数据库,查询所有的门店集合
        List<String> doorList = new ArrayList<>();
        doorList.add("01.永和北三环西路店,010-67676767");
        doorList.add("02.永和西直门店,010-67676768");
        doorList.add("03.永和东直门店,010-67676769");
        doorList.add("04.永和西直门店,010-67676770");
        doorList.add("05.永和天安门店,010-67676771");

        // 2. 通过请求转发+域对象将门店集合带到JSP,有JSP响应
        // 2.1 将萌点集合存入到request域中
        request.setAttribute("list", doorList);
        // 2.2 将请求转发到相应的doorList.jsp,在jsp中取出所有的门店显示在网页中
        request.getRequestDispatcher("doorList.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
