package com.holdsis;

import com.holdsis.servlet.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan
public class ServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServletApplication.class, args);
    }

    //注册 SecondServlet
    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean srb = new ServletRegistrationBean(new SecondServlet(),"/second");
        return srb;
    }

}
