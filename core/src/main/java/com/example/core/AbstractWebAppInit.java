package com.example.core;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public abstract class AbstractWebAppInit {
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("onStartup from here: " + AbstractWebAppInit.class.getName());
	}
}
