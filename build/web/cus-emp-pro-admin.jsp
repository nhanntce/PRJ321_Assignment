<%-- 
    Document   : cus-emp-pro-admin
    Created on : Nov 11, 2019, 11:09:21 PM
    Author     : NhanNT
--%>

<%@page import="ObjectInfo.Employees"%>
<%@page import="Model.EmployeeModel"%>
<%@page import="MyUltis.Tool"%>
<%@page import="ObjectInfo.Product"%>
<%@page import="Model.ProductModel"%>
<%@page import="ObjectInfo.CusEmpPro"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.CusEmProModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int p = 1;
    String search = "";
    int num = 1;
    int idE = Integer.parseInt(String.valueOf(session.getAttribute("id")));
    EmployeeModel em = new EmployeeModel();
    Employees emp = em.getEmployees(idE);
    int idRole = emp.getIdRole();
    String username = (String) session.getAttribute("username");
    if (request.getParameter("page") != null) {
        p = Integer.parseInt(request.getParameter("page"));
    }
    if (request.getParameter("s") != null) {
        search = request.getParameter("s");
    }
    CusEmProModel cepm = new CusEmProModel();
    ArrayList<CusEmpPro> ceps = cepm.getPaging(p, search, idE);
    ProductModel pm = new ProductModel();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer - Employee - Product </title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" type="icon" href="images/logo.png">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <style type="text/css">
            *{
                font-family:  Candara;
            }
            body {margin: 0;}

            .container {
                padding: 50px 0;
            }
            .title {
                position: relative;
                text-transform: uppercase;
                font-size: 2em;
                letter-spacing: 4px;
                background: linear-gradient(90deg, #fff, #000, #fff);
                background-repeat: no-repeat;
                background-size: 80%;
                animation: animate 3s linear infinite;
                -webkit-background-clip: text;
                -webkit-text-fill-color: #0000;
                margin-bottom: 20px;
            }
            @keyframes animate {
                from {
                    background-position: -500%;
                }
                to {
                    background-position: 500%;
                }
            }

            i.fa {
                font-size: 24px;
            }

            button {
                background: none;
                border: none;
            }

            table tr td, table tr th {
                vertical-align: middle !important;
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
                <li class="item"><a href="Employees-edit.jsp?id=<%=idE%>&num=<%=num%>">Change Information</a></li>
                <li class="item"><a href="password-edit.jsp?id=<%=idE%>&num=<%=num%>">Change password</a></li>
                <li class="item"><a href="logout.jsp">Logout</a></li>
            </ul>

        </nav>
        <button class="my-btn-toggle" style="border-radius: 5px;"><i class="fa fa-bars" id="btn-toggle"></i></button>
        <div class="container">

            <div class="text-center title">

                <h2><strong>Customer - Employee - Product   </strong></h2>
            </div>
            <table class="table">
                <thead>
                    <tr>
                        <th colspan="10">
                            <form>
                                <div class="input-group">
                                    <input type="text" class="form-control" name="s" placeholder="Search" value="<%=search%>">
                                    <div class="input-group-btn">
                                        <button class="btn btn-default" type="submit">
                                            <i class="fa fa-search"></i>
                                        </button>
                                    </div>
                                </div>
                            </form>
                        </th>
                    </tr>
                    <tr>
                        <th scope="col">NO.</th>
                        <!--                        <th scope="col">Description</th>-->
                        <th scope="col">Name Customer</th>
                        <th scope="col">Product's description</th>
                        <th scope="col">Get </th>
                        <th scope="col">Manager</th>
                        <th scope="col">Check Sold</th>
                        <!--                        <th scope="col">
                                                    <button onclick="location.href = 'product-new-admin.jsp'"><i class="fa fa-plus-square text-primary" style="font-size: 20px;"></i></button>
                                                    <button onclick="location.href = 'product-list-hide-admin.jsp'" class="btn btn-danger fa fa-trash-o text-white">
                                                        <span class="badge badge-light"></span>
                                                    </button>
                                                    <button type="button" class="btn btn-primary fa fa-product-hunt text-white">
                                                        <span class="badge badge-light"></span>
                                                    </button>
                                                </th>-->
                    </tr>
                </thead>
                <tbody>
                    <%
                        int No = (p - 1) * cepm.NUMBER;
                        for (CusEmpPro cep : ceps) {

                            Product product = pm.getProduct(cep.getIdProduct());
                            ++No;
                            String strDes = (cep.getDescription() == null) ? "No information" : cep.getDescription();
                            String statusEmp = (cep.getIdEmployees() == 0) ? "<i class='btn btn-primary'>Add</i>" : "<i class='btn btn-success'>Added</i>";
//                            String strStatus = (product.getStatus() == 1) ? "<i class='fa fa-check-circle text-success'></i>" : "<i class='fa fa-times-circle text-danger'></i>";
%>

                    <tr>
                        <th scope="row"><%=No%></th>

                        <td><%=cep.getCusName()%></td>
                        <td><%=Tool.reduceStr(product.getDescript())%></td>
                        <%
                            if (cep.getIdEmployees() == 0) {
                        %>
                        <td><i onclick="location.href = 'update-add-emp.jsp?page=<%=p%>&s=<%=search%>&idE=<%=idE%>&idCusEmpPro=<%=cep.getIdCusEmpPro()%>'" class='btn btn-primary'>Add</i></td>
                        <%
                        } else {

                        %>
                        <td><i class='btn btn-success'>Added</i></td>
                        <%                            }
                        %>
                        <td>

                            <button onclick="location.href = 'cus-emp-pro-detail-admin.jsp?page=<%=p%>&s=<%=search%>&idP=<%=cep.getIdProduct()%>&idC=<%=cep.getIdCustomer()%>&idE=<%=cep.getIdEmployees()%>'"><i class="fa fa-info-circle text-success"></i></button>
                                <%
                                    if (cep.getIdEmployees() != 0) {
                                %>
                            <button onclick="location.href = 'cus-emp-pro-edit-admin.jsp?page=<%=p%>&s=<%=search%>&idCusEmpPro=<%=cep.getIdCusEmpPro()%>'"><i class="fa fa-pencil text-warning"></i></button>
                                <%
                                    }
                                %>

                        </td>
                        <td>
                            <%
                                if (cep.getIdEmployees() != 0) {
                                    if (product.getStatus() == 2) {
                            %>
                            <i class="fa fa-check-circle-o text-primary"></i>
                            <%
                            } else {
                            %>
                            <i class="btn btn-danger" title="Click to check sold" onclick="location.href = 'sold-product.jsp?page=<%=p%>&s=<%=search%>&idP=<%=cep.getIdProduct()%>&idCusEmpPro=<%=cep.getIdCusEmpPro()%>'">Not yet</i>
                            <%
                                    }
                                }
                            %>
                        </td>

                    </tr>
                    <%
                        }
                    %>
                    <tr>
                        <td colspan="10" align="rigth"> <%=cepm.getPagingString(p, search, idE)%></td>
                    </tr>

                </tbody>
            </table>

        </div>


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
