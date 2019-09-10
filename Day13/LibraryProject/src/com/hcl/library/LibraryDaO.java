package com.hcl.library;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class LibraryDaO {
	
	public String loginDao(String username,String password) {
		Connection con = DaoConnection.getConnection();
		String cmd = "select * from libusers where username = ? and password = ?";
		String result = "";
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1, username);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				result = "Login Successfull";
			} else {
				result = "Invalid Login Details";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	
	public List<Books> searchDao(String searchtype,String input) {
		List<Books> obj = new ArrayList<Books>();
		Connection con = DaoConnection.getConnection();
		PreparedStatement pst;
		String cmd = "";
		if (searchtype.equals("id")) {
			cmd = "select * from books where id = ?";
		} else if (searchtype.equals("name")) {
			cmd = "select * from books where name = ?";
		} else if (searchtype.equals("author")) {
			cmd = "select * from books where author = ?";
		} else if (searchtype.equals("department")) {
			cmd = "select * from books where dept = ?";
		} else {
			cmd = "select * from Books where name != ? OR 1 = 1 " ;
		} 
		Books b1 = null;
	    try {
			pst = con.prepareStatement(cmd);
			pst.setString(1, input);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				b1 = new Books();
				b1.setId(rs.getInt("id"));
				b1.setName(rs.getString("name"));
				b1.setAuthor(rs.getString("author"));
				b1.setEdition(rs.getString("edition"));
				b1.setDepartment(rs.getString("dept"));
				b1.setTotalBooks(rs.getInt("totalbooks"));
				obj.add(b1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return obj;
	}

	public String issuebooks(String username,String[] id) {
		Connection con = DaoConnection.getConnection();
		PreparedStatement pst;
		String result = "";
		for (String string : id) {
			int id1 = Integer.parseInt(string);
			
			String cmd = "select * from tranbook where username = ? and bookid = ?";
			try {
				pst = con.prepareStatement(cmd);
				pst.setString(1, username);
				pst.setInt(2, id1);
				ResultSet rs = pst.executeQuery();
				if(rs.next()){
					result = "Already Issued";
				} else{
					cmd = "Insert into tranbook (username , bookid) values(?,?)";
					pst = con.prepareStatement(cmd);
					pst.setString(1, username);
					pst.setInt(2, id1);
					pst.executeUpdate();
					result = "Book With Book Id : "+ id1 + "<br/>" + "Issued";
					cmd = "UPDATE books set totalbooks = totalbooks-1 where id = ?";
					pst = con.prepareStatement(cmd);
					pst.setInt(1, id1);
					pst.executeUpdate();
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
			
		return result;
		}
	
	public List<Account> accountDao(String username){
		Connection con = DaoConnection.getConnection();
		PreparedStatement pst;
		List<Account> obj = new ArrayList<Account>();
		Account a1 = null;
		String cmd = "select * from tranbook where username = ?";
		try {
			pst = con.prepareStatement(cmd);
			pst.setString(1, username);
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				a1 = new Account(rs.getString("username"),rs.getInt("bookid"),rs.getDate("fromdate"));
				obj.add(a1);
			} 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	
	public String returnbooks(String username,String[] id){
		Connection con = DaoConnection.getConnection();
		PreparedStatement pst;
		String result = "";
		for (String string : id) {
			int id1 = Integer.parseInt(string);
			String cmd = "DELETE FROM tranbook WHERE username=? and bookid=?";
			try {
				pst = con.prepareStatement(cmd);
				pst.setString(1, username);
				pst.setInt(2, id1);
				pst.executeUpdate();
				cmd = "UPDATE books set totalbooks = totalbooks+1 where id = ?";
				pst = con.prepareStatement(cmd);
				pst.setInt(1, id1);
				pst.executeUpdate();
				cmd = "Insert into transreturn (username , bookid) values(?,?)";
				pst = con.prepareStatement(cmd);
				pst.setString(1, username);
				pst.setInt(2, id1);
				pst.executeUpdate();
				result = "Book with Book Id : " + id1 + "is Returned";
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
		return result;
	}
	}
	

