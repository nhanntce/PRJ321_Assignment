<%-- 
    Document   : Customer-return
    Created on : Nov 10, 2019, 12:48:40 AM
    Author     : HP
--%>

<%@page import="Model.CustomerModel"%>
<%@page import="MyUltis.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int p = 1, id = 0;
    String s = "";

    if(request.getParameter("id") != null){
        id = Integer.parseInt(request.getParameter("id"));
    }
    if (request.getParameter("s") != null) {
        s = request.getParameter("s");
    }

    if (request.getParameter("trang") != null) {
        p = Integer.parseInt(request.getParameter("trang"));
    }

    Connection con = DBConnection.getConnection();
    CustomerModel CM = new CustomerModel(con);
    CM.returnCus(id);
    //response.sendRedirect("Customer-Trash.jsp?trang=" + p + "&s=" + s);
    response.sendRedirect("Customer-trash.jsp?trang=" + p + "&s=" + s);
%>

<!DOCTYPE html>
