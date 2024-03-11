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

@WebServlet("/updateCar")
public class UpdateCar extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws  ServletException, IOException {
		int id= Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String brand=req.getParameter("brand");
		Double price=Double.parseDouble(req.getParameter("price"));
		
		try {
		int res=AddCar.updateCar(id,name,brand,price);
			if(res==1) {
				req.setAttribute("message", "car updated successfully");
			}
			else {
			  req.setAttribute("message", "car not found ");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		RequestDispatcher requestDispatcher= req.getRequestDispatcher("updateCar.jsp");
		requestDispatcher.forward(req, resp);
	}
	}