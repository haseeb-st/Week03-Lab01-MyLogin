<%-- 
    Document   : login
    Created on : Sep 21, 2017, 3:04:24 PM
    Author     : 687159
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
            <form action = "login" method="post">
                Username: <input type="text" name="user"><br>
                Password: <input type="password" name="pass"><br>
                <input type="submit" value="Submit">
            </form>
        
        ${logM}
        ${errorMessage}
        ${wrongValues}
<c:import url="/includes/footer.html"/>
