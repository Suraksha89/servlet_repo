package ServletDemo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("email");
		String password = request.getParameter("pswd");
		try {
			Class.forName("com.mysql.jdbc.Driver");//load driver
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/velocitydb?allowPublicKeyRetrieval=true","root","root");
			String query="select * from empdata where email=? and password= ?";
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			
			ResultSet rs=preparedStatement.executeQuery();
			if(rs.next()) {
				request.getRequestDispatcher("congratulation.jsp").forward(request, response);
			}
			else {
				request.setAttribute("msg", "PLZ TRY AGAIN");
				request.getRequestDispatcher("login.jsp").forward(request, response);
				
			}
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(username.equals("suraksha@email.com")&& password.equals("test")) {
			request.getRequestDispatcher("Success.jsp").forward(request, response);
			
		}
		else
		{
			request.setAttribute("msg", "Wrong info entered");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
