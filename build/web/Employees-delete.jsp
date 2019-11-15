<%-- 
    Document   : Employees-delete
    Created on : Nov 9, 2019, 7:12:51 PM
    Author     : Admin
--%>

<%@page import="Model.EmployeeModel"%>
<%@page import="MyUltis.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Connection con = DBConnection.getConnection();
    EmployeeModel elem = new EmployeeModel();
    int id = Integer.parseInt(request.getParameter("id"));
    String search = request.getParameter("s");
    String page1 = request.getParameter("page");
    
    elem.softDelete(id);
    response.sendRedirect("Employees-list.jsp?page=" 
            + page1 + "&s=" + search);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
