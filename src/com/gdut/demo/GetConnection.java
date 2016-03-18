package com.gdut.demo;

import java.sql.*;

public class GetConnection {

	String url = "jdbc:mysql://localhost/register";
    String username = "root" ;   
    String password = "root" ; 
	Connection conn = null;
	PreparedStatement pstmt = null;

	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
System.out.println("数据库连接失败！");	
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{		
			try {
//				if (rs != null) {
//					rs.close();
//					rs = null;
//				}
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}
}
