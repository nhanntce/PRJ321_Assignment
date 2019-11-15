<%-- 
    Document   : index
    Created on : Nov 9, 2019, 10:29:44 PM
    Author     : NhanNT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
     if(session.getAttribute("username") != null){%>
       <%@include file="product-list-admin.jsp" %>
    <%} else {%>
        <%@include file="login.jsp" %>
    <%}
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    </body>
</html>
