<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hi Deleting...</h1>

<jsp:useBean id="s1" class="com.zensar.lms.bean.LicenseBean"></jsp:useBean>
<jsp:setProperty property="*" name="s1"/>
<%request.setAttribute("obj",s1); %>
<jsp:forward page="NServlet"></jsp:forward>
</body>
</html>