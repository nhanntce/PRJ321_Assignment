<%-- 
   Document   : product-detial-detail-client
   Created on : Nov 11, 2019, 9:42:26 AM
   Author     : NhanNT
--%>

<%@page import="ObjectInfo.Image"%>
<%@page import="MyUltis.Tool"%>
<%@page import="Model.ImageModel"%>
<%@page import="ObjectInfo.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.ProductModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int idProduct = 1;
    int p = 1;
    int district = 0;
    int priceFrom = 0;
    int priceTo = 0;
    int areaFrom = 0;
    int areaTo = 0;
    if (request.getParameter("id") != null) {
        idProduct = Integer.parseInt(request.getParameter("id"));
    }
    if (request.getParameter("page") != null) {
        p = Integer.parseInt(request.getParameter("page"));
    }
    if (request.getParameter("d") != null) {
        district = Integer.parseInt(request.getParameter("d"));
    }
    if (request.getParameter("pf") != null && !request.getParameter("pf").trim().equals("")) {
        priceFrom = Integer.parseInt(request.getParameter("pf"));
    }
    if (request.getParameter("pt") != null && !request.getParameter("pt").trim().equals("")) {
        priceTo = Integer.parseInt(request.getParameter("pt"));
    }
    if (request.getParameter("af") != null && !request.getParameter("af").trim().equals("")) {
        areaFrom = Integer.parseInt(request.getParameter("af"));
    }
    if (request.getParameter("at") != null && !request.getParameter("at").trim().equals("")) {
        areaTo = Integer.parseInt(request.getParameter("at"));
    }

    ProductModel pm = new ProductModel();
    ImageModel im = new ImageModel();
    ArrayList<Product> products = pm.getPaging(p, priceFrom, priceTo, district, areaFrom, areaTo);
    ArrayList<Image> images = im.getImageByIdProduct(idProduct);
    Product product = pm.getProduct(idProduct);
    ArrayList<Product> productSameTypes = pm.getProductByDistrict(product.getIdDistrict());

%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Product</title>
        <link rel="icon" type="icon" href="images/logo.png">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css\\style2.css">
        <link rel="stylesheet" href="css\\responsive.css">
        <link rel="stylesheet" href="css\\aos.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" ></script>
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <style>
            *{
                font-family:  Candara;
            }
            input, select {
                background: #f9f9f9 !important;
            }

            #search {
                padding: 50px 0;
            }

            .col-md-4 {
                margin: 30px 0;
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

            #product-detail {
                padding: 50px 0;
            }

            #my-slide {
                position: relative;
                height: 600px;
                background-image: linear-gradient(rgba(0,0,0,0.3), rgba(0,0,0,0.3)),url(images/product/hero_bg_1.jpg);
                background-attachment: fixed;
                background-size: cover;
                background-position: center;
                color: #fff !important;
            }

            #my-slide h2 {
                position: absolute;
                top: 40%;
                left: 50%;
                color: #fff;
                font-size: 56px !important;
                transform: translateX(-50%);
            }
        </style>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light nav-bg" id="nav">
            <a class="navbar-brand" href="#"><img id="logo" src="images/logo/logo.png" alt=""></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <i class="fa fa-bars"></i>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="homepage.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="product-list-client.jsp">Product</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="homepage.jsp#team">Our team</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="homepage.jsp#services">Services</a>
                    </li>
                    <!--                    <li class="nav-item">
                                            <a class="nav-link" href="homepage.jsp#team">Our team</a>
                                        </li>-->
                    <li class="nav-item">
                        <a class="nav-link" href="homepage.jsp#contact">Contact</a>
                    </li>

                </ul>
            </div>
        </nav>

        <section id="my-slide">
            <h2 data-aos="fade-up">Product detail</h2>

        </section>

        <section id="product-detail">
            <div class="container" style="position: relative;">
                <div class="image-list">
                    <div class="container-1">
                        <div class="image-big">
                            <%                            for (Image image : images) {

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
                                for (Image image : images) {
                                    ++imgCurrent;

                            %>
                            <div class="column">
                                <img class="demo cursor" src="images/products/<%=image.getImage()%>" style="width:100%" onclick="currentSlide(<%=imgCurrent%>)">
                            </div>
                            <%
                                }
                            %>

                        </div>
                    </div>
                </div>

                <h2 style="color: #7cbd1e; padding-top: 30px;">Information</h2>
                <div class="row">

                    <div class="col-md-6"  data-aos="fade-up">
                        <p style="color: #005165; font-size: 18px;">- <%=product.getDescript()%></p>
                        <p style="color: #3400ff; font-size: 24px;">- Price: <%=product.getPrice()%> <sup>đ</sup></p>
                        <p>- Area: <%=product.getSquare()%>m</p>
                        <p>- Type: <%=product.getNameType()%></p>
                        <p>- District: <%=product.getNameDistrict()%></p>
                    </div>
                    <div class="col-md-6" data-aos="fade-up">
                        <p>- Position: <%=product.getPosition()%></p>
                        <p>- Shape: <%=product.getShape()%></p>
                        <p>- Direction: <%=product.getDirection()%></p>
                        <p>- Juridical: <%=product.getJuridical()%></p>
                        <p>- Right of way: <%=product.getRightOfWay()%>m</p>
                    </div>
                </div>
                <a href="#contact" class="btn btn-primary">More information</a>

            </div>
        </section>
        <hr>
        <section id="product-same-type">
            <div class="container">
                <div><h2 style="color: #7cbd1e;">Product the same district</h2></div>
                <div class="row">
                    <%
                        int numPro = 3;
                        for (int i = 0; i < numPro; i++) {
                            if (idProduct == productSameTypes.get(i).getIdProduct()) {
                                numPro++;

                            } else {
                                ArrayList<Image> imgST = im.getImageByIdProduct(productSameTypes.get(i).getIdProduct());

                    %>
                    <div class="col-md-4">
                        <div class="product-item" data-aos="fade-left">
                            <div class="image-item">
                                <img src="images/products/<%=imgST.get(0).getImage()%>" alt="">
                            </div>

                            <div class="product-info">
                                <div class="link">
                                    <a href="product-detail-detail-client.jsp?page=<%=p%>&d=<%=district%>&pf=<%=priceFrom%>&pt=<%=priceTo%>&af=<%=areaFrom%>&at=<%=areaTo%>&id=<%=productSameTypes.get(i).getIdProduct()%>" style="color: #000;"><%=Tool.reduceStrShorter(product.getDescript())%></a>
                                </div>
                                <span id="p-address"><i class="fa fa-map-marker"></i><%=productSameTypes.get(i).getPosition()%></span>
                                <h5 id="p-price">Price: <%=productSameTypes.get(i).getPrice()%> <sup>đ</sup></h5>
                                <div id="p-date">
                                    <p><%=productSameTypes.get(i).getPublicTime()%></p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <%
                            }
                        }

                    %>
                </div>
            </div>
        </section>
        <!--Get in Touch-->
        <section id="contact">
            <div class="container">
                <h1>Get in Touch</h1>

                <form class="contact-form" name="myForm" id="myForm" onsubmit="return validation()" action="Customer-new-save.jsp?page=<%=p%>&d=<%=district%>&pf=<%=priceFrom%>&pt=<%=priceTo%>&af=<%=areaFrom%>&at=<%=areaTo%>&id=<%=product.getIdProduct()%>">
                    <div class="form-group"  data-aos="fade-right">
                        <label>Phone </label>
                        <input type="number" class="form-control" placeholder="Your phone..."  name="cusPhone" id="phone" required>
                        <p id="phoneErr"></p>
                    </div>
                    <div class="form-group" data-aos="fade-left">
                        <label>Name </label>
                        <input type="text" class="form-control" placeholder="Your name..." id="client-name" name="cusName" required>
                        <p id="nameErr" style="color: #f00;"></p>
                    </div>

                    <div class="form-group" data-aos="fade-right">
                        <label>Email </label>
                        <input type="email" class="form-control" placeholder="Email..." id="email" name="cusMail" required>
                        <p id="emailErr" style="color: #f00;"></p>
                    </div>

                   <div class="form-group">
                        <label for="cusBirth">BirthDay :</label>
                       
                       
                        <input type="date" id="cusBirth" class="form-control" name="cusBirth" required>
     
                       
                    </div>
                    <div class="form-group">
                        <label >Gender* :</label> 
                        <div>
                            <input type="radio" id="male" name="cusGender" value="1" checked> Male<br>
                            <input type="radio" id="female" name="cusGender" value="2"> Female<br>
                        </div>  
                    </div> 
                    <button type="submit" class="btn btn-primary">SEND MESSAGE</button>
                </form>
            </div>

        </section>
        <!-- footer -->
        <section id="footer">
            <div class="container">
                <div class="row">
                    <div class="col-md-6">
                        <p data-aos="fade-up">Địa chỉ: 600, đường Nguyễn Văn Cừ (nối dài), phường An Bình,<br> quận Ninh Kiều, TP. Cần Thơ</p>
                        <p data-aos="fade-up">Hotline: 0965689616</p>
                        <p data-aos="fade-up">Zalo: 0965689616</p>
                        <p data-aos="fade-up">Facebook: 0965689616</p>
                    </div>
                    <div class="col-md-6">
                        <h4 data-aos="fade-up">Contact with us</h4>
                        <i class="fa fa-facebook" data-aos="fade-up"></i>
                        <i class="fa fa-instagram" data-aos="fade-up"></i>
                        <i class="fa fa-skype" data-aos="fade-up"></i>
                        <i class="fa fa-youtube" data-aos="fade-up"></i>
                        <i class="fa fa-linkedin" data-aos="fade-up"></i>
                    </div>
                </div>
            </div>
        </section>
        <div class="design-by text-center">
            <p>Designed by <span><a href="https://www.facebook.com/thanhnhan2102">Across Border</a></span></p>
        </div>
        <script src="js/smooth-scroll.js"></script>
        <script src="js/aos.js"></script>
        <script>
                    function validation() {
                        var phone = document.getElementById("phone");
                        var name = document.getElementById("client-name");
                        var email = document.getElementById("email");
                        console.log(phone);
                        console.log(email);
                        var phoneErr = document.getElementById("phoneErr");
                        var nameErr = document.getElementById("nameErr");
                        var emailErr = document.getElementById("emailErr");
                        var phoneCheck = /((09|03|07|08|05)+[0-9]{8})$/i.test(phone.value);
                        var emailCheck = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/i.test(email.value);
                        console.log(phoneCheck);
                        console.log(emailCheck);

                        if (!phoneCheck || !emailCheck) {
                            if (!phoneCheck)
                                phoneErr.innerHTML = "Phone invalid!";
                            if (!emailCheck)
                                emailErr.innerHTML = "Mail invalid!";
                            return false;
                        }
                    }
        </script>
        <script>

            document.addEventListener("DOMContentLoaded", function () {
                AOS.init();
                //nav
                var nav = document.querySelector('nav');
                var logo = document.getElementById('logo');
                var onTop = true;
                var dictrict = document.getElementsByClassName('dictrict');
                window.addEventListener("scroll", function () {
                    if (window.pageYOffset > 500) {
                        if (onTop) {
                            nav.classList.add('navbar-top');
                            nav.classList.add('nav-bg-change');
                            logo.classList.add('logo');
                            onTop = false;
                        }
                    }

                    if (window.pageYOffset <= 500) {
                        if (!onTop) {
                            nav.classList.remove('navbar-top');
                            nav.classList.remove('nav-bg-change');
                            logo.classList.remove('logo');
                            onTop = true;
                        }
                    }
                });

            }, false);
        </script>
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
        <script>
            $("#phone").blur(function () {
                var phone = $('#phone').val();
                $.ajax({
                    url: "check-client-exists.jsp",
                    type: 'POST',
                    data: {phone: phone},
                    success: function (data) {
                        if (data !== "") {
                            var dataList = data.split(",");
                            document.getElementById("client-name").value = dataList[0];
                            document.getElementById("email").value = dataList[1];
                            document.getElementById("cusBirth").value = dataList[2];
                            if (dataList[3] === 1)
                                document.getElementById("male").checked = true;
                            else {
                                document.getElementById("male").checked = false;
                                document.getElementById("female").checked = true;
                            }
                        }
//                        var dataList = data.split(",");  

                        console.log(data);
                    }
                });
            });
        </script>

    </body>
</html>
