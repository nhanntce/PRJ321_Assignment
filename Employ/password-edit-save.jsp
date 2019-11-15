<%-- 
    Document   : password-edit-save
    Created on : Nov 12, 2019, 10:20:21 PM
    Author     : HP
--%>

<%@page import="Model.EmployeeModel"%>
<%@page import="MyUltis.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int id = 0;
    int p = 1;
    String s = "";
    id = Integer.parseInt(request.getParameter("id"));
    if (request.getParameter("page") != null) {
        p = Integer.parseInt(request.getParameter("page"));
    }

    if (request.getParameter("s") != null) {
        s = request.getParameter("s");
    }

    Connection con = DBConnection.getConnection();
    EmployeeModel em = new EmployeeModel();
    String password = "";
    if(request.getParameter("password") != null) {
        password = request.getParameter("password");
    }
    password = MyUltis.Tool.getMd5(password);
    em.updatePassword(password, id);
    response.sendRedirect("Employees-list.jsp?id=" + id + "&page=" + p + "&s=" + s);
%>
<!DOCTYPE html>
