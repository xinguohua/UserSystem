<%--
  Created by IntelliJ IDEA.
  User: wo
  Date: 2020/5/24
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>ajax</title>
    <script type="text/javascript" src="js/jquery.js"/>
    <script type="text/javascript">
        function register(){
            var mobile =document.getElementById("mobile").value;
            $.ajax({
                url:"MobileServlet",
                请求方式:"post",
                data:"mobile="+$mobile,
                success:function(result,testStatus)
                {
                    if(result =="true"){
                        alert("已存在，注册失败");
                    }else {
                        alert("注册成功");
                    }
                },
                error:function(xhr,errorMessage,e){
                alert("系统异常");
            }
            });

        }
</script>
</head>
<body>
    <!--原来是form action 是全局刷新-->
     手机：<input id="mobile"/><br/>
    <input type="button" value="注册" onclick="register()"/><br/>
</body>
</html>
