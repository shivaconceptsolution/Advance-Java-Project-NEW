<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>   
<%@page import="dal.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>View Student Record Here</h1>
<form action="UpdateSer" method="post">
<table border="1">
<%
JDBCExample2.connect();
ResultSet res = JDBCExample2.findData(Integer.parseInt(request.getParameter("q")));
if	(res.next())
{ %>	
<tr><th>RNO</th><td><input type="text" name="txtrno" value="<%= res.getString(1) %>" /></td></tr>
<tr><th>NAME</th><td><input type="text" name="txtsname" value="<%= res.getString(2) %>" /></td></tr>
<tr><th>BRANCH</th><td><input type="text" name="txtbranch" value="<%= res.getString(3) %>" /></td></tr>
<tr><th>FEES</th><td><input type="text" name="txtfees" value="<%= res.getString(4	) %>" /></td></tr>
<tr><td colspan="2"><input type="submit" value="Update" /></td>
</tr>
	 
<% 
}
%>
</form>
</body>
</html>