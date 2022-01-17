<%-- 
    Document   : agecalculator
    Created on : Jan. 16, 2022, 9:20:20 p.m.
    Author     : Shinhyuk Hwang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            <label for="age">Enter your age:</label>
            <input type ="number" name="age" id="age">
            <input type ="submit" value="Submit">
        </form>
            <br>

            <span id="resultMessage"> ${message} </span> 
            <br>
            <br>
            <a href="arithmetic">Arithmetic Calculator</a>

    </body>
</html>
