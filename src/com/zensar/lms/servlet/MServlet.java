package com.zensar.lms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.lms.bean.LicenseBean;
import com.zensar.lms.dao.DAOClass;


//@WebServlet("/MServlet")
public class MServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MServlet() {
		super();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		try {
			LicenseBean bean=(LicenseBean) request.getAttribute("obj");
			DAOClass ds =new DAOClass();
			boolean status=ds.modify(bean);
			if(status)
			{	response.sendRedirect("success.html");
			out.write("Success to modify");
			}
			else{
				response.sendRedirect("error.html");
				out.write("Failure to modify");
			}
			//check = dc.insert((LicenseBean) request.getAttribute("obj"));

		} catch (Exception e1) {
			System.out.println("In MServlet..."+e1);
			e1.printStackTrace();
		}
	}

}
