package com.pack.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet{

	@Override
	public void destroy() {
System.out.println("inside destroy method");		
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("inside init method");		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("inside service method");		
	}

}
