package com.example.servlet;

import mypackage.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Vector;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculatorServlet extends HttpServlet{
		
	@Override	  
	  public void doPost(HttpServletRequest req, HttpServletResponse res)
		    throws ServletException, IOException{
				double result=0;
				HttpSession session = req.getSession(true);
				String expression = req.getParameter("expression");
				session.setAttribute("expression",expression);
				result = Calculator.calculate(expression);
				session.setAttribute("result",result);				
				res.sendRedirect("./result.jsp");
						
	  }
	  
}
