package com.example.servlet;
  
import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
import mypackage.*;
  
public class FilterExpression  implements Filter{ 
      
    public void init (FilterConfig config) throws ServletException{ 
       } 
      
       public void doFilter (ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException{ 
			String expression = req.getParameter("expression");
			try {	
					SyntaxAnalyzer.analyzeString(expression);
					chain.doFilter(req, resp); 	
			}
			catch (IllegalSymbolException e){
					resp.getWriter().write("Illegal symbol");
			}		
			catch (UncoordinatedBracketsException e){					
					resp.getWriter().write("Uncoordinated Brackets");
			}
			catch (SyntaxException e){
					resp.getWriter().write("Bad syntax");
			}		  
       } 
	   
       public void destroy(){ 
       }  
  } 