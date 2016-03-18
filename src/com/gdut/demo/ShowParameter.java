package com.gdut.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowParameter extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=gb2312");
		PrintWriter out = resp.getWriter();
		String title = "Reading All Request Parameters";
		out.println("<html><head><title>读取所有参数</title></head>"
				+ "<body bgcolor='#FDF532'>\n" + "<h1 align='center'>" + title
				+ "</h1>\n" + "<table border=1 align='center'>\n"
				+ "<tr bgcolor=\"#FFAD00\">\n"
				+ "<th>Parameter Name<th>Parater Value(s)");
		Enumeration paraNames = req.getParameterNames();
		while (paraNames.hasMoreElements()) {
			String paraName = (String) paraNames.nextElement();
			out.print("<tr><td>" + paraName + "\n<td>");
			String[] paramValues = req.getParameterValues(paraName);
			if (paramValues.length == 1) {
				String paramValue = paramValues[0];
				if (paramValue.length() == 0) {
					out.println("<i>No Value</i>");
				}else
					out.println(paramValue);
			} else {
				out.println("<ul>");
				for (int i = 0; i < paramValues.length; i++) {
					out.println("<li>" + paramValues[i]);
				}
				out.println("</ul>");
			}			
		}
		out.println("</table>\n</body></html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}
