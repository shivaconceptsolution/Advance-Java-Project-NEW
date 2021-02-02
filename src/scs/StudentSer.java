package scs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import dal.*;
/**
 * Servlet implementation class StudentSer
 */
@WebServlet("/StudentSer")
public class StudentSer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		try
		{
			JDBCExample2.connect();
			int res=JDBCExample2.insert(Integer.parseInt(request.getParameter("txtrno")), request.getParameter("txtname"), request.getParameter("txtbranch"),Integer.parseInt(request.getParameter("txtfees")));
		    JDBCExample2.closeConn();
		    String s = "";
		    if(res==1)
		    {
		    	s= "data inserted successfully";
		    }
		    else
		    {
		    	s = "data not inserted successfully";
		    }
		    response.sendRedirect("viewstudentinfo.jsp?q="+s);
		}
		catch(Exception ex)
		{
			out.print(ex.getMessage().toString());
		}
	}

}
