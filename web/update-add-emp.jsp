<%-- 
    Document   : update-add-emp
    Created on : Nov 12, 2019, 8:04:58 PM
    Author     : NhanNT
--%>

<%@page import="Model.CusEmProModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int p = 1;
    String search = "";
    int idE = 1;
    int idCusEmpPro = 1;
    if (request.getParameter("page") != null) {
        p = Integer.parseInt(request.getParameter("page"));
    }
    if (request.getParameter("s") != null) {
        search = request.getParameter("s");
    }
    if (request.getParameter("idE") != null) {
        idE = Integer.parseInt(request.getParameter("idE"));
    }
    if (request.getParameter("idCusEmpPro") != null) {
        idCusEmpPro = Integer.parseInt(request.getParameter("idCusEmpPro"));
    }
    CusEmProModel cepm = new CusEmProModel();
    cepm.updateEmployee(idE, idCusEmpPro);
    response.sendRedirect("cus-emp-pro-admin.jsp?page" + p + "&s=" + search);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
