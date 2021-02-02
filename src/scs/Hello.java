package scs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello")
public class Hello extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		PrintWriter out= response.getWriter();
		out.print("<h1>Hello World</h1>");
		if(request.getParameter("q")!=null)
		{
			out.print("Result is "+request.getParameter("q"));
		}
		
	}
}
