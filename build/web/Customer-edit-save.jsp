<%-- 
    Document   : Customer-edit-save
    Created on : Nov 11, 2019, 4:48:19 PM
    Author     : HP
--%>

<%@page import="java.sql.Date"%>
<%@page import="ObjectInfo.Customer"%>
<%@page import="Model.CustomerModel"%>
<%@page import="MyUltis.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int p = 1, id = 1;
    String s = "";

    if (request.getParameter("id") != null) {
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
    String cusName = "";
    String cusMail = "";
    String cusPhone = "";
    int DayofBirth = 01, MonthofBirth = 01, YearofBirth = 2019; 
    Date cusBirthDay;
    int cusGender = 1;
    if (request.getParameter("cusName") != null) {
        cusName = request.getParameter("cusName");
    }
    if (request.getParameter("cusMail") != null) {
        cusMail = request.getParameter("cusMail");
    }
    if (request.getParameter("cusPhone") != null) {
        cusPhone = request.getParameter("cusPhone");
    }
    if (request.getParameter("cusDayofBirth") != null) {
        DayofBirth = Integer.parseInt(request.getParameter("cusDayofBirth"));
    }
    if (request.getParameter("cusMonthofBirth") != null) {
        MonthofBirth = Integer.parseInt(request.getParameter("cusMonthofBirth"));
    }
    if (request.getParameter("cusYearofBirth") != null) {
        YearofBirth = Integer.parseInt(request.getParameter("cusYearofBirth"));
    }
    cusBirthDay = Date.valueOf(YearofBirth + "-" + MonthofBirth + "-" + DayofBirth);
    if (request.getParameter("cusGender") != null) {
        cusGender = Integer.parseInt(request.getParameter("cusGender"));
    }
    CM.update(id, cusName, cusMail, cusPhone, cusBirthDay, cusGender, 1);
    
    response.sendRedirect("Customer-List.jsp?trang=" + p + "&s=" + s);
%>
<!DOCTYPE html>
