<%@ page import="cn.tju.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: wo
  Date: 2020/5/13
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>detail</title>
</head>
<body>
<%User user=(User)request.getAttribute("user"); %>
 <form action="UpdateUserServlet">
    用户号:<input type="text" name="userno" value="<%= user.getUserno() %>"  readonly="readonly"/><br/>
    姓名:<input type="text" name="username" value="<%=user.getUsername() %>"/><br/>
    密码:<input type="text" name="password" value="<%=user.getPassword() %>"/><br/>
    身份:<input type="text" name="dept" value="<%=user.getDept() %>"/><br/>
    电话:<input type="text" name="phone" value="<%=user.getPhone() %>"/><br/>
    邮件:<input type="text" name="email" value="<%=user.getEmail() %>"/><br/>
    <input type="submit" value="修改"/>
    <a href="queryAllServlet">返回</a>

</form>
</body>
</html>
