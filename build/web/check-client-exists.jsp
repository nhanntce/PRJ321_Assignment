<%-- 
    Document   : check-client-exists
    Created on : Nov 12, 2019, 9:55:33 PM
    Author     : NhanNT
--%>


<%@page import="java.util.Calendar"%>
<%@page import="java.sql.Date"%>
<%@page import="ObjectInfo.Customer"%>
<%@page import="Model.CustomerModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String phone = "";
    if (request.getParameter("phone") != null) {
        phone = request.getParameter("phone");
    }
    String str = "";
    CustomerModel cm = new CustomerModel();
    Customer c = cm.getCustomerByPhone(phone);
    if (c != null) {
        Date cusBirthday = c.getBirthdayCustomer();
        String cusDay, cusMonth, cusYear;
        String cusBirth = cusBirthday.toString();
        cusYear = cusBirth.substring(0, 4);
        cusMonth = cusBirth.substring(5, 7);
        cusDay = cusBirth.substring(8, 10);
        int cusDayofBirth, cusMonthofBirth, cusYearofMonth;
        cusDayofBirth = Integer.parseInt(cusDay);
        cusMonthofBirth = Integer.parseInt(cusMonth);
        cusYearofMonth = Integer.parseInt(cusYear);
        str = c.getNameCustomer() + "," + c.getMail()
                + "," + cusBirth + "," + c.getGenderCustomer();
    }

    out.print(str);
%>

