<%-- 
    Document   : delete-image-admin
    Created on : Nov 6, 2019, 10:20:02 AM
    Author     : NhanNT
--%>

<%@page import="java.io.File"%>
<%@page import="ObjectInfo.Image"%>
<%@page import="Model.ImageModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //path that stores images
    final String UPLOAD_DIRECTORY = "D:/Java Web/PRJ321_ASM_Group04/web/images/products";
    int idImage = 1;
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
    if(request.getParameter("idimg") != null){
        idImage = Integer.parseInt(request.getParameter("idimg"));
    }
    ImageModel im = new ImageModel();
    Image image = im.getImageById(idImage);
    String path = UPLOAD_DIRECTORY + "/" + image.getImage();
    File f = new File(path);
    im.deleteImage(idImage);
    if(f.exists())
        f.delete();
    
//    back to product edit page
    response.sendRedirect("product-edit-admin.jsp?page=" + p + "&s=" + search + "&id=" + idProduct);
    
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%=path%></h1>
    </body>
</html>


