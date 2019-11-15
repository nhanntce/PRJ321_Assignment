<%-- 
    Document   : Customer-delete-all
    Created on : Nov 10, 2019, 1:14:57 AM
    Author     : HP
--%>

<%@page import="Model.CustomerModel"%>
<%@page import="MyUltis.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Connection con = DBConnection.getConnection();
    CustomerModel CM = new CustomerModel(con);
    CM.deleteforeverAll();
    response.sendRedirect("Customer-List.jsp");
%>
<!DOCTYPE html>

