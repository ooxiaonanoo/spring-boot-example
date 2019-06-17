package com.holdsis.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println("================== SpringBoot 整合 Servlet 方式二 ===================");
        System.out.println("===== 通过 @bean 及 ServletRegistrationBean方法完成Servlet组件的注册");
        System.out.println("===== 调用方式:http://localhost:8080/second");
    }
}
