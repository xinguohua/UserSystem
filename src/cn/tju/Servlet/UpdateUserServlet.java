package cn.tju.Servlet;

import cn.tju.entity.User;
import cn.tju.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Service;
import java.io.IOException;

@WebServlet(name = "UpdateUserServlet",urlPatterns = "/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
    UserService userService =new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
               int userno=Integer.parseInt(request.getParameter("userno"));
        String username=request.getParameter("username");
              String password=  request.getParameter("password");
                String dept=request.getParameter("dept");
                String phone=request.getParameter("phone");
                String email= request.getParameter("email");
                User user =new User(userno,username,password,dept,phone,email);
                userService.update(userno,user);
                response.sendRedirect("queryAllServlet");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                doPost(request,response);
    }
}
