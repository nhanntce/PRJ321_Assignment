<%-- 
    Document   : Customer-delete_forever
    Created on : Nov 10, 2019, 12:18:25 AM
    Author     : HP
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="ObjectInfo.Customer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.CustomerModel"%>
<%@page import="MyUltis.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int p = 1;
    String s = "";

    if (request.getParameter("s") != null) {
        s = request.getParameter("s");
    }

    if (request.getParameter("trang") != null) {
        p = Integer.parseInt(request.getParameter("trang"));
    }

    Connection con = DBConnection.getConnection();
    CustomerModel CM = new CustomerModel(con);
    ArrayList<Customer> list = CM.getPagingCustomerTrash(p, s);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer-Trash</title>
        <link rel="icon" type="icon" href="images/logo.png">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <style type="text/css">
            .sp-price {
                text-align: right;
            }
            .table tr td {
                vertical-align: middle !important;
                align-content: center;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h2><strong>Have <%=CM.getNumberOfProductTrash(p, s)%> Customer deleted</strong></h2>
            <p></p>                                                                                      
            <div class="table-responsive">          
                <table class="table">
                    <thead>
                        <tr>
                            <th colspan="9" align="center"> 
                                <form>
                                    <div class="input-group" style = width:95%>
                                        <input type="text" class="form-control" placeholder="Search"
                                               name='s' value="<%=s%>">
                                        <div class="input-group-btn">
                                            <button class="btn btn-default" type="submit">
                                                <i class="glyphicon glyphicon-search"></i>
                                            </button>
                                        </div>
                                    </div>
                                </form>
                            </th>
                        <tr>
                        <tr>
                            <th colspan="9" align="center"> 
                                <%=CM.getPagingStringTrash(p, s)%>
                            </th>
                        <tr>
                            <th>ID Customer</th>
                            <th>Name</th>
                            <th>Mail</th>
                            <th>Phone Number</th>
                            <th>Birthday</th>
                            <th>Gender</th>
                            <th>Manager</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            int idCus = (p - 1) * CustomerModel.SoDong_Trang;
                            String gender;
                            SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");
                            for (Customer cm : list) {
                                idCus++;
                                gender = cm.getGenderCustomer() == 1
                                        ? "<i class='fa fa-mars text-success'></i>"
                                        : "<i class='fa fa-venus text-danger' ></i>";
                        %>
                        <tr>
                            <td><%=idCus%></td>
                            <td><%=cm.getNameCustomer()%></td>
                            <td><%=cm.getMail()%></td>
                            <td><%=cm.getPhoneCustomer()%></td>
                            <td><%=dFormat.format(cm.getBirthdayCustomer())%></td>
                            <td><%=gender%></td>
                            <td>
                                <button type="button" class="btn btn-default btn-sm btn-success"
                                        onclick="if (confirm('Do you really want to return this Customer <%=cm.getNameCustomer()%>'))
                                                    location.href = 'Customer-return.jsp?id=<%=cm.getIdCustomer()%>&trang=<%=p%>&s=<%=s%>'"
                                        data-toggle="tooltip" data-placement="top" title="Return">
                                    <i class="fa fa-repeat" aria-hidden="true"></i>
                                </button>

<!--                                <button type="button" class="btn btn-default btn-sm btn-danger"
                                        onclick="if (confirm('Do you really want to delete this Customer <%=cm.getNameCustomer()%> forever?'))
                                                    location.href = 'Customer-delete-forever.jsp?id=<%=cm.getIdCustomer()%>&trang=<%=p%>&s=<%=s%>'"
                                        data-toggle="tooltip" data-placement="top" title="Delete Forever">
                                    <i class="fa fa-times" aria-hidden="true"></i>
                                </button>-->
                            </td>
                        </tr>
                        <%
                            }
                        %>
                    <button type="button"
                            onclick="location.href = 'Customer-List.jsp'">
                        Back list of customer 
                    </button>
                    <button type="button" class="btn-success"
                            onclick="if (confirm('Do you really want to return all customer in trash?'))
                                        location.href = 'Customer-return-all.jsp'">
                        return all
                    </button>
<!--                    <button type="button" class="btn-danger"
                            onclick="if (confirm('Do you really want to delete all customer in trash forever?'))
                                        location.href = 'Customer-delete-all.jsp'">
                        delete all
                    </button>-->
                    </body>
                    </html>
