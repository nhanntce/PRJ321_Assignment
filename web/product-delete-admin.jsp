<%-- 
    Document   : delete-product-admin
    Created on : Nov 7, 2019, 9:56:36 PM
    Author     : NhanNT
--%>

<%@page import="Model.ProductModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int idProduct = 1;
    int p = 1;
    String search = "";
    if (request.getParameter("page") != null) {
        p = Integer.parseInt(request.getParameter("page"));
    }
    if (request.getParameter("s") != null) {
        search = request.getParameter("s");
    }
    if (request.getParameter("id") != null) {
        idProduct = Integer.parseInt(request.getParameter("id"));
    }
    ProductModel pm = new ProductModel();
    
    pm.softDelete(idProduct);
    
    response.sendRedirect("product-list-admin.jsp?page=" + p + "&s=" + search);

%>
