<%-- 
    Document   : Employees-edit-save
    Created on : Nov 12, 2019, 6:56:12 PM
    Author     : Admin
--%>

<%@page import="ObjectInfo.Employees"%>
<%@page import="Model.EmployeeModel"%>
<%@page import="java.sql.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String name = "";
    String address = "";
    String mail = "";
    String phone = "";
    Date birthday;
    int DayofBirth = 1;
    int MonthofBirth = 1;
    int YearofBirth = 1970;
    int gender = 0;
    int role = 0;
    int id = 1;
    int p = 1;
    String s = "";

    if (request.getParameter("page") != null) {
        p = Integer.parseInt(request.getParameter("page"));
    }

    if (request.getParameter("s") != null) {
        s = request.getParameter("s");
    }
    
    if (request.getParameter("name") != null) {
        name = request.getParameter("name");
    }
    if (request.getParameter("address") != null) {
        address = request.getParameter("address");
    }
    if (request.getParameter("mail") != null) {
        mail = request.getParameter("mail");
    }
    if (request.getParameter("phone") != null) {
        phone = request.getParameter("phone");
    }
    if (request.getParameter("DayofBirth") != null) {
        DayofBirth = Integer.parseInt(request.getParameter("DayofBirth"));
    }
    if (request.getParameter("MonthofBirth") != null) {
        MonthofBirth = Integer.parseInt(request.getParameter("MonthofBirth"));
    }
    if (request.getParameter("YearofBirth") != null) {
        YearofBirth = Integer.parseInt(request.getParameter("YearofBirth"));
    }
    birthday = Date.valueOf(YearofBirth + "-" + MonthofBirth + "-" + DayofBirth);

    if (request.getParameter("gender") != null) {
        gender = Integer.parseInt(request.getParameter("gender"));
    }
    if (request.getParameter("role") != null) {
        role = Integer.parseInt(request.getParameter("role"));
    }
    if (request.getParameter("id") != null) {
        id = Integer.parseInt(request.getParameter("id"));
    }
    EmployeeModel elem = new EmployeeModel();
    elem.update(name, gender, address, mail, phone, birthday, 1, role, id);
    response.sendRedirect("Employees-list.jsp?id=" + id +"&page=" + p + "&s=" + s);
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
