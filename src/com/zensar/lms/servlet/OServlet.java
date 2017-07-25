package com.zensar.lms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.lms.bean.LicenseBean;
import com.zensar.lms.dao.DAOClass;


@WebServlet("/OServlet")
public class OServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public OServlet() {
		super();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		try {
			LicenseBean bean=(LicenseBean) request.getAttribute("obj");
			DAOClass ds =new DAOClass();
			ResultSet rs1=ds.view(bean);
			String details[]={"LicenseID","LicenseType","Name","Address","DOB","Blood","Place","Father's","IssueDate","ExpiryDate","Contact"};
			if(rs1.next())
			{		out.println("<table border=1>");

				for(int i=1;i<12;i++){
					out.println("<tr><td>"+details[i-1]+"</td><td>"+rs1.getString(i)+"</td></tr>");
				}
				out.println("</table>");
				out.println("<a href='homepage.html'>GO Back..</a>");
				
			}
			else{
				response.sendRedirect("error.html");
				out.write("Failure to view...data not available");
			}


		} catch (Exception e1) {
			System.out.println("In LServlet..."+e1);
			e1.printStackTrace();
		}
	}

}
