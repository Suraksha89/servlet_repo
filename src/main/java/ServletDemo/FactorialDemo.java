package ServletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FactorialDemo")
public class FactorialDemo extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int frac = 1;
			for(int x=1 ;x<6; x++)
			{
				frac = frac *x;
			}
			PrintWriter pw = response.getWriter();
			pw.println("factorial of 5 is " + frac);

		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
