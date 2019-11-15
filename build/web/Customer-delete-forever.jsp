<%-- 
    Document   : Customer-delete-forever
    Created on : Nov 10, 2019, 12:50:48 AM
    Author     : HP
--%>

<%@page import="java.sql.Connection"%>
<%@page import="Model.CustomerModel"%>
<%@page import="MyUltis.DBConnection"%>
<%@page import="MyUltis.DBConnection"%>
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
    CM.deleteforever(id);
    response.sendRedirect("Customer-trash.jsp?trang=" + p + "&s=" + s);
%>
