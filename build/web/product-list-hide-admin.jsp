<%-- 
    Document   : product-list-hide-admin
    Created on : Nov 10, 2019, 11:15:52 AM
    Author     : DELL
--%>
<%@page import="MyUltis.Tool"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="ObjectInfo.Product"%>
<%@page import="ObjectInfo.District"%>
<%@page import="ObjectInfo.Typee"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.ProductModel"%>
<%@page import="Model.DistrictsModel"%>
<%@page import="Model.TypesModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int p = 1;
    String search = "";
    String scl = "";
    if (request.getParameter("s") != null) {
        search = request.getParameter("s");
    }
    if (request.getParameter("page") != null) {
        p = Integer.parseInt(request.getParameter("page"));
    }
    ProductModel pm = new ProductModel();
    //store product
    ArrayList<Product> products = pm.getPagingHide(p, search, scl);
    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");


%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin product</title>
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
                <li class="item"><a href="product-list-admin.jsp">Products</a></li>
                <li class="item"><a href="">Employees</a></li>
                <li class="item"><a href="Customer-List.jsp">Customers</a></li>
                <li class="item"><a href="cus-emp-pro-admin.jsp">Potential customers </a></li>
                <li class="item"><a href="logout.jsp">Logout</a></li>
            </ul>

        </nav>
        <button class="my-btn-toggle"><i class="fa fa-bars" id="btn-toggle"></i></button>
        <div class="container">

            <div class="text-center title">

                <h2><strong>Management product</strong></h2>
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
                        <th scope="col">Type</th>
                        <th scope="col">District</th>
                        <th scope="col">Description</th>
                        <th scope="col">Price</th>
                        <th scope="col">Area</th>
                        <th scope="col">Position</th>
                        <th scope="col">Time</th>
                        <th scope="col">
                            <button type="button" class="btn btn-danger fa fa-trash-o text-white">
                                <span class="badge badge-light"><%=pm.getNumberOfProductHide(1, "", "")%></span>
                            </button>
                            <button onclick="location.href = 'product-list-admin.jsp'" type="button" class="btn btn-primary fa fa-product-hunt text-white">
                                <span class="badge badge-light"><%=pm.getNumberOfProduct(1, "", "")%></span>
                            </button>
                        </th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        int productNo = (p - 1) * pm.NUMBER_LINE_PAGE;
                        for (Product product : products) {
                            ++productNo;
                    %>

                    <tr>
                        <th scope="row"><%=productNo%></th>
                        <td><%=product.getNameType()%></td>
                        <td><%=product.getNameDistrict()%></td>
                        <td><%=Tool.reduceStr(product.getDescript())%></td>
                        <td><%=product.getPrice()%> million</td>
                        <td><%=product.getSquare()%></td>
                        <td><%=Tool.reduceStr(product.getPosition())%></td>
                        <td><%=sdf.format(product.getPublicTime())%></td>
                        <td>
                            <button onclick="location.href = 'product-detail-admin.jsp?page=<%=p%>&s=<%=search%>&id=<%=product.getIdProduct()%>'">
                                <i class="fa fa-info-circle text-success"></i></button>
                        </td>

                    </tr>
                    <%
                        }
                    %>
                    <tr>
                        <td colspan="10" align="rigth"> <%=pm.getPagingStringHide(p, search, scl)%></td>
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

