package com.aparna;


	import java.io.IOException;
	import java.io.PrintWriter;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	public class HelloWorld extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException{
	PrintWriter out = response.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<h1>Hello Servlet Get</h1>");
	out.println("<h1>let me check my first commit</h1>");
	out.println("</body>");
	out.println("</html>");
	}
	}
