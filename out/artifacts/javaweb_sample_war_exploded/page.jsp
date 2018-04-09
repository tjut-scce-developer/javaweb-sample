<%@ page import="po.UsertablePO" %><%--
  Created by IntelliJ IDEA.
  User: AT
  Date: 2018/4/5
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
<h1>这里是主页</h1>
<h2>你的身份是：</h2>
<% UsertablePO usertablePO = (UsertablePO) request.getSession().getAttribute("userInfo"); %>
<div id="loginprint">
    <h3>姓名：<%=usertablePO.getRealname() %></h3>
    <h3>电话：<%=usertablePO.getTel() %></h3>
    <h3>邮箱：<%=usertablePO.getEmail() %></h3>
</div>
</body>
</html>
