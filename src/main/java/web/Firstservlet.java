package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Firstservlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		String name=req.getParameter("name") ;
		PrintWriter writer=resp.getWriter();
		
		writer.print("<html><body>");
		writer.print("<li>name="+name+"</li>");
		writer.print("<li>Protocol="+req.getRemoteAddr()+"</li>");
		writer.print("</html></body>");
	}
	
	

}
