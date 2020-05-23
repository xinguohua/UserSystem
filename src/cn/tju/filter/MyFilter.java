package cn.tju.filter;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init..............");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("处理请求");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("处理相应的响应");

    }

    @Override
    public void destroy() {
        System.out.println("destroy...............");

    }
}
