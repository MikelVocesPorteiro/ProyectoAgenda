package com.example.ProyectoAgenda.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.example.ProyectoAgenda.config.ApplicationContextConfig;

public class SpringWebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
    	System.out.println("class = SpringWebAppInitializer  --  method = onStartup -- inicio");
    	 AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
    	 appContext.register(ApplicationContextConfig.class);
         
    	 ServletRegistration.Dynamic dispatcher = servletContext.addServlet(
                 "SpringDispatcher", new DispatcherServlet(appContext));
         dispatcher.setLoadOnStartup(1);
         dispatcher.addMapping("/");
    	System.out.println("class = SpringWebAppInitializer  --  method = onStartup -- fin");
    	 
	}

}