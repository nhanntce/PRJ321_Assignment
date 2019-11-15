<%-- 
    Document   : Customer-delete
    Created on : Nov 9, 2019, 9:50:25 PM
    Author     : HP
--%>

<%@page import="ObjectInfo.Customer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="MyUltis.DBConnection"%>
<%@page import="Model.CustomerModel"%>
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
    CM.delete1(id);
    response.sendRedirect("Customer-List.jsp?trang=" + p + "&s=" + s);
%>
