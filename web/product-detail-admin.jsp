<%-- 
    Document   : product-detail-admin
    Created on : Nov 6, 2019, 4:07:47 PM
    Author     : NhanNT
--%>

<%@page import="ObjectInfo.Image"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.ImageModel"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="ObjectInfo.Product"%>
<%@page import="Model.ProductModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int p = 1;
    String search = "";
    int idProduct = 1;
    if(request.getParameter("page") != null){
        p = Integer.parseInt(request.getParameter("page"));
    }
    if(request.getParameter("s") != null){
        search = request.getParameter("s");
    }
    if(request.getParameter("id") != null){
        idProduct = Integer.parseInt(request.getParameter("id"));
    }
    
    ProductModel pm = new ProductModel();
    Product product = pm.getProduct(idProduct);
    SimpleDateFormat sdf = new SimpleDateFormat("hh:MM:ss dd/MM/yyyy");
    ImageModel im = new ImageModel();
    ArrayList<Image> images = im.getImageByIdProduct(idProduct);
    int numberOfImage = images.size();
    String dateStr = sdf.format(product.getPublicTime());
    
    String status = product.getStatus() == 2 ? "Sold" : "Available";
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Product detail</title>
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

            /* Position the image container (needed to position the left and right arrows) */
            .container-1 {
                position: relative;
            }
            /* Hide the images by default */
            .mySlides {
                display: none;
                width: 100%;
                height: 500px;
                overflow: hidden;
                text-align: center;
            }
            .mySlides img {
                height: 100%;
                width: auto;                
            }
            /* Add a pointer when hovering over the thumbnail images */
            .cursor {
                cursor: pointer;
            }
            /* Next & previous buttons */
            .prev,
            .next {
                cursor: pointer;
                position: absolute;
                top: 46%;
                width: auto;
                padding: 16px;
                margin-top: -50px;
                color: white;
                font-weight: bold;
                font-size: 20px;
                border-radius: 0 3px 3px 0;
                user-select: none;
                -webkit-user-select: none;
            }
            /* Position the "next button" to the right */
            .next {
                right: 0;
                border-radius: 3px 0 0 3px;
            }
            /* On hover, add a black background color with a little bit see-through */
            .prev:hover span ,
            .next:hover span {
                color: #fff;
            }
            .prev:hover,
            .next:hover {
                background-color: rgba(0, 0, 0, 0.8);
                color: #fff;
            }
            /* Number text (1/3 etc) */
            .numbertext {
                color: #f2f2f2;
                font-size: 12px;
                padding: 8px 12px;
                position: absolute;
                top: 0;
            }
            /* Container for image text */
            .caption-container {
                text-align: center;
                background-color: #222;
                padding: 2px 16px;
                color: white;
            }
            .row-image {
                left: 20px;
            }
            .row-image:after {
                content: "";
                display: table;
                clear: both;
            }
            /* Six columns side by side */
            .column {
                float: left;
                width: 10%;
                height: 60px;
                overflow: hidden;
                margin-right: 10px;
            }
            .column img{
                width: 100%;
                height: auto;
            }
            /* Add a transparency effect for thumnbail images */
            .demo {
                opacity: 0.6;
            }
            .active,
            .demo:hover {
                opacity: 1;
            }
            .descript {
                width: 100%;
                padding: 30px;
                height: auto;
                border: 1px solid #ddd;
            }
            .image-list {
                width: 100%;
                padding: 10px;
                height: auto;
                border: 1px solid #ddd;
            }

            .image-big {
                width: 100%;
                border: 1px solid #ddd;
                margin-bottom: 30px;
            }

            .title-con {
                margin: 10px 0;
                color: #37a344;
            }
            
            .back {
                margin-top: 30px; 
            }
        </style>
    </head>
    <body>
        <div class="container">
            <div class="text-center">
                <div class="title">
                    <h2><strong>Product detail</strong></h2>
                </div>
            </div>
            <div class="title-con">
                <h3>Detail information</h3>
            </div>
            <div class="descript">
                <p>- <%=product.getDescript()%></p>
                <p>Price: <%=product.getPrice()%></p>
                <p>Area: <%=product.getSquare()%>m</p>
                <p>Type: <%=product.getNameType()%></p>
                <p>District: <%=product.getNameDistrict()%></p>
                <p>Position: <%=product.getPosition()%></p>
                <p>Shape: <%=product.getShape()%></p>
                <p>Direction: <%=product.getDirection()%></p>
                <p>Juridical: <%=product.getJuridical()%></p>
                <p>Right of way: <%=product.getRightOfWay()%>m</p>
                <p>Public time: <%=dateStr%></p>
                <p>Status: <%=status%></p>
            </div>
            <div class="title-con">
                <h3>Image (<%=numberOfImage%>)</h3>
            </div>
            <div class="image-list">
                <div class="container-1">
                    <div class="image-big">
                        <%
                            for(Image image : images){
                                
                        %>
                        <div class="mySlides">
                            <img src="images/products/<%=image.getImage()%>">
                        </div>
                        <%
                            }
                        %>
                    </div>

                    <span class="prev" onclick="plusSlides(-1)">❮</span>
                    <span class="next" onclick="plusSlides(1)">❯</span>

                    <div class="row-image">
                        <%
                            int imgCurrent = 0;
                            for(Image image : images){
                                ++imgCurrent;
                                
                        %>
                        <div class="column">
                            <img class="demo cursor" src="images/products/<%=image.getImage()%>" style="width:100%" onclick="currentSlide(<%=imgCurrent%>)">
                        </div>
                        <%
                            }
                        %>
                        
<!--                        <div class="column">
                            <img class="demo cursor" src="images/district/phongdien.jpg" style="width:100%" onclick="currentSlide(2)" alt="Cinque Terre">
                        </div>
                        <div class="column">
                            <img class="demo cursor" src="images/district/binhthuy.jpg" style="width:100%" onclick="currentSlide(3)" alt="Mountains and fjords">
                        </div>
                        <div class="column">
                            <img class="demo cursor" src="images/district/cairang.jpg" style="width:100%" onclick="currentSlide(4)" alt="Northern Lights">
                        </div>
                        <div class="column">
                            <img class="demo cursor" src="images/district/binhthuy.jpg" style="width:100%" onclick="currentSlide(5)" alt="Nature and sunrise">
                        </div>
                        <div class="column">
                            <img class="demo cursor" src="images/district/binhthuy.jpg" style="width:100%" onclick="currentSlide(6)" alt="Snowy Mountains">
                        </div>-->
                    </div>
                </div>
            </div>
                        <div class="back">
                            <a href="product-list-admin.jsp?page=<%=p%>&s=<%=search%>" class="btn btn-primary"><i class="fa fa-chevron-left"></i></a>
                        </div>
        </div>
                        
        <script>
            var slideIndex = 1;
            showSlides(slideIndex);
            function plusSlides(n) {
                showSlides(slideIndex += n);
            }
            function currentSlide(n) {
                showSlides(slideIndex = n);
            }
            function showSlides(n) {
                var i;
                var slides = document.getElementsByClassName("mySlides");
                var dots = document.getElementsByClassName("demo");
                var captionText = document.getElementById("caption");
                if (n > slides.length) {
                    slideIndex = 1;
                }
                if (n < 1) {
                    slideIndex = slides.length;
                }
                for (i = 0; i < slides.length; i++) {
                    slides[i].style.display = "none";
                }
                for (i = 0; i < dots.length; i++) {
                    dots[i].className = dots[i].className.replace(" active", "");
                }
                slides[slideIndex - 1].style.display = " block";
                dots[slideIndex - 1].className += " active";
            }
        </script>

    </body>
</html>