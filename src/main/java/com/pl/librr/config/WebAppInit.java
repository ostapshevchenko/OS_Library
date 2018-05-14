package com.pl.librr.config;


import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebAppInit implements WebApplicationInitializer{

//    private static final String LOCATION = "C:/mytemp/";
//    private static final long MAX_FILE_SIZE = 1024 * 1024 * 25;//25MB
//    private static final long MAX_REQUEST_SIZE = 1024 * 1024 * 30;//30MB
//    private static final int FILE_SIZE_THRESHOLD = 0;

    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(WebConfig.class);

        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcherServlet",dispatcherServlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
//        registration.setMultipartConfig(getMultipartConfigElement());
    }

//    private MultipartConfigElement getMultipartConfigElement(){
//        MultipartConfigElement multipartConfigElement = new MultipartConfigElement(LOCATION, MAX_FILE_SIZE, MAX_REQUEST_SIZE, FILE_SIZE_THRESHOLD);
//        return multipartConfigElement;
//    }

}
