package cn.tju.Servlet;

import cn.tju.entity.User;
import cn.tju.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "insertServlet",urlPatterns="/insertServlet" )
public class insertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService userService =new UserService();
        int userno=Integer.parseInt(request.getParameter("userno"));
        String username=request.getParameter("username");
        String password=  request.getParameter("password");
        String dept=request.getParameter("dept");
        String phone=request.getParameter("phone");
        String email= request.getParameter("email");
        User user =new User(userno,username,password,dept,phone,email);
        userService.insert(user);
        response.sendRedirect("queryAllServlet");


    }

}
