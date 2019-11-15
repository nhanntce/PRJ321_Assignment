<%-- 
    Document   : cus-emp-pro-edit-admin.jsp
    Created on : Nov 12, 2019, 6:07:23 PM
    Author     : NhanNT
--%>

<%@page import="ObjectInfo.CusEmpPro"%>
<%@page import="Model.CusEmProModel"%>
<%@page import="ObjectInfo.Employees"%>
<%@page import="ObjectInfo.Customer"%>
<%@page import="ObjectInfo.Image"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.ImageModel"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="ObjectInfo.Product"%>
<%@page import="Model.ProductModel"%>
<%@page import="Model.CustomerModel"%>
<%@page import="Model.EmployeeModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int p = 1;
    String search = "";
    int idProduct = 1;
    int idEmployee = 0;
    int idCustomer = 40;
    int idCusEmpPro = 1;
    if (request.getParameter("page") != null) {
        p = Integer.parseInt(request.getParameter("page"));
    }
    if (request.getParameter("s") != null) {
        search = request.getParameter("s");
    }
    if (request.getParameter("idCusEmpPro") != null) {
        idCusEmpPro = Integer.parseInt(request.getParameter("idCusEmpPro"));
    }
    
    CusEmProModel cepm = new CusEmProModel();
    CusEmpPro cep = cepm.getCusEmpPro(idCusEmpPro);
        EmployeeModel em = new EmployeeModel();
        CustomerModel cm = new CustomerModel();
        ProductModel pm = new ProductModel();
    Product product = pm.getProduct(idProduct);
    Customer customer = cm.getCustomerbyId(cep.getIdCustomer());
//    Employees employee = em.getEmployees(cep.getIdEmployees());
    
    String dateStr = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy").format(product.getPublicTime());
    
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Customer - Product - Employee detail</title>
        <link rel="icon" type="icon" href="images/logo.png">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" ></script>
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
        <style type="text/css">
            body {
                font-family:  Candara;
            }
            .container {
                padding: 50px 0;
            }
            .title {
                text-transform: uppercase;
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
            }
            @keyframes animate {
                from {
                    background-position: -500%;
                }
                to {
                    background-position: 500%;
                }
            }

            .title-con {
                margin: 10px 0;
                color: #37a344;
            }

            .back {
                margin-top: 30px; 
            }
            .descript, .client, .employee {
                width: 100%;
                padding: 30px;
                height: auto;
                border: 1px solid #ddd;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <div class="text-center">
                <div class="title">
                    <h2><strong>Customer - Product - Employee detail</strong></h2>
                </div>
            </div>
            <form action="cus-emp-pro-edit-save.jsp" method="GET">
                <input type="hidden" value="<%=idCusEmpPro%>" name="idCusEmpPro">
                <input type="hidden" value="<%=p%>" name="page">
                <input type="hidden" value="<%=search%>" name="s">
                <label>Description</label>
                <div class="form-group">
                    <textarea class="form-control" name="description"></textarea>
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-primary">Save</button>
                </div>
            </form>
            <div class="title-con">
                <h3>Detail Customer's information</h3>
            </div>
            <div class="client">
                <p>-Name: <%=customer.getNameCustomer()%></p>
                <p>-Phone: <%=customer.getPhoneCustomer()%></p>
                <p>-Email: <%=customer.getMail()%></p>
                <p>-DOB: <%=customer.getBirthdayCustomer()%></p>
                <p><%
                    if (customer.getGenderCustomer() == 1) {
                        out.println("-Gender: Male");
                    } else {
                        out.println("-Gender: Female");
                    }
                    %></p>
            </div>
            <div class="title-con">
                <h3>Detail product's information</h3>
            </div>
            <div class="descript">
                <p>- <%=product.getDescript()%></p>
                <p>- Price: <%=product.getPrice()%></p>
                <p>- Area: <%=product.getSquare()%>m</p>
                <p>- Type: <%=product.getNameType()%></p>
                <p>- District: <%=product.getNameDistrict()%></p>
                <p>- Position: <%=product.getPosition()%></p>
                <p>- Shape: <%=product.getShape()%></p>
                <p>- Direction: <%=product.getDirection()%></p>
                <p>- Juridical: <%=product.getJuridical()%></p>
                <p>- Right of way: <%=product.getRightOfWay()%>m</p>
                <p>- Public time: <%=dateStr%></p>
            </div>
           
            <div class="back">
                <!--<a href="cus-emp-pro-admin.jsp?page=<%=p%>&s=<%=search%>&idP=<%=idProduct%>&idC=<%=idCustomer%>&idE=<%=idEmployee%>" class="btn btn-primary"><i class="fa fa-chevron-left"></i></a>-->
            </div>
        </div>
    </body>
</html>