package com.hcl.library;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchBooksServlets
 */
public class SearchBooksServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchBooksServlets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String searchtype = request.getParameter("searchtype");
		String input = request.getParameter("input");
		List<Books> obj = LibraryBaL.searchIdBal(searchtype,input);
		out.println("<form method = 'get' action = 'IssueServlet'><table border = '3'>");
		out.println("<tr><th>Book Id</th><th>Book Name</th><th>Author</th><th>Edition</th><th>Dept</th><th>Total Books</th>");
		for (Books books : obj) {
			out.println("<tr><td>" + books.getId() + "</td>");
			out.println("<td>" + books.getName() + "</td>");
			out.println("<td>" + books.getAuthor() + "</td>");
			out.println("<td>" + books.getEdition() + "</td>");
			out.println("<td>" + books.getDepartment() + "</td>");
			out.println("<td>" + books.getTotalBooks() + "</td>");
			if (books.getTotalBooks() > 0) {
				out.println("<td><input type = 'checkbox' name = 'bookid' value = " + books.getId() + " </td></tr>");
			} else {
				out.println("<td><input type = 'checkbox' name = 'bookid' value ="+books.getId() + " disabled </td></tr>");
			}
		} 
		out.println("<tr><td><center><input type = 'submit' value = 'ISSUE' /></center></td></tr></form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
