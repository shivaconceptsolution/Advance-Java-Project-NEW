<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.sql.*" %>   
<%@page import="dal.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
table
{
width:800px;
margin-top:10px;
margin-left:20px;
}
table tr th
{
background-color: black;
color:white;
 border:1px solid white	;
 font-weight:bolder;
 font-size:25px;
}

table tr td
{
background-color:orange;
text-align: center;
 border:1px solid black;
}

input[type="text"]
{
   height:30px;
   border:1px solid black;
}
</style>
</head>
<body>

<table cellpadding="0" cellspacing="0">
<tr><th>RNO</th><th>NAME</th><th>BRANCH</th><th>FEES</th><th>EDIT|DELETE</th></tr>
<%
JDBCExample2.connect();
ResultSet res = JDBCExample2.showdata();
while(res.next())
{ %>
<tr><td><%= res.getString(1) %></td><td><%= res.getString(2) %></td><td><%= res.getString(3) %></td><td><%= res.getString(4) %></td>
<td><a href="Edit.jsp?q=<%= res.getString(1) %>"><img src="edit.jpg" style="width:30px;height:30px;" /></a>	<a href="Delete.jsp?q=<%= res.getString(1) %>"><img src="delete.jpg" style="width:30px;height:30px;" /></a></td>
</tr>
	 
<% 

}
%>
<form action="StudentSer" method="post">
<tr><td><input type="text" name="txtrno" placeholder="Enter rno" required></td><td><input type="text" name="txtname" placeholder="Enter name" required /></td><td><input type="text" name="txtbranch" placeholder="Enter branch" required/></td><td><input type="text" name="txtfees" placeholder="Enter fees" required/></td><td><input type="submit" name="btnsubmit" value="INSERT" ></td></tr>



</form>
</body>
</html>