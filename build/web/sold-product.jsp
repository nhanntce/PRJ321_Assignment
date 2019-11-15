<%-- 
    Document   : sold-product
    Created on : Nov 13, 2019, 10:14:58 PM
    Author     : NhanNT
--%>

<%@page import="Model.CusEmProModel"%>
<%@page import="Model.ProductModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int idProduct = 1;
    int idCusEmpPro = 1;
    int p = 1;
    String search = "";
    if(request.getParameter("page") != null)
        p = Integer.parseInt(request.getParameter("page"));
    if(request.getParameter("s") != null)
        search = request.getParameter("s");
    if (request.getParameter("idP") != null) {
        idProduct = Integer.parseInt(request.getParameter("idP"));
    }
    if (request.getParameter("idCusEmpPro") != null) {
        idCusEmpPro = Integer.parseInt(request.getParameter("idCusEmpPro"));
    }
    ProductModel pm = new ProductModel();
    pm.sold(idProduct);
    CusEmProModel cepm = new CusEmProModel();
    cepm.already(idCusEmpPro);
    response.sendRedirect("cus-emp-pro-admin.jsp?page=" + p + "&s=" + search);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%=idProduct%></h1>
    </body>
</html>
