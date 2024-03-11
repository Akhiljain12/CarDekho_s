package com.jspiders.cardekhowithservlets.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspiders.cardekhowithservlets.operation.AddCar;

@WebServlet("/setting")
public class Servlets extends HttpServlet{

	 
	private static final long serialVersionUID = 1L;

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws  ServletException, IOException {
	int id= Integer.parseInt(req.getParameter("id"));
	String name=req.getParameter("name");
	String brand=req.getParameter("brand");
	Double price=Double.parseDouble(req.getParameter("price"));
	
	try {
	int res=AddCar.AddCar(id,name,brand,price);
		if(res==1) {
			req.setAttribute("message", "car added");
		}
		else {
		  req.setAttribute("message", "car not added");
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	RequestDispatcher requestDispatcher= req.getRequestDispatcher("addcar.jsp");
	requestDispatcher.forward(req, resp);
}
}
