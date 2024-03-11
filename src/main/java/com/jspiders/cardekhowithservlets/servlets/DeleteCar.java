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

@WebServlet("/Deletecar")
public class DeleteCar extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws  ServletException, IOException {
		int id= Integer.parseInt(req.getParameter("id"));
		
		try {
		int res=AddCar.DeleteCar(id);
			if(res==1) {
				req.setAttribute("message", "car deleted successfully ");
			}
			else {
			  req.setAttribute("message", "car not found ");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		RequestDispatcher requestDispatcher= req.getRequestDispatcher("DeleteCar.jsp");
		requestDispatcher.forward(req, resp);
	}
	}