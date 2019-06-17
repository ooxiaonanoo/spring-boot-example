package com.holdsis.listenter;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class SecondListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("初始化 SecondListener ....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
