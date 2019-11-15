<%-- 
    Document   : product-new-save-admin
    Created on : Nov 7, 2019, 3:21:32 PM
    Author     : NhanNT
--%>

<%@page import="Model.ImageModel"%>
<%@page import="Model.ProductModel"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    List<FileItem> multiparts = null;
    final String UPLOAD_DIRECTORY = "D:/Java Web/PRJ321_ASM_Group04/web/images/products";
    ProductModel pm = new ProductModel();
    ImageModel im = new ImageModel();
    int idProduct;              // id of product
    String descript = "";       //descript product
    long price = 1;             //price of product
    double square = 1;          //square of product
    int status = 1;             //status of product
    int idType = 1;             //foreign key type 
    int idDistrict = 1;         //foreign key district
    String position = "";
    String shape = "";
    String direction = "";
    String juridical = "";
    double rightOfWay = 1;
    int size = 1;
    Date publicTime = new Date(System.currentTimeMillis());
    if (ServletFileUpload.isMultipartContent(request)) {
        multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
        for (int i = 0; i < multiparts.size(); i++) {
            //check if item is a file
            if (multiparts.get(i).isFormField()) {
                String fieldName = multiparts.get(i).getFieldName();
                String fieldValue = multiparts.get(i).getString();
                if (fieldName.equals("description")) {
                    descript = fieldValue;
                }
                if (fieldName.equals("price")) {
                    price = Long.parseLong(fieldValue);
                }
                if (fieldName.equals("area")) {
                    square = Double.parseDouble(fieldValue);
                }
                if (fieldName.equals("typee")) {
                    idType = Integer.parseInt(fieldValue);
                }
                if (fieldName.equals("district")) {
                    idDistrict = Integer.parseInt(fieldValue);
                }
                if (fieldName.equals("position")) {
                    position = fieldValue;
                }
                if (fieldName.equals("shape")) {
                    shape = fieldValue;
                }
                if (fieldName.equals("direction")) {
                    direction = fieldValue;
                }
                if (fieldName.equals("juridical")) {
                    juridical = fieldValue;
                }
                if (fieldName.equals("right-of-way")) {
                    rightOfWay = Double.parseDouble(fieldValue);
                }
            }
        }
        //add new product to DB
        idProduct = pm.addProduct(descript, price, square, status, idType, idDistrict,
                position, shape, direction, juridical, rightOfWay, publicTime);
        int j = 0;
        for (int i = 0; i < multiparts.size(); i++) {
            ++j;
            //check if item is a file
            if (!multiparts.get(i).isFormField()) {
//                String fileName = item.getName();
                String root = getServletContext().getRealPath("/");
                File path = new File(root + "/images/products");
                String pictureName = new File(multiparts.get(i).getName()).getName();
                multiparts.get(i).write(new File(path
                        + File.separator + idProduct + "-" + j + pictureName));
                im.addImage(idProduct + "-" + j + pictureName, idProduct);
            }
        }
    }
    int numberOfProduct = pm.getNumberOfProduct(1, "", "");
    int returnPage = (int) Math.ceil((float) numberOfProduct / 5);
    response.sendRedirect("product-list-admin.jsp?page=" + returnPage);
%>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Login</title>
        <link rel="icon" type="icon" href="images/logo.png">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
        <style type="text/css">
            *{
                font-family:  Candara;
            }
            .container {
                padding: 50px 0 !important;
            }

            .hidden {
                display: none;
            }
            input.file-show {
                display: block;
                margin: 5px;
            }
        </style>
    </head>
    <body>

        <h2><%=descript%></h2>       
        <h2><%=price%></h2>       
        <h2><%=square%></h2>       
        <h2><%=status%></h2>       
        <h2><%=idType%></h2>       
        <h2><%=idDistrict%></h2>       
        <h2><%=position%></h2>       
        <h2><%=shape%></h2>     
        <h2><%=direction%></h2>     
        <h2><%=juridical%></h2>     
        <h2><%=rightOfWay%></h2>     
        <h2><%=publicTime%></h2>     


    </body>
</html>
