<%-- 
    Document   : Customer-List
    Created on : Nov 9, 2019, 8:38:12 PM
    Author     : HP
--%>

<%@page import="ObjectInfo.Employees"%>
<%@page import="Model.EmployeeModel"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="ObjectInfo.Customer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.CustomerModel"%>
<%@page import="MyUltis.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int p = 1;
    String s = "";
    String username = (String) session.getAttribute("username");
    int num = 1;
    int id = Integer.parseInt(String.valueOf(session.getAttribute("id")));
    EmployeeModel em = new EmployeeModel();
    Employees emp = em.getEmployees(id);
    int idRole = emp.getIdRole();
    if (request.getParameter("s") != null) {
        s = request.getParameter("s");
    }

    if (request.getParameter("trang") != null) {
        p = Integer.parseInt(request.getParameter("trang"));
    }

    Connection con = DBConnection.getConnection();
    CustomerModel CM = new CustomerModel(con);
    ArrayList<Customer> list = CM.getPagingCustomer(p, s);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer-List</title>
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
            .my-nav {
                width: 250px;
                height: 100vh;
                position: fixed;
                background: #333;
                z-index: 10;
                left: -100%;
                transition: 0.4s;
            }

            .nav-show{
                left: 0;
            }

            ul {
                margin-top: 100px;
                list-style: none;
            }

            a {
                text-decoration: none;
                color: #fff;
                font-weight: bold;
            }

            a:hover {
                text-decoration: none;
                color: #ddd;
                font-weight: bold;
            }

            ul li.item {
                width: 100%;
                padding: 30px 0 0;
                border-bottom: 1px solid #222;
            }
            .fa.user {
                font-size: 52px;
                color: #fff;
                padding-left: 60px;
                padding-bottom: 30px;
            }

            .my-btn-toggle {
                transform: translateX(250px);
                background: #333;
                color: #fff;
            }

            .my-btn-toggle.fa {
                color: white;
            }

            .container-right {
                transform: translateX(250px);
                transition: 0.4s;
            }

            .fa {
                cursor: pointer;
            }
            
            button {
                background: none;
                border: none;
            }
        </style>
    </head>
    <body>
         <nav class="my-nav" id="nav">
            <ul class="items">
                <div class="user-1"><i class="fa fa-user user"></i></div>
                <span style="font-size: 12px; color: #fff;"><%=username%></span>
                <li class="item"><a href="product-list-admin.jsp">Products</a></li>
                    <%
                        if (idRole == 1) {
                    %>
                <li class="item"><a href="Employees-list.jsp">Employees</a></li>
                    <%
                        }
                    %>
                <li class="item"><a href="Customer-List.jsp">Customers</a></li>
                <li class="item"><a href="cus-emp-pro-admin.jsp">Potential customers </a></li>
                <li class="item"><a href="Employees-edit.jsp?id=<%=id%>&num=<%=num%>">Change Information</a></li>
                <li class="item"><a href="password-edit.jsp?id=<%=id%>&num=<%=num%>">Change password</a></li>
                <li class="item"><a href="logout.jsp">Logout</a></li>
            </ul>

        </nav>
        <button class="my-btn-toggle" style="border-radius: 5px;"><i class="fa fa-bars" id="btn-toggle"></i></button>

        <div class="container">
            <h2><strong>List Customer(<%=CM.getNumberOfProduct(p, s)%> Customer)</strong></h2>
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
                                <%=CM.getPagingString(p, s)%>
                            </th>
                        <tr>
                            <th>ID Customer</th>
                            <th>Name</th>
                            <th>Mail</th>
                            <th>Phone Number</th>
                            <th>Birthday</th>
                            <th>Gender</th>
                            <th>Manager
                                
                                <button type="button" class="btn btn-secondary btn-sm btn-danger"
                                        onclick= "location.href = 'Customer-trash.jsp'" 
                                        data-toggle="tooltip" data-placement="top" title="Go to the Trash">
                                    <i class="fa fa-trash" aria-hidden="true"></i>
                                </button>
                            </th>
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


                                <button type="button" class="btn btn-default btn-sm btn-warning"
                                        onclick="location.href = 'Customer-edit.jsp?id=<%=cm.getIdCustomer()%>&trang=<%=p%>&s=<%=s%>'"
                                        data-toggle="tooltip" data-placement="top" title="Edit">
                                    <span class="glyphicon glyphicon-pencil"></span>
                                </button>

                                <button type="button" class="btn btn-default btn-sm btn-danger"
                                        onclick="if (confirm('Do you really want to delete this Customer <%=cm.getNameCustomer()%>'))
                                                    location.href = 'Customer-delete.jsp?id=<%=cm.getIdCustomer()%>&trang=<%=p%>&s=<%=s%>'"
                                        data-toggle="tooltip" data-placement="top" title="Delete">
                                    <i class="fa fa-minus" aria-hidden="true"></i>
                                </button>
                            </td>
                        </tr>
                        <%
                            }
                        %>
                    <script type="text/javascript">
                        document.addEventListener("DOMContentLoaded", function () {
                            var btnToggle = document.getElementById("btn-toggle");
                            var nav = document.getElementById("nav");
                            var container = document.querySelector(".container");
                            var status = true;

                            btnToggle.onclick = function () {
                                console.log("aaaaaaa");
                                if (status) {
                                    btnToggle.classList.add('fa-times');
                                    btnToggle.classList.remove('fa-bars');
                                    nav.classList.add('nav-show');
//                                    container.classList.add('container-right');
                                    status = !status;
                                } else {
                                    nav.classList.remove('nav-show');
                                    btnToggle.classList.remove('fa-times');
                                    btnToggle.classList.add('fa-bars');
//                                    container.classList.remove('container-right');
                                    status = !status;
                                }
                            };
                        }, false);

                    </script>
                    </body>
                    </html>
