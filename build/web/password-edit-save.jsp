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
    int id = 1;
    int num = 1;
    String password = "";
    if (request.getParameter("id") != null) {
        id = Integer.parseInt(request.getParameter("id"));
    }
    if (request.getParameter("num") != null) {
        num = Integer.parseInt(request.getParameter("num"));
    }
    if (request.getParameter("password") != null) {
        password = request.getParameter("password");
    }

    Connection con = DBConnection.getConnection();
    EmployeeModel em = new EmployeeModel();

    password = MyUltis.Tool.getMd5(password);
    em.updatePassword(password, id);
    if(num == 1){
        response.sendRedirect("product-list-admin.jsp");
    } 
    if(num == 2) {
        response.sendRedirect("Employees-list.jsp");
    }
    if(num == 3) {
        response.sendRedirect("Customer-List.jsp");
    }
    if(num == 4){
        response.sendRedirect("cus-emp-pro-admin.jsp");
    }

%>
<!DOCTYPE html>
