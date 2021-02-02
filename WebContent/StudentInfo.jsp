<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="StudentSer" method="post">
<h1>ADDITION FORM</h1>
<hr>
<input type="text" name="txtrno" placeholder="Enter RNO" />
<br>
<br>
<input type="text" name="txtname" placeholder="Enter NAME" />
<br>
<br>
<input type="text" name="txtbranch" placeholder="Enter BRANCH" />
<br>
<br>
<input type="text" name="txtfees" placeholder="Enter FEES" />
<br>
<br>
<input type="submit" name="btnsubmit" value="REGISTER" />



</form>

<a href="viewstudentinfo.jsp">View Student Info</a>

<%
    if(request.getParameter("q")!=null)
    {
    	out.print(request.getParameter("q"));
    }



%>
</body>
</html>