<%-- 
    Document   : password-edit-index
    Created on : Nov 12, 2019, 10:02:51 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int id = 0;
    int p = 1;
    String s = "";
    id = Integer.parseInt(request.getParameter("id"));
    if (request.getParameter("page") != null) {
        p = Integer.parseInt(request.getParameter("page"));
    }

    if (request.getParameter("s") != null) {
        s = request.getParameter("s");
    }
    if(session.getAttribute("password") != null){%>
       <%@include file="password-edit.jsp?id=" + id + "&page=" + p + %>
    <%} else {%>
        <%@include file="login.jsp" %>
    <%}
    
%>
<!DOCTYPE html>
