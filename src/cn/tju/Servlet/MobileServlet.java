package cn.tju.Servlet;

import cn.tju.entity.User;
import com.alibaba.fastjson.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MobileServlet",urlPatterns = "/MobileServlet")
public class MobileServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8"); //处理post请求编码
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");


        PrintWriter out = response.getWriter();

            User user1 = new User("xgh", "123");
            User user2 = new User("xgh2", "123");
            User user3 = new User("xgh4", "123");


            JSONObject json = new JSONObject();
            json.put("user1",user1);
            json.put("user2",user2);
            json.put("user3",user3);
            //返回的json对象 {"user1":user1,"user2":user2,"user3":user3}
            System.out.println(json);
            out.print(json);


    }
}
