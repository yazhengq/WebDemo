package com.gdut.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WriteToDB extends HttpServlet {
	
 
	PreparedStatement pstmt = null;
	String sql = "insert into userinfo (name, password, email) values (?, ?, ?)";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection conn = DB.getConn();
		
		String name = req.getParameter("Name");
		String password = req.getParameter("Password");
		String email = req.getParameter("Email");
System.out.println(name);
System.out.println(password);
System.out.println(email);
		
	    try {
System.out.println(sql);
			pstmt = conn.prepareStatement(sql);
		    pstmt.setString(1, req.getParameter("Name"));
		    pstmt.setString(2, password);
		    pstmt.setString(3, email);
		    pstmt.executeUpdate();
		    
	    } catch (SQLException e) {
	    	// TODO Auto-generated catch block   	
	    	//e.printStackTrace();
	    }
		
		PrintWriter out = resp.getWriter();
		
	}

	
	
}
