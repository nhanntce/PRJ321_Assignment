package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ObjectInfo.Image;
import MyUltis.Tool;
import Model.ImageModel;
import ObjectInfo.Product;
import java.util.ArrayList;
import Model.ProductModel;

public final class product_002ddetail_002ddetail_002dclient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

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


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Product</title>\n");
      out.write("        <link rel=\"icon\" type=\"icon\" href=\"images/logo.png\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css\\\\style2.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css\\\\responsive.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css\\\\aos.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" ></script>\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                font-family:  Candara;\n");
      out.write("            }\n");
      out.write("            input, select {\n");
      out.write("                background: #f9f9f9 !important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #search {\n");
      out.write("                padding: 50px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .col-md-4 {\n");
      out.write("                margin: 30px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Position the image container (needed to position the left and right arrows) */\n");
      out.write("            .container-1 {\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            /* Hide the images by default */\n");
      out.write("            .mySlides {\n");
      out.write("                display: none;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 500px;\n");
      out.write("                overflow: hidden;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .mySlides img {\n");
      out.write("                height: 100%;\n");
      out.write("                width: auto;                \n");
      out.write("            }\n");
      out.write("            /* Add a pointer when hovering over the thumbnail images */\n");
      out.write("            .cursor {\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            /* Next & previous buttons */\n");
      out.write("            .prev,\n");
      out.write("            .next {\n");
      out.write("                cursor: pointer;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 46%;\n");
      out.write("                width: auto;\n");
      out.write("                padding: 16px;\n");
      out.write("                margin-top: -50px;\n");
      out.write("                color: white;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-size: 20px;\n");
      out.write("                border-radius: 0 3px 3px 0;\n");
      out.write("                user-select: none;\n");
      out.write("                -webkit-user-select: none;\n");
      out.write("            }\n");
      out.write("            /* Position the \"next button\" to the right */\n");
      out.write("            .next {\n");
      out.write("                right: 0;\n");
      out.write("                border-radius: 3px 0 0 3px;\n");
      out.write("            }\n");
      out.write("            /* On hover, add a black background color with a little bit see-through */\n");
      out.write("            .prev:hover span ,\n");
      out.write("            .next:hover span {\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("            .prev:hover,\n");
      out.write("            .next:hover {\n");
      out.write("                background-color: rgba(0, 0, 0, 0.8);\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("            /* Number text (1/3 etc) */\n");
      out.write("            .numbertext {\n");
      out.write("                color: #f2f2f2;\n");
      out.write("                font-size: 12px;\n");
      out.write("                padding: 8px 12px;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0;\n");
      out.write("            }\n");
      out.write("            /* Container for image text */\n");
      out.write("            .caption-container {\n");
      out.write("                text-align: center;\n");
      out.write("                background-color: #222;\n");
      out.write("                padding: 2px 16px;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .row-image {\n");
      out.write("                left: 20px;\n");
      out.write("            }\n");
      out.write("            .row-image:after {\n");
      out.write("                content: \"\";\n");
      out.write("                display: table;\n");
      out.write("                clear: both;\n");
      out.write("            }\n");
      out.write("            /* Six columns side by side */\n");
      out.write("            .column {\n");
      out.write("                float: left;\n");
      out.write("                width: 10%;\n");
      out.write("                height: 60px;\n");
      out.write("                overflow: hidden;\n");
      out.write("                margin-right: 10px;\n");
      out.write("            }\n");
      out.write("            .column img{\n");
      out.write("                width: 100%;\n");
      out.write("                height: auto;\n");
      out.write("            }\n");
      out.write("            /* Add a transparency effect for thumnbail images */\n");
      out.write("            .demo {\n");
      out.write("                opacity: 0.6;\n");
      out.write("            }\n");
      out.write("            .active,\n");
      out.write("            .demo:hover {\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("            .descript {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 30px;\n");
      out.write("                height: auto;\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("            }\n");
      out.write("            .image-list {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 10px;\n");
      out.write("                height: auto;\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .image-big {\n");
      out.write("                width: 100%;\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .title-con {\n");
      out.write("                margin: 10px 0;\n");
      out.write("                color: #37a344;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .back {\n");
      out.write("                margin-top: 30px; \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #product-detail {\n");
      out.write("                padding: 50px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #my-slide {\n");
      out.write("                position: relative;\n");
      out.write("                height: 600px;\n");
      out.write("                background-image: linear-gradient(rgba(0,0,0,0.3), rgba(0,0,0,0.3)),url(images/product/hero_bg_1.jpg);\n");
      out.write("                background-attachment: fixed;\n");
      out.write("                background-size: cover;\n");
      out.write("                background-position: center;\n");
      out.write("                color: #fff !important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #my-slide h2 {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 40%;\n");
      out.write("                left: 50%;\n");
      out.write("                color: #fff;\n");
      out.write("                font-size: 56px !important;\n");
      out.write("                transform: translateX(-50%);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light nav-bg\" id=\"nav\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\"><img id=\"logo\" src=\"images/logo/logo.png\" alt=\"\"></a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <i class=\"fa fa-bars\"></i>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"homepage.jsp\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"product-list-client.jsp\">Product</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"homepage.jsp#team\">Our team</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"homepage.jsp#services\">Services</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"homepage.jsp#team\">Our team</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"homepage.jsp#contact\">Contact</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <section id=\"my-slide\">\n");
      out.write("            <h2 data-aos=\"fade-up\">Product detail</h2>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section id=\"product-detail\">\n");
      out.write("            <div class=\"container\" style=\"position: relative;\">\n");
      out.write("                <div class=\"image-list\">\n");
      out.write("                    <div class=\"container-1\">\n");
      out.write("                        <div class=\"image-big\">\n");
      out.write("                            ");
                            for (Image image : images) {

                            
      out.write("\n");
      out.write("                            <div class=\"mySlides\">\n");
      out.write("                                <img src=\"images/products/");
      out.print(image.getImage());
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <span class=\"prev\" onclick=\"plusSlides(-1)\">❮</span>\n");
      out.write("                        <span class=\"next\" onclick=\"plusSlides(1)\">❯</span>\n");
      out.write("\n");
      out.write("                        <div class=\"row-image\">\n");
      out.write("                            ");

                                int imgCurrent = 0;
                                for (Image image : images) {
                                    ++imgCurrent;

                            
      out.write("\n");
      out.write("                            <div class=\"column\">\n");
      out.write("                                <img class=\"demo cursor\" src=\"images/products/");
      out.print(image.getImage());
      out.write("\" style=\"width:100%\" onclick=\"currentSlide(");
      out.print(imgCurrent);
      out.write(")\">\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <h2 style=\"color: #7cbd1e; padding-top: 30px;\">Information</h2>\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-6\"  data-aos=\"fade-up\">\n");
      out.write("                        <p style=\"color: #005165; font-size: 18px;\">- ");
      out.print(product.getDescript());
      out.write("</p>\n");
      out.write("                        <p style=\"color: #3400ff; font-size: 24px;\">- Price: ");
      out.print(product.getPrice());
      out.write("</p>\n");
      out.write("                        <p>- Area: ");
      out.print(product.getSquare());
      out.write("m</p>\n");
      out.write("                        <p>- Type: ");
      out.print(product.getNameType());
      out.write("</p>\n");
      out.write("                        <p>- District: ");
      out.print(product.getNameDistrict());
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\" data-aos=\"fade-up\">\n");
      out.write("                        <p>- Position: ");
      out.print(product.getPosition());
      out.write("</p>\n");
      out.write("                        <p>- Shape: ");
      out.print(product.getShape());
      out.write("</p>\n");
      out.write("                        <p>- Direction: ");
      out.print(product.getDirection());
      out.write("</p>\n");
      out.write("                        <p>- Juridical: ");
      out.print(product.getJuridical());
      out.write("</p>\n");
      out.write("                        <p>- Right of way: ");
      out.print(product.getRightOfWay());
      out.write("m</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a href=\"#contact\" class=\"btn btn-primary\">More information</a>\n");
      out.write("                <a href=\"product-detail-client.jsp?page=");
      out.print(p);
      out.write("&d=");
      out.print(district);
      out.write("&pf=");
      out.print(priceFrom);
      out.write("&pt=");
      out.print(priceTo);
      out.write("&af=");
      out.print(areaFrom);
      out.write("&at=");
      out.print(areaTo);
      out.write("&id=");
      out.print(product.getIdProduct());
      out.write("\" class=\"btn btn-primary\" style=\"position: absolute; bottom: 0; right: 30px;\"><i class=\"fa fa-arrow-left text-white\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <hr>\n");
      out.write("        <section id=\"product-same-type\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div><h2 style=\"color: #7cbd1e;\">Product the same district</h2></div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    ");

                        int numPro = 3;
                        for (int i = 0; i < numPro; i++) {
                            if (idProduct == productSameTypes.get(i).getIdProduct()) {
                                numPro++;

                            } else {
                                ArrayList<Image> imgST = im.getImageByIdProduct(productSameTypes.get(i).getIdProduct());

                    
      out.write("\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"product-item\" data-aos=\"fade-left\">\n");
      out.write("                            <div class=\"image-item\">\n");
      out.write("                                <img src=\"images/products/");
      out.print(imgST.get(0).getImage());
      out.write("\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"product-info\">\n");
      out.write("                                <div class=\"link\">\n");
      out.write("                                    <a href=\"product-detail-client.jsp?page=");
      out.print(p);
      out.write("&d=");
      out.print(district);
      out.write("&pf=");
      out.print(priceFrom);
      out.write("&pt=");
      out.print(priceTo);
      out.write("&af=");
      out.print(areaFrom);
      out.write("&at=");
      out.print(areaTo);
      out.write("&id=");
      out.print(product.getIdProduct());
      out.write("\" style=\"color: #000;\">");
      out.print(Tool.reduceStrShorter(product.getDescript()));
      out.write("</a>\n");
      out.write("                                </div>\n");
      out.write("                                <span id=\"p-address\"><i class=\"fa fa-map-marker\"></i>");
      out.print(productSameTypes.get(i).getPosition());
      out.write("</span>\n");
      out.write("                                <h5 id=\"p-price\">Price: ");
      out.print(productSameTypes.get(i).getPrice());
      out.write(" million</h5>\n");
      out.write("                                <div id=\"p-date\">\n");
      out.write("                                    <p>");
      out.print(productSameTypes.get(i).getPublicTime());
      out.write("</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");

                            }
                        }

                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!--Get in Touch-->\n");
      out.write("        <section id=\"contact\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1>Get in Touch</h1>\n");
      out.write("\n");
      out.write("                <form class=\"contact-form\" name=\"myForm\" id=\"myForm\" onsubmit=\"return validation()\" action=\"Customer-new-save.jsp?page=");
      out.print(p);
      out.write("&d=");
      out.print(district);
      out.write("&pf=");
      out.print(priceFrom);
      out.write("&pt=");
      out.print(priceTo);
      out.write("&af=");
      out.print(areaFrom);
      out.write("&at=");
      out.print(areaTo);
      out.write("&id=");
      out.print(product.getIdProduct());
      out.write("\">\n");
      out.write("                    <div class=\"form-group\"  data-aos=\"fade-right\">\n");
      out.write("                        <label>Phone </label>\n");
      out.write("                        <input type=\"number\" class=\"form-control\" placeholder=\"Your phone...\"  name=\"cusPhone\" id=\"phone\" required>\n");
      out.write("                        <p id=\"phoneErr\"></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\" data-aos=\"fade-left\">\n");
      out.write("                        <label>Name </label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Your name...\" id=\"client-name\" name=\"cusName\" required>\n");
      out.write("                        <p id=\"nameErr\"></p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\" data-aos=\"fade-right\">\n");
      out.write("                        <label>Email </label>\n");
      out.write("                        <input type=\"email\" class=\"form-control\" placeholder=\"Email...\" id=\"email\" name=\"cusMail\" required>\n");
      out.write("                        <p id=\"emailErr\"></p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"cusBirth\">BirthDay :</label>\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <div class=\"col-1\">\n");
      out.write("                                <select id=\"cusDayofBirth\" name=\"cusDayofBirth\" class=\"custom-select\">\n");
      out.write("                                    ");
                                    for (int i = 1; i <= 31; i++) {
                                    
      out.write("\n");
      out.write("                                    <option value=");
      out.print(i);
      out.write('>');
      out.print(i);
      out.write("</option>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-1\">\n");
      out.write("                                <select id=\"cusMonthofBirth\" name=\"cusMonthofBirth\" class=\"custom-select\">\n");
      out.write("                                    ");

                                        for (int i = 1; i <= 12; i++) {
                                    
      out.write("\n");
      out.write("                                    <option value=");
      out.print(i);
      out.write('>');
      out.print(i);
      out.write("</option>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-2\">\n");
      out.write("                                <select id=\"cusYearofBirth\" name=\"cusYearofBirth\" class=\"custom-select\">\n");
      out.write("                                    ");

                                        for (int i = 1900; i <= 2019; i++) {
                                    
      out.write("\n");
      out.write("                                    <option value=");
      out.print(i);
      out.write('>');
      out.print(i);
      out.write("</option>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label >Gender* :</label> \n");
      out.write("                        <div>\n");
      out.write("                            <input type=\"radio\" id=\"cusGender\" name=\"cusGender\" value=\"1\" checked> Male<br>\n");
      out.write("                            <input type=\"radio\" id=\"cusGender\" name=\"cusGender\" value=\"2\"> Female<br>\n");
      out.write("                        </div>  \n");
      out.write("                    </div> \n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\">SEND MESSAGE</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("        <!-- footer -->\n");
      out.write("        <section id=\"footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <p data-aos=\"fade-up\">Địa chỉ: 600, đường Nguyễn Văn Cừ (nối dài), phường An Bình,<br> quận Ninh Kiều, TP. Cần Thơ</p>\n");
      out.write("                        <p data-aos=\"fade-up\">Hotline: 0965689616</p>\n");
      out.write("                        <p data-aos=\"fade-up\">Zalo: 0965689616</p>\n");
      out.write("                        <p data-aos=\"fade-up\">Facebook: 0965689616</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <h4 data-aos=\"fade-up\">Contact with us</h4>\n");
      out.write("                        <i class=\"fa fa-facebook\" data-aos=\"fade-up\"></i>\n");
      out.write("                        <i class=\"fa fa-instagram\" data-aos=\"fade-up\"></i>\n");
      out.write("                        <i class=\"fa fa-skype\" data-aos=\"fade-up\"></i>\n");
      out.write("                        <i class=\"fa fa-youtube\" data-aos=\"fade-up\"></i>\n");
      out.write("                        <i class=\"fa fa-linkedin\" data-aos=\"fade-up\"></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <div class=\"design-by text-center\">\n");
      out.write("            <p>Designed by <span><a href=\"https://www.facebook.com/thanhnhan2102\">Thành Nhân</a></span></p>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/smooth-scroll.js\"></script>\n");
      out.write("        <script src=\"js/aos.js\"></script>\n");
      out.write("        <script>\n");
      out.write("                    function validation() {\n");
      out.write("                        var phone = document.getElementById(\"phone\");\n");
      out.write("                        var name = document.getElementById(\"client-name\");\n");
      out.write("                        var email = document.getElementById(\"email\");\n");
      out.write("                        console.log(phone);\n");
      out.write("                        console.log(email);\n");
      out.write("                        var phoneErr = document.getElementById(\"phoneErr\");\n");
      out.write("                        var nameErr = document.getElementById(\"nameErr\");\n");
      out.write("                        var emailErr = document.getElementById(\"emailErr\");\n");
      out.write("                        var phoneCheck = /((09|03|07|08|05)+[0-9]{8})$/i.test(phone.value);\n");
      out.write("                        var emailCheck = /^(([^<>()[\\]\\\\.,;:\\s@\\\"]+(\\.[^<>()[\\]\\\\.,;:\\s@\\\"]+)*)|(\\\".+\\\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$/i.test(email.value);\n");
      out.write("                        console.log(phoneCheck);\n");
      out.write("                        console.log(emailCheck);\n");
      out.write("\n");
      out.write("                        if (!phoneCheck || !emailCheck) {\n");
      out.write("                            if (!phoneCheck)\n");
      out.write("                                phoneErr.innerHTML = \"Phone invalid!\";\n");
      out.write("                            if (!emailCheck)\n");
      out.write("                                emailErr.innerHTML = \"Mail invalid!\";\n");
      out.write("                            return false;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            document.addEventListener(\"DOMContentLoaded\", function () {\n");
      out.write("                AOS.init();\n");
      out.write("                //nav\n");
      out.write("                var nav = document.querySelector('nav');\n");
      out.write("                var logo = document.getElementById('logo');\n");
      out.write("                var onTop = true;\n");
      out.write("                var dictrict = document.getElementsByClassName('dictrict');\n");
      out.write("                window.addEventListener(\"scroll\", function () {\n");
      out.write("                    if (window.pageYOffset > 500) {\n");
      out.write("                        if (onTop) {\n");
      out.write("                            nav.classList.add('navbar-top');\n");
      out.write("                            nav.classList.add('nav-bg-change');\n");
      out.write("                            logo.classList.add('logo');\n");
      out.write("                            onTop = false;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    if (window.pageYOffset <= 500) {\n");
      out.write("                        if (!onTop) {\n");
      out.write("                            nav.classList.remove('navbar-top');\n");
      out.write("                            nav.classList.remove('nav-bg-change');\n");
      out.write("                            logo.classList.remove('logo');\n");
      out.write("                            onTop = true;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            }, false);\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            var slideIndex = 1;\n");
      out.write("            showSlides(slideIndex);\n");
      out.write("            function plusSlides(n) {\n");
      out.write("                showSlides(slideIndex += n);\n");
      out.write("            }\n");
      out.write("            function currentSlide(n) {\n");
      out.write("                showSlides(slideIndex = n);\n");
      out.write("            }\n");
      out.write("            function showSlides(n) {\n");
      out.write("                var i;\n");
      out.write("                var slides = document.getElementsByClassName(\"mySlides\");\n");
      out.write("                var dots = document.getElementsByClassName(\"demo\");\n");
      out.write("                var captionText = document.getElementById(\"caption\");\n");
      out.write("                if (n > slides.length) {\n");
      out.write("                    slideIndex = 1;\n");
      out.write("                }\n");
      out.write("                if (n < 1) {\n");
      out.write("                    slideIndex = slides.length;\n");
      out.write("                }\n");
      out.write("                for (i = 0; i < slides.length; i++) {\n");
      out.write("                    slides[i].style.display = \"none\";\n");
      out.write("                }\n");
      out.write("                for (i = 0; i < dots.length; i++) {\n");
      out.write("                    dots[i].className = dots[i].className.replace(\" active\", \"\");\n");
      out.write("                }\n");
      out.write("                slides[slideIndex - 1].style.display = \" block\";\n");
      out.write("                dots[slideIndex - 1].className += \" active\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
