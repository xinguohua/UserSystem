<%--
  Created by IntelliJ IDEA.
  User: wo
  Date: 2020/5/24
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
//ServletContext对象 就是application
    application.setAttribute("name","zs");
    application.setAttribute("name","ls");
    application.removeAttribute("name");

    session.setAttribute("user","zs");
    session.setAttribute("user","ls");
    session.removeAttribute("user");

    request.setAttribute("user2","zs");
    request.setAttribute("user2","ls");
    request.removeAttribute("user2");
%>
</body>
</html>
