<%-- 
    Document   : product-detail-client
    Created on : Nov 8, 2019, 11:24:56 PM
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
    int p = 1;
    int district = 0;
    int priceFrom = 0;
    int priceTo = 0;
    int areaFrom = 0;
    int areaTo = 0;
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


%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Product</title>
        <link rel="icon" type="icon" href="images/logo.png">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css\\style2.css">
        <link rel="stylesheet" href="css\\aos.css">
        <link rel="stylesheet" href="css\\responsive.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" ></script>
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
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
                    <li class="nav-item">
                        <a class="nav-link" href="homepage.jsp#team">Our team</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="homepage.jsp#contact">Contact</a>
                    </li>

                </ul>
            </div>
        </nav>

        <section id="slide">


            <section id="slide">
                <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                        <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img src="images/home/slide-1-1.jpg" class="d-block w-100" alt="">
                        </div>
                        <div class="carousel-item">
                            <img src="images/home/slide-2.jpg" class="d-block w-100" alt="...">
                        </div>
                        <div class="carousel-item">
                            <img src="images/home/slide-three.jpg" class="d-block w-100" alt="...">
                        </div>
                    </div>
                    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
            </section>


        </section>

        <section id="search">
            <div class="container"  data-aos="fade-up">
                <form onsubmit="return validateForm()" name="myForm" >
                    <div class="form-group">
                        <label for="districts">Districts</label>
                        <div>
                            <select id="districts" name="d" class="form-control">
                                <option value="0">All</option>
                                <option value="1">Ninh Kieu</option>
                                <option value="2">Binh Thuy</option>
                                <option value="3">Cai Rang</option>
                                <option value="4">Phong Dien</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="col">
                            <div class="form-group">
                                <label>Price From</label>
                                <input id="pf" type="number" class="form-control" placeholder="Price..." name="pf"  step="any" value="<%=priceFrom%>">
                                <span id="pf-e"></span>
                            </div>
                        </div>
                        <div class="col">
                            <div class="form-group">
                                <label>Price To</label>
                                <input id="pt" type="number" class="form-control" placeholder="Price..." name="pt"  step="any" value="<%=priceTo%>">
                                <span id="pt-e"></span>
                            </div>
                        </div>
                    </div>

                    <div class="form-row">
                        <div class="col">
                            <div class="form-group">
                                <label>Area From</label>
                                <input id="af" type="number" class="form-control" placeholder="Area..." name="af"  step="any" value="<%=areaFrom%>">
                                <span id="af-e"></span>
                            </div>
                        </div>
                        <div class="col">
                            <div class="form-group">
                                <label>Area To</label>
                                <input id="at" type="number" class="form-control" placeholder="Area..." name="at"  step="any" value="<%=areaTo%>">
                                <span id="at-e"></span>
                            </div>
                        </div>
                    </div>




                    <div class="form-group">
                        <button type="submit" class="btn btn-primary">Search</button>
                    </div>
                </form>
            </div>
        </section>

        <section id="list-product">
            <div class="text-center">
                <h1>List product(<%=pm.getNumberOfProduct(p, priceFrom, priceTo, district, areaFrom, areaTo)%>)</h1>
            </div>
            <div class="container">
                <div class="row">
                    <%
                        for (Product product : products) {
                            ArrayList<Image> imgs = im.getImageByIdProduct(product.getIdProduct());


                    %>

                    <div class="col-md-4">
                        <div class="product-item" data-aos="fade-up">
                            <div class="image-item">
                                <img src="images/products/<%=imgs.get(0).getImage()%>" alt="">
                            </div>

                            <div class="product-info">
                                <div class="link">
                                    <a href="product-detail-client.jsp?page=<%=p%>&d=<%=district%>&pf=<%=priceFrom%>&pt=<%=priceTo%>&af=<%=areaFrom%>&at=<%=areaTo%>&id=<%=product.getIdProduct()%>" style="color: #000;"><%=Tool.reduceStrShorter(product.getDescript())%></a>
                                </div>
                                <span id="p-address"><i class="fa fa-map-marker"></i><%=product.getPosition()%></span>
                                <h5 id="p-price">Price: <%=product.getPrice()%> <sup>đ</sup></h5>
                                <div id="p-date">
                                    <p><%=product.getPublicTime()%></p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <%
                        }
                    %>
                </div>

                <%
                    if (products.size() == 0) {
                        out.println("<h2>No one product</h2>");
                    }
                %>
                <%=pm.getPagingString(p, priceFrom, priceTo, district, areaFrom, areaTo)%>

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
        <script src="js/aos.js"></script>
        <script src="js/smooth-scroll.js"></script>
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

                        selectElement('districts', '<%=district%>');

                        function selectElement(id, valueToSelect) {
                            let element = document.getElementById(id);
                            element.value = valueToSelect;
                        }
                        ;
                        var scroll = new SmoothScroll('a[href*="#"]');

                    }, false);
        </script>
        <script>
            var pf = document.getElementById("pf");
            var pt = document.getElementById("pt");
            var ptE = document.getElementById("pt-e");
            var af = document.getElementById("af");
            var at = document.getElementById("at");
            var atE = document.getElementById("at-e");
            function validateForm() {
                var pfV = pf.value;
                var ptV = pt.value;
                var afV = af.value;
                var atV = at.value;
                console.log(ptE);
                console.log(atE);
                console.log(pfV);
                console.log(ptV);
                console.log(afV);
                console.log(atV);
                if (pfV < 0 || ptV < 0 || afV < 0 || atV < 0 || pfV > ptV || afV > atV) {
                    if (pfV < 0 || ptV < 0) {
                        ptE.innerHTML = "Price can't be smaller than 0!";
                    }
                    if (pfV > ptV) {
                        ptE.innerHTML = "Price from must be smaller than price to!";
                    }
                    if (afV < 0 || atV < 0) {
                        atE.innerHTML = "Area can't be smaller than 0!";
                    }
                    if (afV > atV) {
                        atE.innerHTML = "Area from must be smaller than area to!";
                    }
                    return false;
                }
            }

        </script>
    </body>
</html>