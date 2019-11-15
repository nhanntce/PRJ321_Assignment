<%-- 
    Document   : Customer-return-all
    Created on : Nov 10, 2019, 1:12:56 AM
    Author     : HP
--%>

<%@page import="Model.CustomerModel"%>
<%@page import="MyUltis.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Connection con = DBConnection.getConnection();
    CustomerModel CM = new CustomerModel(con);
    CM.returnAllCus();
    response.sendRedirect("Customer-List.jsp");
%>
<!DOCTYPE html>
