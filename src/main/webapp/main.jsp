<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Car_dekho</title>
   <style>
    body {
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
    background-color: #f0f0f0;
}

.navbar {
    background-color: #333;
    color: #fff;
    padding: 10px 0;
}

.container {
    max-width: 1200px;
    margin: 0 auto;
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 0 20px;
}

.logo {
    font-size: 24px;
}

.nav-list {
    list-style: none;
    padding: 0;
    margin: 0;
}

.nav-list li {
    display: inline-block;
    margin-right: 20px;
}

.nav-list li:last-child {
    margin-right: 0;
}

.nav-list li a {
    text-decoration: none;
    color: #fff;
    font-size: 16px;
    padding: 8px 16px;
    border-radius: 5px;
    transition: background-color 0.3s ease;
}

.nav-list li a:hover {
    background-color: #00ff2a;
    color: #333;
}
.logo {
    margin: 0;
    font-size: 32px;
    animation: pulse 1.5s infinite alternate;
}
@keyframes pulse {
    from {
        transform: scale(1);
    }
    to {
        transform: scale(1.1);
    }
}


   </style>
</head>
<body>
    <nav class="navbar">
        <div class="container">
            <div class="logo"> <h1 class="logo">Cardekho</h1></div>
            <ul class="nav-list">
                <li><a class="active" href="addcar.jsp">Add</a></li>
                <li><a href="updateCar.jsp">Update</a></li>
                <li><a href="DeleteCar.jsp">Delete</a></li>
                <li><a href="http://localhost:8080/cardekhowithservlets/Show">Show</a></li>
            </ul>
        </div>
    </nav>
</body>
</html>


