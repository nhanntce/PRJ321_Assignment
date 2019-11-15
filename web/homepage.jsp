<%-- 
    Document   : product-client
    Created on : Nov 8, 2019, 5:20:42 PM
    Author     : NhanNT
--%>
<%@page import="ObjectInfo.Image"%>
<%@page import="Model.ImageModel"%>
<%@page import="ObjectInfo.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.ProductModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ProductModel pm = new ProductModel();
    ImageModel im = new ImageModel();
    ArrayList<Product> ninhKieu = pm.getProductByDistrict(1);
    ArrayList<Product> caiRang = pm.getProductByDistrict(3);
    ArrayList<Product> phongDien = pm.getProductByDistrict(4);
    ArrayList<Product> binhThuy = pm.getProductByDistrict(2);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="css\\style2.css">
        <link rel="stylesheet" href="css\\responsive.css">
        <link rel="stylesheet" href="css\\aos.css">
        <title>Real estate</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <link rel="icon" type="image/png" sizes="56x56" href="images/logo/logo.png">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">-->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </head>
    <body>
        <div class="move-top">
            <a href="#"><i class="fa fa-sort-asc"></i></a>
        </div>
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


        <!--- Slinder--->
        <div id="slider">
            <div id="headerSlider" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#headerSlider" data-slide-to="0" class="active"></li>
                    <li data-target="#headerSlider" data-slide-to="1"></li>
                    <li data-target="#headerSlider" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img class="d-block img-fluid" src="images/home/slide-one.jpg" alt="First slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block img-fluid" src="images/home/slide-two.jpg" alt="Second slide">

                    </div>
                    <div class="carousel-item">
                        <img class="d-block img-fluid" src="images/home/slide-four.jpeg" alt="Third slide">

                    </div>
                </div>
                <a class="carousel-control-prev" href="#headerSlider" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#headerSlider" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
        <!--About-->
        <section id="list-product">
            <div class="text-center">
                <h1>Ninh Kieu</h1>
            </div>
            <div class="container">
                <div class="row">
                    <%
                        for (int i = 0; i < 3; i++) {
                            ArrayList<Image> image = im.getImageByIdProduct(ninhKieu.get(i).getIdProduct());
                            String img = image.get(0).getImage();
                    %>
                    <div class="col-md-4">
                        <div class="product-item" data-aos="fade-up">
                            <div class="image-item">
                                <img src="images/products/<%=image.get(0).getImage()%>" alt="aa">
                            </div>

                            <div class="product-info">
                                <div class="link">
                                    <a href="product-detail-client-home.jsp?id=<%=ninhKieu.get(i).getIdProduct()%>" style="color: #000;">The house</a>
                                </div>
                                <span id="p-address"><i class="fa fa-map-marker"></i> <%=ninhKieu.get(i).getPosition()%></span>
                                <h5 id="p-price">Price: <%=ninhKieu.get(i).getPrice()%> <sup>đ</sup></h5>
                                <div id="p-date">
                                    <p><%=ninhKieu.get(i).getPublicTime()%></p>
                                </div>
                            </div>
                        </div>
                    </div>

                    <%
                        }
                    %>
                </div>
            </div>
            <div class="text-center">
                <h1>Cai Rang</h1>
            </div>
            <div class="container">
                <div class="row">

                    <%
                        for (int i = 0; i < 3; i++) {
                            ArrayList<Image> image = im.getImageByIdProduct(caiRang.get(i).getIdProduct());
                            String img = image.get(0).getImage();
                    %>
                    <div class="col-md-4">
                        <div class="product-item" data-aos="fade-down">
                            <div class="image-item">
                                <img src="images/products/<%=image.get(0).getImage()%>" alt="aa">
                            </div>

                            <div class="product-info">
                                <div class="link">
                                    <a href="product-detail-client-home.jsp?id=<%=caiRang.get(i).getIdProduct()%>" style="color: #000;">The house</a>
                                </div>
                                <span id="p-address"><i class="fa fa-map-marker"></i> <%=caiRang.get(i).getPosition()%></span>
                                <h5 id="p-price">Price: <%=caiRang.get(i).getPrice()%> <sup>đ</sup></h5>
                                <div id="p-date">
                                    <p><%=caiRang.get(i).getPublicTime()%></p>
                                </div>
                            </div>
                        </div>
                    </div>

                    <%
                        }
                    %>
                </div>
            </div>

            <div class="text-center">
                <h1>Binh Thuy</h1>
            </div>
            <div class="container">
                <div class="row">
                    <%
                        for (int i = 0; i < 3; i++) {
                            ArrayList<Image> image = im.getImageByIdProduct(binhThuy.get(i).getIdProduct());
                            String img = image.get(0).getImage();
                    %>
                    <div class="col-md-4">
                        <div class="product-item" data-aos="fade-up-right">
                            <div class="image-item">
                                <img src="images/products/<%=image.get(0).getImage()%>" alt="aa">
                            </div>

                            <div class="product-info">
                                <div class="link">
                                    <a href="product-detail-client-home.jsp?id=<%=binhThuy.get(i).getIdProduct()%>" style="color: #000;">The house</a>
                                </div>
                                <span id="p-address"><i class="fa fa-map-marker"></i> <%=binhThuy.get(i).getPosition()%></span>
                                <h5 id="p-price">Price: <%=binhThuy.get(i).getPrice()%> <sup>đ</sup></h5>
                                <div id="p-date">
                                    <p><%=binhThuy.get(i).getPublicTime()%></p>
                                </div>
                            </div>
                        </div>
                    </div>

                    <%
                        }
                    %>
                </div>
            </div>

            <div class="text-center">
                <h1>Phong Dien</h1>
            </div>
            <div class="container">
                <div class="row">

                    <%
                        for (int i = 0; i < 3; i++) {
                            ArrayList<Image> image = im.getImageByIdProduct(phongDien.get(i).getIdProduct());
                            String img = image.get(0).getImage();
                    %>
                    <div class="col-md-4">
                        <div class="product-item" data-aos="fade-up-left">
                            <div class="image-item">
                                <img src="images/products/<%=image.get(0).getImage()%>" alt="aa">
                            </div>

                            <div class="product-info">
                                <div class="link">
                                    <a href="product-detail-client-home.jsp?id=<%=phongDien.get(i).getIdProduct()%>" style="color: #000;">The house</a>
                                </div>
                                <span id="p-address"><i class="fa fa-map-marker"></i> <%=phongDien.get(i).getPosition()%></span>
                                <h5 id="p-price">Price: <%=phongDien.get(i).getPrice()%> <sup>đ</sup></h5>
                                <div id="p-date">
                                    <p><%=phongDien.get(i).getPublicTime()%></p>
                                </div>
                            </div>
                        </div>
                    </div>

                    <%
                        }
                    %>
                </div>
            </div> <!--phon dien-->
        </section>
        <!--    Service-->
        <section id="services">
            <div class="container">
                <h1>How to buy a house</h1>
                <div class="row services">
                    <div class="col-md-3 text-center">
                        <div class="icon">
                            <i class="fa fa-info"></i>
                        </div>
                        <h3>Enter your information</h3>
                        <p>Let's leave your information here. We will contact to you.</p>
                    </div>
                    <div class="col-md-3 text-center">
                        <div class="icon">
                            <i class="fa fa-meetup"></i>
                        </div>
                        <h3>Have a meeting</h3>
                        <p>We have a day to meet to you. Get information, exchange question.</p>
                    </div>
                    <div class="col-md-3 text-center">
                        <div class="icon">
                            <i class="fa fa-money"></i>
                        </div>
                        <h3>Deal</h3>
                        <p>payment and get your own house</p>
                    </div>
                    <div class="col-md-3 text-center">
                        <div class="icon">
                            <i class="fa fa-home"></i>
                        </div>
                        <h3>Stay</h3>
                        <p>After payment, you can stay in your house.</p>
                    </div>
                </div>
            </div>
        </section>
        <!--Team Members-->
        <section id="team">
            <div class="container">
                <h1>Our Team</h1>
                <div class="row">
                    <div class="col-md-3 profile-pic text-center">
                        <div class="img-box" data-aos="fade-up">
                            <img src="images/team/handsomeboy.jpg" class="img-responsive">
                            <ul>
                                <a href="#"><li><i class="fa fa-facebook"></i></li></a>
                                <a href="#"><li><i class="fa fa-twitter"></i></li></a>
                                <a href="#"><li><i class="fa fa-linkedin"></i></li></a>
                            </ul>
                        </div>
                        <h2 data-aos="fade-up">Nguyen Thanh Nhan</h2>
                        <h3 data-aos="fade-up">Fouder / CEO</h3>
                    </div>

                    <div class="col-md-3 profile-pic text-center">
                        <div class="img-box" data-aos="fade-up">
                            <img src="images/team/linh.jpg" class="img-responsive">
                            <ul>
                                <a href="#"><li><i class="fa fa-facebook"></i></li></a>
                                <a href="#"><li><i class="fa fa-twitter"></i></li></a>
                                <a href="#"><li><i class="fa fa-linkedin"></i></li></a>
                            </ul>
                        </div>
                        <h2 data-aos="fade-up">Nguyen Chi Linh</h2>
                        <h3 data-aos="fade-up">Fouder / CEO</h3>
                    </div>

                    <div class="col-md-3 profile-pic text-center">
                        <div class="img-box" data-aos="fade-up">
                            <img src="images/team/hai.jpg" class="img-responsive">
                            <ul>
                                <a href="#"><li><i class="fa fa-facebook"></i></li></a>
                                <a href="#"><li><i class="fa fa-twitter"></i></li></a>
                                <a href="#"><li><i class="fa fa-linkedin"></i></li></a>
                            </ul>
                        </div>
                        <h2 data-aos="fade-up">Mac Truong Hai</h2>
                        <h3 data-aos="fade-up">Fouder / CEO</h3>

                    </div>

                    <div class="col-md-3 profile-pic text-center">
                        <div class="img-box" data-aos="fade-up">
                            <img src="images/team/pig.jpg" class="img-responsive">
                            <ul>
                                <a href="#"><li><i class="fa fa-facebook"></i></li></a>
                                <a href="#"><li><i class="fa fa-twitter"></i></li></a>
                                <a href="#"><li><i class="fa fa-linkedin"></i></li></a>
                            </ul>
                        </div>
                        <h2 data-aos="fade-up">Ma Anh Hoang</h2>
                        <h3 data-aos="fade-up">Fouder / CEO</h3>

                    </div>
                </div>
            </div>
        </section>

        <!--Promo-->
        <section id="promo">
            <div class="container">
                <p data-aos="fade-right">Buy or rent a house</p>
                <a href="#contact" class="btn btn-primary" data-aos="fade-left">Contact Us</a>
            </div>
        </section>




        <!--Get in Touch-->
        <section id="contact">
            <div class="container">
                <h1>Get in Touch</h1>

                <form class="contact-form" name="myForm" id="myForm" onsubmit="return validation()" action="Customer-new-save-home.jsp">
                    <div class="form-group"  data-aos="fade-right">
                        <label>Phone </label>
                        <input type="number" class="form-control" placeholder="Your phone..."  name="cusPhone" id="phone" required>
                        <p id="phoneErr" style="color: #f00;"></p>
                    </div>
                    <div class="form-group" data-aos="fade-left">
                        <label>Name </label>
                        <input type="text" class="form-control" placeholder="Your name..." id="client-name" name="cusName" required>
                        <p id="nameErr"></p>
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
        <!--Footer-->
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
        <!--Footer end-->
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
                //nav

                AOS.init();
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

//                    if (window.pageYOffset >= 300) {
//                        for (var i = 0; i < dictrict.length; i++) {
//                            dictrict[i].classList.add('top');
//                        }
//                    }

                });
                var scroll = new SmoothScroll('a[href*="#"]');
            }, false);
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