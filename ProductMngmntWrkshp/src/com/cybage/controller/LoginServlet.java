package com.cybage.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cybage.dao.UserDao;
import com.cybage.model.User;
import com.cybage.service.IUserService;
import com.cybage.service.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");

		PrintWriter out = response.getWriter();

		User newUser = new User(name, pwd);
		IUserService userService = new UserServiceImpl();
		if (userService.validateUser(newUser).equalsIgnoreCase("A")) {
			System.out.println("Valid Admin : " + newUser.getUserName());
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("newAdmin", newUser);
			response.sendRedirect("WelcomeAdmin");

		} else if (userService.validateUser(newUser).equalsIgnoreCase("U")) {
			System.out.println("Valid User User: " + newUser.getUserName());
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("newUser", newUser);
			response.sendRedirect("WelcomeUser");

		} else {
			System.out.println("Invalid User: " + newUser.getUserName());
			out.print("Wrong Password");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("Login.jsp");
			requestDispatcher.include(request, response);

		}
	}

}
