<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            padding: 20px;
        }
        .container {
            max-width: 400px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .form-group {
            margin-bottom: 20px;
        }
        label {
            font-weight: bold;
            display: block;
            margin-bottom: 5px;
        }
        input[type="text"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
            font-size: 16px;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
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
    <div align="center">
     <div class="container">
        <h2>Car-details:-</h2>
        <form action="setting" method="post">
            <div class="form-group">
                <label for="id">ID:</label>
                <input type="text" id="id" name="id" required ">
            </div>
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" required>
            </div>
            <div class="form-group">
                <label for="brand">Brand:</label>
                <input type="text" id="brand" name="brand" required>
            </div>
            <div class="form-group">
                <label for="price">Price:</label>
                <input type="text" id="price" name="price" required"> 
            </div>
            <input type="submit" value="Add">
        </form>
    </div>
    
    </div>
	<div align="center">
	     <%!String message ;%>
	     <%message=(String)request.getAttribute("message");%>
	     <%
	     
	     if(message != null){
	     %>
	     <h1><%=message%></h1>
	    <%
	     }
	    %>
	    
	</div>
</body>
</html>