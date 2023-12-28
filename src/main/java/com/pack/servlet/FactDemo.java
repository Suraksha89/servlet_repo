package com.pack.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FactDemo
 */
@WebServlet("/FactDemo")
public class FactDemo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String number = request.getParameter("num1");
		int num = Integer.parseInt(number);
		int factorial = 1;

		for (int i = 1; i <= num; i++) {

			factorial = factorial * i;

		}
	//	PrintWriter pw = response.getWriter();
		//pw.println("factorial of the number is " + factorial);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
