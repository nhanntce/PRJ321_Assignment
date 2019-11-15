<%-- 
    Document   : product-edit
    Created on : Nov 6, 2019, 8:59:56 AM
    Author     : NhanNT
--%>

<%@page import="Model.ImageModel"%>
<%@page import="ObjectInfo.Image"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="ObjectInfo.Product"%>
<%@page import="Model.ProductModel"%>
<%@page import="ObjectInfo.District"%>
<%@page import="ObjectInfo.Typee"%>
<%@page import="Model.DistrictsModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.TypesModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //id product
    int idProduct = 1;
    //page
    int p = 1;
    //search 
    String search = "";
    //get id product
    if (request.getParameter("id") != null) {
        idProduct = Integer.parseInt(request.getParameter("id"));
    }
    //get page
    if (request.getParameter("page") != null) {
        p = Integer.parseInt(request.getParameter("page"));
    }
    //get search text
    if (request.getParameter("s") != null) {
        search = request.getParameter("s");
    }
    //load type
    TypesModel tm = new TypesModel();
    //store type
    ArrayList<Typee> types = tm.loadTypes();
    //load District
    DistrictsModel dm = new DistrictsModel();
    //store district
    ArrayList<District> dts = dm.loadDistricts();
    //load product
    ProductModel pm = new ProductModel();
    Product product = pm.getProduct(idProduct);
    String idD = String.valueOf(product.getIdDistrict());
    String idT = String.valueOf(product.getIdType());
    //load image
    ImageModel im = new ImageModel();
    ArrayList<Image> images = im.getImageByIdProduct(idProduct);

    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
    String dateStr = sdf.format(product.getPublicTime());


%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Edit product</title>
        <link rel="icon" type="icon" href="images/logo.png">
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

            .list-image{
                width: 100%;
                height: auto;
                border: 1px solid #ced4da;
                border-radius: 5px;
                padding: 10px 20px;
                margin-bottom: 10px;
            }

            .image-product{
                width: 100%;
                margin: 15px 0;
                height: 200px;
                overflow: hidden;
                /*padding: 10px;*/
                border-radius: 10px;
            }
            img {
                width: 100%;

            }

        </style>
    </head>
    <body>
        <div class="container">
            <div class="text-center title">
                <h2><strong>Edit new product</strong></h2>
            </div>
            <form action="product-edit-save-admin.jsp" method="post" enctype="multipart/form-data">
                <input type="hidden" name="id" value="<%=idProduct%>">
                <input type="hidden" name="search" value="<%=search%>">
                <input type="hidden" name="page" value="<%=p%>">
                <div class="form-group">
                    <label>Description</label>
                    <textarea type="text" class="form-control" name="description" autofocus required><%=product.getDescript()%></textarea>
                </div>
                <div class="form-group">
                    <label>Price</label>
                    <input type="number" class="form-control" placeholder="Price..." name="price" value="<%=product.getPrice()%>" step="any" required>
                </div>
                <div class="form-group">
                    <label>Area</label>
                    <input type="number" class="form-control" placeholder="Area..." value="<%=product.getSquare()%>" name="area" step="any" required>
                </div>
                <div class="form-group">
                    <div class="form-row">
                        <div class="col">
                            <label>Type</label>
                            <select class="form-control" name="type" id="type" required>
                                <option value="<%=product.getIdType()%>"><%=product.getNameType()%></option>
                                <%
                                    for (Typee type : types) {
                                        if (type.getIdType() != product.getIdType()) {
                                %>
                                <option value="<%=type.getIdType()%>"><%=type.getNameType()%></option>
                                <%
                                        }
                                    }
                                %>
                            </select>
                        </div>
                        <div class="col">
                            <label>District</label>
                            <select class="form-control" name="district" id="district" required>
                                <option value="<%=product.getIdDistrict()%>"><%=product.getNameDistrict()%></option>
                                <%
                                    for (District dt : dts) {
                                        if (dt.getIdDistrict() != product.getIdDistrict()) {
                                %>
                                <option value="<%=dt.getIdDistrict()%>"><%=dt.getNameDistrict()%></option>
                                <%
                                        }
                                    }
                                %>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label>Position</label>
                    <input type="text" class="form-control" placeholder="Position..." value="<%=product.getPosition()%>" name="position" required>
                </div>
                <div class="form-group">
                    <label>Shape</label>
                    <input type="text" class="form-control" placeholder="Shape..." value="<%=product.getShape()%>" name="shape" required>
                </div>
                <div class="form-group">
                    <label>Direction</label>
                    <input type="text" class="form-control" placeholder="Direction..." value="<%=product.getDirection()%>" name="direction" required>
                </div>
                <div class="form-group">
                    <label>Juridical</label>
                    <input type="text" class="form-control" placeholder="Juridical..." value="<%=product.getJuridical()%>" name="juridical" required>
                </div>
                <div class="form-group">
                    <label>Right of way</label>
                    <input type="number" class="form-control" placeholder="Right of way..." value="<%=product.getRightOfWay()%>" name="right-of-way" step="any" required>
                </div>
                <div class="form-group">
                    <label>Status</label>
                    <select class="form-control" name="status" required>
                        <%
                            String strValue1 = "Stop business";
                            String strValue2 = "Availible";
                            int value2 = 1;
                            if (product.getStatus() == 1) {
                                value2 = 2;
                                strValue1 = "Availible";
                                strValue2 = "Stop business";
                            }

                        %>
                        <option value="<%=product.getStatus()%>"><%=strValue1%></option>
                        <option value="<%=value2%>"><%=strValue2%></option>
                    </select>
                </div>
                <p>Image</p>
                <div class="list-image">
                    <div class="row">
                        <%
                            for (Image image : images) {


                        %>
                        <div class="col-md-4">
                            <div class="image-product">
                                <img class="img" src="images/products/<%=image.getImage()%>">
                            </div>
                            <div class="text-center">
                                <span onclick="location.href = 'image-delete-admin.jsp?page=<%=p%>&s=<%=search%>&id=<%=idProduct%>&idimg=<%=image.getIdImage()%>'" class="btn btn-danger"><i class="fa fa-trash"></i></span>
                            </div>
                        </div>

                        <%
                            }
                        %>
                    </div>
                </div>
                <div class="form-group">
                    <label>Picture</label>
                    <input type="file" name="file" multiple="multiple">
                </div>
                <div class="form-group">
                    <label>Date posted</label>
                    <input type="text" class="form-control" value="<%=dateStr%>" name="date" required disabled>
                </div>
                <div class="text-center">
                    <input class="btn btn-primary btn-block" type="submit" name="submit" value="Submit">
                </div>
            </form>
        </div>


        <script type="text/javascript">
            
                selectElement("district", "<%=idD%>");
                selectElement("type", "<%=idT%>");
                function selectElement(id, valueToSelect) {
                    let element = document.getElementById(id);
                    element.value = valueToSelect;
                }

          
        </script>

    </body>
</html>
