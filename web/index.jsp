<%--
  Created by IntelliJ IDEA.
  User: wo
  Date: 2020/5/13
  Time: 9:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  import="cn.tju.entity.User"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<html>
  <head>
    <title>$UserSystem$</title>
  </head>
  <body>


  <table border="1px">
    <tr>
      <th>用户号</th>
      <th>姓名</th>
      <th>身份</th>
      <th>操作</th>
    </tr>
      <%

          ArrayList<User> users = (ArrayList<User>) request.getAttribute("users");
          for (User user : users) {
      %>
    <tr>
      <td><a href="queryUserByUno?userno=<%=user.getUserno() %>"> <%=user.getUserno() %></a></td>
        <td> <%=user.getUsername() %></td>
        <td> <%=user.getDept() %></td>
        <td> <a href="deleteServlet?userno=<%=user.getUserno() %>">删除</a></td>
    </tr>
      <%
          }
      %>
  </table>
  <a href="add.jsp">新增</a>
  <a href="Servlet">aaaa</a>
  <a href="MyServlet">bbbbbbbbbbb</a>
  </body>
</html>
