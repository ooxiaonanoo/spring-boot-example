package com.holdsis.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * SpringBoot 整合 Servlet 方式一
 * 通过 @WebServlet 和 @ServletComponentScan 注解扫描完成Servlet组件注册
 *
 * 以下为web.xml Servlet配置片段，用于比较参考
 * <servlet>
 * <servlet-name>FirstServlet</servlet-name>
 * <servlet-class>com.bjsxt.servlet.FirstServlet</servlet-class>
 * </servlet>
 * <p>
 * <servlet-mapping>
 * <servlet-name>FirstServlet</servlet-name>
 * <url-pattern>/first</url-pattern>
 * </servlet-mapping>
 */
@WebServlet(name = "FirstServlet", urlPatterns = "/first")
public class FirstServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println("================== SpringBoot 整合 Servlet 方式一 ===================");
        System.out.println("===== @WebServlet");
        System.out.println("===== @ServletComponentScan 扫描 @WebServlet 并实例化");
        System.out.println("===== 调用方式:http://localhost:8080/first");
    }
}
