<%-- 
    Document   : product-edit-save
    Created on : Nov 7, 2019, 10:06:53 PM
    Author     : NhanNT
--%>

<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="java.sql.Date"%>
<%@page import="Model.ImageModel"%>
<%@page import="Model.ProductModel"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    List<FileItem> multiparts = null;
    final String UPLOAD_DIRECTORY = "D:/Java Web/PRJ321_ASM_Group04/web/images/products";
    ProductModel pm = new ProductModel();
    ImageModel im = new ImageModel();
    int idProduct = 1;              // id of product
    int p = 1;
    String search = "";
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
                if (fieldName.equals("id")) {
                    idProduct = Integer.parseInt(fieldValue);
                }
                if (fieldName.equals("search")) {
                    search = fieldValue;
                }
                if (fieldName.equals("page")) {
                    p = Integer.parseInt(fieldValue);
                }
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
                if (fieldName.equals("status")) {
                    status = Integer.parseInt(fieldValue);
                }
            }
        }
        //add new product to DB
        pm.updateProduct(idProduct, descript, price, square, status, idType, idDistrict,
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
                        + File.separator + idProduct + "-edit" + j + pictureName));
                im.addImage(idProduct + "-" + j + pictureName, idProduct);
            }
        }
    }
    response.sendRedirect("product-list-admin.jsp?page=" + p + "&s=" + descript);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
       
    </body>
</html>
