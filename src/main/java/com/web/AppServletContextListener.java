package com.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppServletContextListener implements ServletContextListener {
	
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("Application is starting");
	}
	
	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("Application is shutting down");
		
	}

}
