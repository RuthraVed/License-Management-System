package com.zensar.lms.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;


//@WebFilter("/LFilter")
public class LFilter implements Filter {

	
	public LFilter() {
		// TODO Auto-generated constructor stub
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		response.setContentType("text/html");
		String uname=request.getParameter("userid");
		String passwd=request.getParameter("upass");
		PrintWriter out=response.getWriter();

		if(uname.equals("admin") && passwd.equals("123")){
			RequestDispatcher dis=request.getRequestDispatcher("/homepage.html");
			dis.forward(request, response);
		}

		else{
			out.println("<h3>Invalid Credentials...</h3>");
			RequestDispatcher dis=request.getRequestDispatcher("/login.html");
			dis.include(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
