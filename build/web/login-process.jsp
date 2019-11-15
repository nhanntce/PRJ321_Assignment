<%-- 
    Document   : login-process
    Created on : Nov 9, 2019, 10:22:45 PM
    Author     : NhanNT
--%>

<%@page import="MyUltis.Tool"%>
<%@page import="Model.EmployeeModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    EmployeeModel em = new EmployeeModel();
    String username = "";
    String password = "";
    if(request.getParameter("txtUsername") != null){
        username = request.getParameter("txtUsername");
    }
    if(request.getParameter("txtPassword") != null){
        password = request.getParameter("txtPassword");
    }
    boolean success = em.checkLogin(username, password);
    
    if(success){
        session.setAttribute("username", username);
        session.removeAttribute("warning");
        int idE = em.getID(username, password);
        String strId = String.valueOf(idE);
        session.setAttribute("id", strId);
    } else {
        session.setAttribute("warning", "Username or password is wrong!");
    }
    
    response.sendRedirect("index.jsp");
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
