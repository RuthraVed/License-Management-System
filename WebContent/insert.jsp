<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hi...</h1>

<jsp:useBean id="s1" class="com.zensar.lms.bean.LicenseBean"></jsp:useBean>
<jsp:setProperty property="*" name="s1"/>
<%request.setAttribute("obj",s1); %>
<jsp:forward page="LServlet"></jsp:forward>

<%--
<jsp:setProperty property="licenseID" name="s1" param="licenseID"></jsp:setProperty>
<jsp:setProperty property="licenseType" name="s1" param="licenseType"></jsp:setProperty>
<jsp:setProperty property="userName" name="s1" param="userName"></jsp:setProperty>
<jsp:setProperty property="userAddress" name="s1" param="userAddress"></jsp:setProperty>
<jsp:setProperty property="userDOB" name="s1" param="userDOB"></jsp:setProperty>
<jsp:setProperty property="userBlood" name="s1" param="userBlood"></jsp:setProperty>
<jsp:setProperty property="userPlace" name="s1" param="userPlace"></jsp:setProperty>
<jsp:setProperty property="userFather" name="s1" param="userFather"></jsp:setProperty>
<jsp:setProperty property="issueDate" name="s1" param="issueDate"></jsp:setProperty>
<jsp:setProperty property="expiryDate" name="s1" param="expiryDate"></jsp:setProperty>
<jsp:setProperty property="userContact" name="s1" param="userContact"></jsp:setProperty>
<% request.setAttribute("obj", s1); %>
 --%>

</body>
</html>