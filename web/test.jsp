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
    <script src="js/jquery.js"></script>

    <script type="text/javascript">
        function register() {
            var mobile = document.getElementById("mobile").value;

            $.getJSON(
                "MobileServlet",
                {"name":"zs",
                    "age":24
                },
                function(result) {
                    //json中有多个对象 此时result {"user1":user1,"user2":user2,"user3":user3}
                    //js通过eval()函数，将返回值转为一个js能够识别的json对象
                    var json = eval(result);
                    $.each(json,function (i,element) {
                        alert(this.username+"   "+this.password)

                    })


                }
            );
        }




    </script>
</head>
<body>
    <!--原来是form action 是全局刷新-->
     手机：<input id="mobile"/><br/>
    <input type="button" value="注册" onclick="register()"/><br/>
    <span id="tip"></span>
</body>
</html>
