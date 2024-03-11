package com.jspiders.cardekhowithservlets.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspider.object.Car;
import com.jspiders.cardekhowithservlets.operation.AddCar;

@WebServlet("/Show")
public class Show extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		List<Car> cars;
		try {
			cars = AddCar.Showcar();
			req.setAttribute("cars",cars);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("Show.jsp"); 
		requestDispatcher.forward(req, resp);
	}

	
}
