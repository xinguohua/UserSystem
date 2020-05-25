<%--
  Created by IntelliJ IDEA.
  User: wo
  Date: 2020/5/24
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    System.out.print("=====session销毁页面====");
    session.invalidate();
%>
</body>
</html>
