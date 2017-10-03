<%-- 
    Document   : mainPage
    Created on : Sep 21, 2017, 3:05:08 PM
    Author     : 687159
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <title>Main Page</title>
    </head>
    <body>
        <h1>Main Page</h1>
            <form method="get">
                ${userMessage} <a href="login?logout">Log Out</a>
            </form>
            ${logM}
    </body>
</html>
