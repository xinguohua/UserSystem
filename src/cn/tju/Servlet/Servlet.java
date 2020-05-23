package cn.tju.Servlet;

import cn.tju.entity.User;

import javax.jws.soap.SOAPBinding;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Servlet",urlPatterns = "/Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User(12,"xgh","111","math","131","@qq.com");
        Map<String,Object> map = new HashMap<>();
        map.put("cn","中国");
        map.put("us","美国");
        request.setAttribute("map",map);
        request.setAttribute("user",user);
        request.getSession().setAttribute("sessionkey","sessionValue");
        request.getRequestDispatcher("el.jsp").forward(request,response);


    }
}
