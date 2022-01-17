<%-- 
    Document   : arithmeticcalculator
    Created on : Jan. 16, 2022, 9:58:18 p.m.
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
        <h1>Arithmetic Calculator</h1>
        
        <form action="arithmetic" method="post">
            <label for="first">First: </label>
            <input type="text" name="first" id="first">
            
            <br>
            
            <label for="second">Second: </label>
            <input type="text" name="second" id="second">
            
            <br>
            
            <button type="submit" name="add" id="add">+</button>
            <button type="submit" name="subtract" id="subtract" >-</button>
            <button type="submit" name="multiply" id="multiply">*</button>
            <button type="submit" name="divide" id="divide">%</button>
            
        </form>
        
            <br>

            <span id="resultMessage">Result: ${message} </span> 
            <br>
            <br>
            <a href="age">Age Calculator</a>
    </body>
</html>
