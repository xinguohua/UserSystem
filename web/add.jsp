<%--
  Created by IntelliJ IDEA.
  User: wo
  Date: 2020/5/15
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>insert</title>
</head>
<body>
<form action="insertServlet" method="post">
    用户号:<input type="text" name="userno"   /><br/>
    姓名:<input type="text" name="username" /><br/>
    密码:<input type="text" name="password" /><br/>
    身份:<input type="text" name="dept"  /><br/>
    电话:<input type="text" name="phone" /><br/>
    邮件:<input type="text" name="email" /><br/>
    <input type="submit" value="增加"/>
    <a href="queryAllServlet">返回</a>


</form>
</body>
</html>
