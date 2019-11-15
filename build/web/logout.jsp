<%-- 
    Document   : logout
    Created on : Nov 10, 2019, 8:58:20 AM
    Author     : NhanNT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    session.removeAttribute("username");
    session.removeAttribute("warning");
    response.sendRedirect("index.jsp");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    </body>
</html>
