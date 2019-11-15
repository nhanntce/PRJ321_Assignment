<%-- 
    Document   : cus-emp-pro-edit-save
    Created on : Nov 12, 2019, 6:37:43 PM
    Author     : NhanNT
--%>

<%@page import="ObjectInfo.CusEmpPro"%>
<%@page import="Model.CusEmProModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int p = 1;
    String search = "";
    int idProduct = 1;
    int idEmployee = 0;
    int idCustomer = 40;
    int idCusEmpPro = 1;
    String description = "";
    if (request.getParameter("page") != null) {
        p = Integer.parseInt(request.getParameter("page"));
    }
    if (request.getParameter("s") != null) {
        search = request.getParameter("s");
    }
    if (request.getParameter("idCusEmpPro") != null) {
        idCusEmpPro = Integer.parseInt(request.getParameter("idCusEmpPro"));
    }
    if (request.getParameter("description") != null) {
        description = request.getParameter("description");
    }
    CusEmProModel cepm = new CusEmProModel();
    cepm.update(1, description, idCusEmpPro);
    CusEmpPro cep = cepm.getCusEmpPro(idCusEmpPro);
    idCustomer = cep.getIdCustomer();
    idEmployee = cep.getIdEmployees();
    idProduct = cep.getIdProduct();
    String strSend = "cus-emp-pro-admin.jsp?page=" + p + "&s=" + search + "&idE=" + idEmployee;
    response.sendRedirect(strSend);
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
