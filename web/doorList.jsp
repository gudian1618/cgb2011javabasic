<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: zyd
  Date: 2021/2/21
  Time: 9:26 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>doorList</title>
</head>
<body>
<%
    // 1.获取request域中存入的门店集合信息
    List<String> list = (List<String>) request.getAttribute("list");
    // 遍历门店集合,将门店信息输出到浏览器上,显示在网页上
    for (String door : list) {
        out.write("<p>" + door + "</p>");
    }
    // out类似于response.getWriter(),可以向浏览器发送数据
%>
</body>
</html>
