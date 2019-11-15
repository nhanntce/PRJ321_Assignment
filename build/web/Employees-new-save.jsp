<%-- 
    Document   : Employees-new-save
    Created on : Nov 9, 2019, 10:01:25 PM
    Author     : Admin
--%>

<%@page import="MyUltis.Tool"%>
<%@page import="Model.EmployeeModel"%>
<%@page import="MyUltis.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String name = "";
    int gender = 1;
    String address = "";
    String mail = "";
    String phone = "";
    Date birthday ;
    int DayofBirth = 1;
    int MonthofBirth = 1;
    int YearofBirth = 1970;
    int role = 0;
    Date date = new Date(System.currentTimeMillis());
    String account = "";
    String password = "";
    if (request.getParameter("name") != null) {
        name = request.getParameter("name");
    }

    if (request.getParameter("gender") != null) {
        gender = Integer.parseInt(request.getParameter("gender"));
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
    if(request.getParameter("birthday") != null){
        date = Date.valueOf(request.getParameter("birthday"));
    }
    birthday = Date.valueOf(YearofBirth + "-" + MonthofBirth + "-" + DayofBirth);

    if (request.getParameter("role") != null) {
        role = Integer.parseInt(request.getParameter("role"));
    }
    if (request.getParameter("account") != null) {
        account = request.getParameter("account");
    }
    if (request.getParameter("password") != null) {
        password = request.getParameter("password");
       password = Tool.getMd5(password);
    }
    EmployeeModel elem = new EmployeeModel();

    elem.insert(name, gender, address, mail, phone, date, account, password, 1, role);
    response.sendRedirect("Employees-list.jsp?page=" + elem.totalpage(1, "", ""));

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

    </body>
</html>
