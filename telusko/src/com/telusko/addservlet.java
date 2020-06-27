package com.telusko;
import java.io.PrintWriter;
import java.io.*;
import javax.servlet.annotation.WebServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
@WebServlet("/add")
public class addservlet extends HttpServlet
{
	public void service(HttpServletRequest reqt,HttpServletResponse res) throws IOException, ServletException
	{
		int i= Integer.parseInt(reqt.getParameter("num1"));
		int j= Integer.parseInt(reqt.getParameter("num2"));
		int k=i+j;
		reqt.setAttribute("j", k);
		RequestDispatcher r=reqt.getRequestDispatcher("sq");
		r.forward(reqt, res);
		
	}

}
