package com.jspiders.cardekhowithservlets.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jspider.object.Car;
import com.mysql.cj.jdbc.Driver;

public class AddCar {
public static Driver driver;
public static Connection connection;
public static PreparedStatement preparedStatement;
public static ResultSet resultSet;
public static String query;


	
		
public static void openConnection() throws SQLException {
	 Driver driver= new com.mysql.cj.jdbc.Driver();
	 DriverManager.registerDriver(driver);
	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4", "root", "root");
	
}

public static void closeConnection() throws SQLException {
	   if(connection != null) {
		   connection.close();
	   }
	   if(preparedStatement != null ) {
			preparedStatement.close();
		}
	   if(resultSet != null ) {
		   resultSet.close();
	   }
}

public static int  AddCar(int id, String name, String brand, Double price ) throws SQLException {
	int res;
	openConnection();
	query="insert into car values(?,?,?,?) ";
	preparedStatement= connection.prepareStatement(query);
	preparedStatement.setInt(1, id);
	preparedStatement.setString(2, name);
	preparedStatement.setString(3, brand);
	preparedStatement.setDouble(4, price);
	 res=preparedStatement.executeUpdate();
	System.out.println("row(s) affected ");
	
	return res;
}

public static List<Car> Showcar() throws SQLException {
	openConnection();
	List<Car>cars= new ArrayList();
	query="select * from car";
	preparedStatement=connection.prepareStatement(query);
	resultSet=preparedStatement.executeQuery();
	while(resultSet.next()) {
		Car car= new Car();
		car.setId(resultSet.getInt(1));
		car.setName(resultSet.getString(2));
		car.setBrand(resultSet.getString(3));
		car.setPrice(resultSet.getDouble(4));
		cars.add(car);
		
	}
	closeConnection();
	return cars;
}

public static int  updateCar(int id, String name, String brand, Double price) throws SQLException {
	int res;
	openConnection();
	query="update car set name=?,brand=?, price=? where id=?";
	preparedStatement=connection.prepareStatement(query);
	preparedStatement.setString(1,name);
	preparedStatement.setString(2, brand);
	preparedStatement.setDouble(3, price);
	preparedStatement.setInt(4, id);
	 res=preparedStatement.executeUpdate();
	System.out.println(res+"row(s) affected ");
	
	closeConnection();
	return res;
}

public static int DeleteCar(int id) throws SQLException {
    int res;
    openConnection();
    query="delete from car where id=?";
	preparedStatement=connection.prepareStatement(query);
	preparedStatement.setInt(1, id);
	 res=preparedStatement.executeUpdate();
	System.out.println(res+"row(s) affected ");
    closeConnection();
	return res;
}
}




