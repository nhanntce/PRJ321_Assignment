<%-- 
    Document   : product-new-admin
    Created on : Nov 4, 2019, 11:15:23 PM
    Author     : NhanNT
--%>

<%@page import="ObjectInfo.District"%>
<%@page import="Model.DistrictsModel"%>
<%@page import="ObjectInfo.Typee"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.TypesModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //load type
    TypesModel tm = new TypesModel();
    //store type
    ArrayList<Typee> types = tm.loadTypes();
    //load District
    DistrictsModel dm = new DistrictsModel();
    //store district
    ArrayList<District> dts = dm.loadDistricts();


%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Login</title>
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
        </style>
    </head>
    <body>
        <div class="container">
            <div class="text-center title">
                <h2><strong>Add new product</strong></h2>
            </div>
            <form action="product-new-save-admin.jsp" method="post" enctype="multipart/form-data">
                <div class="form-group">
                    <label>Description</label>
                    <textarea type="text" class="form-control" placeholder="Description..." name="description" autofocus required></textarea>
                </div>
                <div class="form-group">
                    <label>Price</label>
                    <input type="number" class="form-control" placeholder="Price..." name="price" required step="any">
                </div>
                <div class="form-group">
                    <label>Area</label>
                    <input type="number" class="form-control" placeholder="Area..." name="area" required step="any">
                </div>
                <div class="form-group">
                    <div class="form-row">
                        <div class="col">
                            <label>Type</label>
                            <select class="form-control" name="typee" required>
                                <%                                    for (Typee type : types) {

                                %>
                                <option value="<%=type.getIdType()%>"><%=type.getNameType()%></option>
                                <%
                                    }
                                %>
                            </select>
                        </div>
                        <div class="col">
                            <label>District</label>
                            <select class="form-control" name="district" required>
                                <%
                                    for (District dt : dts) {

                                %>
                                <option value="<%=dt.getIdDistrict()%>"><%=dt.getNameDistrict()%></option>
                                <%
                                    }
                                %>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label>Position</label>
                    <input type="text" class="form-control" placeholder="Position..." name="position" required>
                </div>
                <div class="form-group">
                    <label>Shape</label>
                    <input type="text" class="form-control" placeholder="Shape..." name="shape" required>
                </div>
                <div class="form-group">
                    <label>Direction</label>
                    <input type="text" class="form-control" placeholder="Direction..." name="direction" required>
                </div>
                <div class="form-group">
                    <label>Juridical</label>
                    <input type="text" class="form-control" placeholder="Juridical..." name="juridical" required>
                </div>
                <div class="form-group">
                    <label>Right of way</label>
                    <input type="number" class="form-control" placeholder="Right of way..." name="right-of-way" step="any" required>
                </div>
                <div class="form-group">
                    <label>Picture</label><br>
                    <input type="file" name="file1" required multiple="multiple">

                </div>
                <div class="text-center">
                    <input class="btn btn-primary btn-block" type="submit" name="submit" value="Submit">
                </div>
            </form>
        </div>


        <script type="text/javascript">
            document.addEventListener("DOMContentLoaded", function () {

            }, false);
        </script>

    </body>
</html>