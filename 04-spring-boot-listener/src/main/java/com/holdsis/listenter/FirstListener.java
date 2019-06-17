package com.holdsis.listenter;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class FirstListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("初始化 FirstListener ....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
