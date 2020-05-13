package cn.tju.Servlet;

import cn.tju.entity.User;
import cn.tju.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "deleteServlet",urlPatterns ="/deleteServlet")
public class deleteServlet extends HttpServlet {
    UserService userService =new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //System.out.println("===============");
        int userno =Integer.parseInt(request.getParameter("userno"));

        //System.out.println(userno);
        userService.delete(userno);
        response.sendRedirect("queryAllServlet");
    }
}
