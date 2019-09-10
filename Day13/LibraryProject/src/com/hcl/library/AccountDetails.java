package com.hcl.library;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AccountDetails
 */
public class AccountDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		String name = (String)session.getAttribute("n");
		List<Account> l1 = LibraryBaL.accountDetailsBal(name);
		if(l1!=null){
			out.println("<table border = '3' ><tr><th>User Name</th><th>Book Id</th><th>Date</th>");
			
			for (Account account : l1) {
				out.println(" <tr><td> " + account.getUsername() + " </td> ");
				out.println(" <td> " + account.getId() + " </td>");
				out.println(" <td> " + account.getD() + " </td></tr>");
			}   out.println("</table>");
		}else{
			out.println("Mr. " + name + "You do not have any Issued books");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
