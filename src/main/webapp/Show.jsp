<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.jspider.object.Car"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <style>
        body {
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
    background-color: #f0f0f0;
    }

.container {
    max-width: 800px;
    margin: 20px auto;
    padding: 0 20px;
}

h1 {
    text-align: center;
    margin-bottom: 20px;
}

.car-table {
    width: 100%;
    border-collapse: collapse;
    background-color: #fff;
    border-radius: 5px;
    overflow: hidden;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

.car-table th, .car-table td {
    padding: 12px 15px;
    text-align: left;
    border-bottom: 1px solid #ddd;
}

.car-table th {
    background-color: #333;
    color: #fff;
}

.car-table tbody tr:nth-child(even) {
    background-color: #f9f9f9;
}

.car-table tbody tr:hover {
    background-color: #f2f2f2;
}
.back-button {
            display: block;
            width: 100px;
            margin: 20px auto; /* Center the button horizontally */
            padding: 10px 20px;
            background-color: #0a4770; /* Blue color */
            color: #fff;
            text-decoration: none;
            font-size: 18px;
            border: none;
            cursor: pointer;
            text-align: center;
            border-radius: 5px;
            transition: background-color 0.3s ease;
            float: left;
        }

        .back-button:hover {
            background-color: #0056b3; /* Darker shade of blue on hover */
        }

    </style>
</head>
<body>
<br><br><br>
  <a href="http://localhost:8080/cardekhowithservlets/main.jsp" class="back-button">Back</a>
<br><br><br>
	<%
	List<Car> cars = (List<Car>) request.getAttribute("cars");
	if (cars != null && cars.size() > 0) {
	%>
	<div class="container">
        <h1>Car Details</h1>
        <table class="car-table">
            <thead>
                <tr>
                     <th>Id</th>
                     <th>Name</th>
                     <th>Brand</th>
                     <th>Price ($)</th>
                </tr>
            </thead>
            <tbody></tbody>
			<%
			for (Car car : cars) {
			%>
			<tr>
				<td><%=car.getId()%></td>
				<td><%=car.getName()%></td>
				<td><%=car.getBrand()%></td>
				<td><%=car.getPrice()%></td>
			</tr>
			<%
			}
			%>
            
		</table>
	</div>
	<%
	} else {
	%>
	<div align="center">
		<h4>Car details unavailable</h4>
	</div>
	<%
	}
	%>

</body>
</html>









