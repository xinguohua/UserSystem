package cn.tju.Servlet;

import cn.tju.entity.User;
import cn.tju.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "queryUserByUno",urlPatterns = "/queryUserByUno")
public class queryUserByUno extends HttpServlet {
    UserService userService =new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                    doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //System.out.println("===============");
        int userno =Integer.parseInt(request.getParameter("userno"));

        //System.out.println(userno);
        User user = userService.queryUserByUno(userno);
        //System.out.println(user);
        request.setAttribute("user",user);
        request.getRequestDispatcher("detail.jsp").forward(request,response);
    }
}
