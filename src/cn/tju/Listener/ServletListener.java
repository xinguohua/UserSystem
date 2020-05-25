package cn.tju.Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class ServletListener implements ServletRequestListener,HttpSessionListener,ServletContextListener{
    //监听application(ServletContext)
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("监听ServletContext,创建ServletContext对象...:"+servletContextEvent);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("监听ServletContext,销毁ServletContext对象...:"+servletContextEvent);
    }

    //监听request对象
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("监听ServletRequest,销毁ServletRequest对象...:"+servletRequestEvent);
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("监听ServletRequest,创建ServletRequest对象...:"+servletRequestEvent);
    }
    //监听session对象
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("监听HttpSession,创建HttpSession对象...:"+httpSessionEvent);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("销毁HttpSession,创建HttpSession对象...:"+httpSessionEvent);
    }
}
