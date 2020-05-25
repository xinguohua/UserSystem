package cn.tju.Listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class Attribute implements ServletRequestAttributeListener,HttpSessionAttributeListener,ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        String name = servletContextAttributeEvent.getName();//目前正在操作的属性名
        Object value = servletContextAttributeEvent.getServletContext().getAttribute(name);
        System.out.println("ServletContext增加属性"+"属性名"+name+"属性值"+value);
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
        String name = servletContextAttributeEvent.getName();//目前正在操作的属性名
        Object value = servletContextAttributeEvent.getServletContext().getAttribute(name);
        System.out.println("ServletContext删除属性"+"属性名"+name+"属性值"+value);
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        String name = servletContextAttributeEvent.getName();//目前正在操作的属性名
        Object value = servletContextAttributeEvent.getServletContext().getAttribute(name);
        System.out.println("ServletContext替换属性"+"属性名"+name+"属性值"+value);
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        String name = servletRequestAttributeEvent.getName();//目前正在操作的属性名
        Object value = servletRequestAttributeEvent.getServletRequest().getAttribute(name);
        System.out.println("ServletRequest增加属性"+"属性名"+name+"属性值"+value);
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        String name = servletRequestAttributeEvent.getName();//目前正在操作的属性名
        Object value = servletRequestAttributeEvent.getServletRequest().getAttribute(name);
        System.out.println("ServletRequest删除属性"+"属性名"+name+"属性值"+value);
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        String name = servletRequestAttributeEvent.getName();//目前正在操作的属性名
        Object value = servletRequestAttributeEvent.getServletRequest().getAttribute(name);
        System.out.println("ServletRequest替换属性"+"属性名"+name+"属性值"+value);
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        String name = httpSessionBindingEvent.getName();//目前正在操作的属性名
        Object value = httpSessionBindingEvent.getSession().getAttribute(name);
        System.out.println("HttpSession增加属性"+"属性名"+name+"属性值"+value);
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
        String name = httpSessionBindingEvent.getName();//目前正在操作的属性名
        Object value = httpSessionBindingEvent.getSession().getAttribute(name);
        System.out.println("HttpSession删除属性"+"属性名"+name+"属性值"+value);
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
        String name = httpSessionBindingEvent.getName();//目前正在操作的属性名
        Object value = httpSessionBindingEvent.getSession().getAttribute(name);
        System.out.println("HttpSession替换属性"+"属性名"+name+"属性值"+value);
    }
}
