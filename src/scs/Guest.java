package scs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Guest
 */
@WebServlet("/Guest")
public class Guest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Guest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.write("<html><head><title>Welcome JAVA</title>");
		out.write("<link href='style.css' type='text/css' rel='stylesheet' />");
		out.write("</head>");
		out.write("<body><header><h1>Welcome in Shiva Tutroails</h1><a href='Guest'>HOME</a><a href='About'>About</a></header>");
		out.write("<section><p>This portal is especially to provide a technical tutorial, free job alert to the learner and job seeker in various programming languages and to solve doubts of learners online, we want to provide information of latest technologies with practical examples of Java, Python, PHP, C#, Software Testing, IoT, AWS, DevOps, etc</p></section>");
		out.write("<footer><center>&copy;2020 by Shiva Concept</center></footer>");
		out.write("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
