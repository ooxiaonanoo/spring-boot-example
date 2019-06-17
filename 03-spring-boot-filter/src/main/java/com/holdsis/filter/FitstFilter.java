package com.holdsis.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * SpringBoot 整合 Filter 方式一
 * 通过注解扫描完成 Filter
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

@WebFilter(filterName = "FirstFilter", urlPatterns = {"*.do", "*.jsp","/first"})
public class FitstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入 FirstFilter");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("离开 FirstFilter");

    }

    @Override
    public void destroy() {

    }
}
