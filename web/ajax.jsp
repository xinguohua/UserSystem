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
    <script type="text/javascript">
        function register(){
            var mobile =document.getElementById("mobile").value;
            //通过ajax异步方式请求服务端
            xmlHttpRequest = new XMLHttpRequest(); //全局变量
            //设置xmlHttpRequest对象的回调函数
            xmlHttpRequest.onreadystatechange =callback


            xmlHttpRequest.open("post","MobileServlet",true) //建立连接 post方式
            xmlHttpRequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded"); //post方式设置头消息
            xmlHttpRequest.send("mobile="+mobile); //k=v
        }
        function registerGet(){
            var mobile =document.getElementById("mobile").value;
            //通过ajax异步方式请求服务端
            xmlHttpRequest = new XMLHttpRequest(); //全局变量
            //设置xmlHttpRequest对象的回调函数
            xmlHttpRequest.onreadystatechange =callback


            xmlHttpRequest.open("get","MobileServlet?mobile="+mobile,true) //建立连接 post方式
            xmlHttpRequest.send(null); //k=v
        }
        //定义回调函数(接受服务端的返回值)
        function callback() {
            if(xmlHttpRequest.readyState ==4&&xmlHttpRequest.status ==200){
                //接受服务端返回的数据
                var data=xmlHttpRequest.responseText;//服务端返回值为string格式
                if(data =="true"){
                    alert("此号码已存在，请更换");
                }else {
                    alert("注册成功");
                }

            }
        }



    </script>
</head>
<body>
    <!--原来是form action 是全局刷新-->
     手机：<input id="mobile"/><br/>
    <input type="button" value="注册" onclick="register()"/><br/>
</body>
</html>
