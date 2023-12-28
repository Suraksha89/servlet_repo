package ServletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Demo2")
public class Demo2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		int x = 100;
		int y = 5;
		int z = x/y;
		
		PrintWriter pw = response.getWriter();
		pw.println("the final output is: " +z);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
//http://localhost:8080/ServletApp/Demo2
