package com.holdsis.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * SpringBoot 整合 Filter 方式二
 * 通过方法完成 Filter  组件的注册
 *
 *<filter>
 * <filter-name>FirstFilter</filter-name>
 * <filter-class>com.bjsxt.filter.FirstFilter</filter-class>
 *</filter>
 *<filter-mapping>
 * <filter-name>FirstFilter</filter-name>
 * <url-pattern>/first</url-pattern>
 *</filter-mapping>
 */

public class SecondFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入 SecondFilter");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("离开 SecondFilter");

    }

    @Override
    public void destroy() {

    }
}
