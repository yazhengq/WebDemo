package com.gdut.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WriteGetDB extends HttpServlet {

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
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, req.getParameter("Name"));
			pstmt.setString(2, password);
			pstmt.setString(3, email);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}

		try {
			this.showInfo(resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void showInfo(HttpServletResponse resp) throws ServletException,
			Exception {
		// TODO Auto-generated method stub
		Connection conn = DB.getConn();
		PrintWriter pw = null;
		int id = 0;
		String name = null, password = null, email = null;
		
		resp.setContentType("text/html;charset=gb2312");
		String title = "List All Parameters";
		pw = resp.getWriter();
		pw.println("<html><head><title>显示所有参数</title></head>"
				+ "<body bgcolor='#FDF532'>\n" + "<h1 align='center'>" + title
				+ "</h1>\n" + "<table border=1 align='center'>\n"
				+ "<tr bgcolor=\"#FFAD00\">\n"
				+ "<th>id</th><th>name</th><th>password</th><th>email</th></tr>" );
				
		//获取ResultSet结果集
		ResultSet rs = this.getInfrDB();
		while (rs.next()) {
			id = rs.getInt(1);
			name = rs.getString(2);
			password = rs.getString(3);
			email = rs.getString(4);
			pw.println("<tr><td>"+ id +"</td><td>"+ name +"</td><td>"+ password +"</td><td>"+ email +"</td></tr>" );
			
System.out.print("id: " + id);
System.out.print("name: " + name);
System.out.println();

		}
		pw.println("</table></body></html>");;
		
		
	}

	
	//从数据库中查询获取结果
	public ResultSet getInfrDB() throws Exception {
		String selSQL = "select * from userinfo;";
		Connection conn = DB.getConn();
		PreparedStatement pstmt = DB.getPstmt(conn, selSQL);
//System.out.println(pstmt);
		ResultSet rs = DB.executeQuery(pstmt, selSQL);
		return rs;


	}
}
