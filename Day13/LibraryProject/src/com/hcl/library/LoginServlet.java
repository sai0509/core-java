package com.hcl.library;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String user = request.getParameter("userName");
		String pwd = request.getParameter("passWord");
		String result = LibraryBaL.loginBal(user, pwd);
		out.println(result);
		
		if (result == "Login Successfull") {
			out.println("WELCOME " + user);
			HttpSession s = request.getSession(true);
			s.setAttribute("user", user);
			RequestDispatcher disp = request.getRequestDispatcher("menu.html");
			disp.forward(request, response);
		} else {
			out.println("User Name or PassWord is Incorrect");
			RequestDispatcher disp = request.getRequestDispatcher("login.html");
			disp.include(request, response);
		}
		HttpSession session = request.getSession(true);
		session.setAttribute("n",user);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
