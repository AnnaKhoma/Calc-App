<%@page language="java" session="true" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import="javax.servlet.http.HttpServlet" %>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="javax.servlet.http.HttpServletResponse" %>

<%	String s = (String)session.getAttribute("expression");%>
<%	double resDouble = (Double)session.getAttribute("result");
	String res = Double.toString(resDouble);
%>

<!DOCTYPE html>
<html>

	  <body>
		<label><%=s%> <label/>
		<br>
	  	<label>Calculation result : <%=res%> <label/>

	  </body>
</html>


