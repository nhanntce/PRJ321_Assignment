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

public final class product_002dlist_002dclient_jsp extends org.apache.jasper.runtime.HttpJspBase
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



      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Product</title>\n");
      out.write("        <link rel=\"icon\" type=\"icon\" href=\"images/logo.png\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css\\\\style2.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css\\\\aos.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css\\\\responsive.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" ></script>\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
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
      out.write("        <section id=\"slide\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <section id=\"slide\">\n");
      out.write("                <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                    <ol class=\"carousel-indicators\">\n");
      out.write("                        <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                        <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\n");
      out.write("                        <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\n");
      out.write("                    </ol>\n");
      out.write("                    <div class=\"carousel-inner\">\n");
      out.write("                        <div class=\"carousel-item active\">\n");
      out.write("                            <img src=\"images/home/slide-1-1.jpg\" class=\"d-block w-100\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-item\">\n");
      out.write("                            <img src=\"images/home/slide-2.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-item\">\n");
      out.write("                            <img src=\"images/home/slide-three.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                        <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                        <span class=\"sr-only\">Previous</span>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\n");
      out.write("                        <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                        <span class=\"sr-only\">Next</span>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section id=\"search\">\n");
      out.write("            <div class=\"container\"  data-aos=\"fade-up\">\n");
      out.write("                <form onsubmit=\"return validateForm()\" name=\"myForm\" >\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"districts\">Districts</label>\n");
      out.write("                        <div>\n");
      out.write("                            <select id=\"districts\" name=\"d\" class=\"form-control\">\n");
      out.write("                                <option value=\"0\">All</option>\n");
      out.write("                                <option value=\"1\">Ninh Kieu</option>\n");
      out.write("                                <option value=\"2\">Binh Thuy</option>\n");
      out.write("                                <option value=\"3\">Cai Rang</option>\n");
      out.write("                                <option value=\"4\">Phong Dien</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Price From</label>\n");
      out.write("                                <input id=\"pf\" type=\"number\" class=\"form-control\" placeholder=\"Price...\" name=\"pf\"  step=\"any\" value=\"");
      out.print(priceFrom);
      out.write("\">\n");
      out.write("                                <span id=\"pf-e\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Price To</label>\n");
      out.write("                                <input id=\"pt\" type=\"number\" class=\"form-control\" placeholder=\"Price...\" name=\"pt\"  step=\"any\" value=\"");
      out.print(priceTo);
      out.write("\">\n");
      out.write("                                <span id=\"pt-e\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Area From</label>\n");
      out.write("                                <input id=\"af\" type=\"number\" class=\"form-control\" placeholder=\"Area...\" name=\"af\"  step=\"any\" value=\"");
      out.print(areaFrom);
      out.write("\">\n");
      out.write("                                <span id=\"af-e\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Area To</label>\n");
      out.write("                                <input id=\"at\" type=\"number\" class=\"form-control\" placeholder=\"Area...\" name=\"at\"  step=\"any\" value=\"");
      out.print(areaTo);
      out.write("\">\n");
      out.write("                                <span id=\"at-e\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Search</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section id=\"list-product\">\n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                <h1>List product(");
      out.print(pm.getNumberOfProduct(p, priceFrom, priceTo, district, areaFrom, areaTo));
      out.write(")</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    ");

                        for (Product product : products) {
                            ArrayList<Image> imgs = im.getImageByIdProduct(product.getIdProduct());


                    
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"product-item\" data-aos=\"fade-up\">\n");
      out.write("                            <div class=\"image-item\">\n");
      out.write("                                <img src=\"images/products/");
      out.print(imgs.get(0).getImage());
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
      out.print(product.getPosition());
      out.write("</span>\n");
      out.write("                                <h5 id=\"p-price\">Price: ");
      out.print(product.getPrice());
      out.write(" million</h5>\n");
      out.write("                                <div id=\"p-date\">\n");
      out.write("                                    <p>");
      out.print(product.getPublicTime());
      out.write("</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");

                    if (products.size() == 0) {
                        out.println("<h2>No one product</h2>");
                    }
                
      out.write("\n");
      out.write("                ");
      out.print(pm.getPagingString(p, priceFrom, priceTo, district, areaFrom, areaTo));
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
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
      out.write("        <script src=\"js/aos.js\"></script>\n");
      out.write("        <script src=\"js/smooth-scroll.js\"></script>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("                    document.addEventListener(\"DOMContentLoaded\", function () {\n");
      out.write("                        AOS.init();\n");
      out.write("                        //nav\n");
      out.write("                        var nav = document.querySelector('nav');\n");
      out.write("                        var logo = document.getElementById('logo');\n");
      out.write("                        var onTop = true;\n");
      out.write("                        var dictrict = document.getElementsByClassName('dictrict');\n");
      out.write("\n");
      out.write("                        window.addEventListener(\"scroll\", function () {\n");
      out.write("                            if (window.pageYOffset > 500) {\n");
      out.write("                                if (onTop) {\n");
      out.write("                                    nav.classList.add('navbar-top');\n");
      out.write("                                    nav.classList.add('nav-bg-change');\n");
      out.write("                                    logo.classList.add('logo');\n");
      out.write("                                    onTop = false;\n");
      out.write("                                }\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                            if (window.pageYOffset <= 500) {\n");
      out.write("                                if (!onTop) {\n");
      out.write("                                    nav.classList.remove('navbar-top');\n");
      out.write("                                    nav.classList.remove('nav-bg-change');\n");
      out.write("                                    logo.classList.remove('logo');\n");
      out.write("                                    onTop = true;\n");
      out.write("                                }\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("\n");
      out.write("                        });\n");
      out.write("\n");
      out.write("                        selectElement('districts', '");
      out.print(district);
      out.write("');\n");
      out.write("\n");
      out.write("                        function selectElement(id, valueToSelect) {\n");
      out.write("                            let element = document.getElementById(id);\n");
      out.write("                            element.value = valueToSelect;\n");
      out.write("                        }\n");
      out.write("                        ;\n");
      out.write("                        var scroll = new SmoothScroll('a[href*=\"#\"]');\n");
      out.write("\n");
      out.write("                    }, false);\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            var pf = document.getElementById(\"pf\");\n");
      out.write("            var pt = document.getElementById(\"pt\");\n");
      out.write("            var ptE = document.getElementById(\"pt-e\");\n");
      out.write("            var af = document.getElementById(\"af\");\n");
      out.write("            var at = document.getElementById(\"at\");\n");
      out.write("            var atE = document.getElementById(\"at-e\");\n");
      out.write("            function validateForm() {\n");
      out.write("                var pfV = pf.value;\n");
      out.write("                var ptV = pt.value;\n");
      out.write("                var afV = af.value;\n");
      out.write("                var atV = at.value;\n");
      out.write("                console.log(ptE);\n");
      out.write("                console.log(atE);\n");
      out.write("                console.log(pfV);\n");
      out.write("                console.log(ptV);\n");
      out.write("                console.log(afV);\n");
      out.write("                console.log(atV);\n");
      out.write("                if (pfV < 0 || ptV < 0 || afV < 0 || atV < 0 || pfV > ptV || afV > atV) {\n");
      out.write("                    if (pfV < 0 || ptV < 0) {\n");
      out.write("                        ptE.innerHTML = \"Price can't be smaller than 0!\";\n");
      out.write("                    }\n");
      out.write("                    if (pfV > ptV) {\n");
      out.write("                        ptE.innerHTML = \"Price from must be smaller than price to!\";\n");
      out.write("                    }\n");
      out.write("                    if (afV < 0 || atV < 0) {\n");
      out.write("                        atE.innerHTML = \"Area can't be smaller than 0!\";\n");
      out.write("                    }\n");
      out.write("                    if (afV > atV) {\n");
      out.write("                        atE.innerHTML = \"Area from must be smaller than area to!\";\n");
      out.write("                    }\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
