package cn.tju.Servlet;

import cn.tju.entity.User;
import cn.tju.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "queryAllServlet",urlPatterns ="/queryAllServlet",loadOnStartup=1)
public class queryAllServlet extends HttpServlet {
    UserService userService =new UserService();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ArrayList<User> users = userService.queryAll();
            //System.out.println(users);
            request.setAttribute("users",users);
            request.getRequestDispatcher("index.jsp").forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
