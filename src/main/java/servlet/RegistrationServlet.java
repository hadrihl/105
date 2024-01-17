package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDaoImpl;
import entity.User;

public class RegistrationServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	UserDaoImpl UserDao = new UserDaoImpl();
	
	User user = new User();
	public String firstname;
	public String lastname;
	public String email;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("registration.jsp");
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String cpassword = request.getParameter("cpassword");
		String city = request.getParameter("city");
		
		System.err.println("firstname: " + firstname);
		System.err.println("lastname: " + lastname);
		System.err.println("email: " + email);
		System.err.println("password: " + password);
		System.err.println("cpassword: " + cpassword);
		System.err.println("city: " + city);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}
}
