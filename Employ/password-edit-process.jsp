<%-- 
    Document   : password-edit-process
    Created on : Nov 12, 2019, 9:54:45 PM
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
    String password = request.getParameter("password");
    String password1 = request.getParameter("password1");
    if (password.equals(password1) && !password.equals("")) {
        session.setAttribute("password", password);
    } else if (session.getAttribute("password") != null) {
        session.removeAttribute("password");
    }
    response.sendRedirect("password-edit-index.jsp?id=" + id + "&page=" + p +"&s=" + s);
%>
<!DOCTYPE html>

