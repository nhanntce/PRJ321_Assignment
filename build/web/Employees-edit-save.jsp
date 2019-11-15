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
    Date date = new Date(System.currentTimeMillis());
    int DayofBirth = 1;
    int MonthofBirth = 1;
    int YearofBirth = 1970;
    int gender = 0;
//    int role = 0;
    int id = 1;
    int num = 1;

    if(request.getParameter("id") != null){
        id = Integer.parseInt(request.getParameter("id"));
    }
    if(request.getParameter("num") != null)
        num = Integer.parseInt(request.getParameter("num"));
    
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
    

    if (request.getParameter("gender") != null) {
        gender = Integer.parseInt(request.getParameter("gender"));
    }
    if(request.getParameter("birthday") != null){
        date = Date.valueOf(request.getParameter("birthday"));
    }
//    if (request.getParameter("role") != null) {
//        role = Integer.parseInt(request.getParameter("role"));
//    }
    EmployeeModel elem = new EmployeeModel();
    
//    Date date = Date.valueOf("13-11-2000");
//    elem.update("Truong Thi Thuc Oanh", 2, "Can Tho", "truongthithucoanh@fpt.edu.vn", "0846990822", birthday , 1, 61);
    elem.update(name, gender, address, mail, phone, date, 1, id);
    if(num == 1){
        response.sendRedirect("product-list-admin.jsp");
    } 
    if(num == 2) {
        response.sendRedirect("Employees-list.jsp");
    }
    if(num == 3) {
        response.sendRedirect("Customer-List.jsp");
    }
    if(num == 4){
        response.sendRedirect("cus-emp-pro-admin.jsp");
    }
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%=name%></h1>
        <h1><%=gender%></h1>
        <h1><%=address%></h1>
        <h1><%=mail%></h1>
        <h1><%=1%></h1>
    </body>
</html>
