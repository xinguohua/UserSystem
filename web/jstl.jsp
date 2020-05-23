<%--
  Created by IntelliJ IDEA.
  User: wo
  Date: 2020/5/23
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="name"    value="zhangsan"   scope="request"/>
${requestScope.name}
</body>
</html>
