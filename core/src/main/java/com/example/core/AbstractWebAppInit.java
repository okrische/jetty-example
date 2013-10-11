package com.example.core;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;

public abstract class AbstractWebAppInit implements WebApplicationInitializer {
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("onStartup from here: " + AbstractWebAppInit.class.getName());
	}
}
