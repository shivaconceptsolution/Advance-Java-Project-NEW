<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AdditionSer" method="post">
<h1>ADDITION FORM</h1>
<hr>
<input type="text" name="txtnum1" placeholder="Enter First Number" />
<br>
<br>
<input type="text" name="txtnum2" placeholder="Enter Second Number" />
<br>
<br>
<input type="submit" name="btnsubmit" value="ADD" />



</form>

<%
    if(request.getParameter("q")!=null)
    {
    	out.print("result is "+request.getParameter("q"));
    }



%>
</body>
</html>