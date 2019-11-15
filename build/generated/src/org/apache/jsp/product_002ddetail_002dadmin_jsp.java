package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ObjectInfo.Image;
import java.util.ArrayList;
import Model.ImageModel;
import java.text.SimpleDateFormat;
import ObjectInfo.Product;
import Model.ProductModel;

public final class product_002ddetail_002dadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Product detail</title>\n");
      out.write("        <link rel=\"icon\" type=\"icon\" href=\"images/logo.png\">\n");
      out.write("        <link rel=\"icon\" type=\"icon\" href=\"images/logo.png\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" ></script>\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body {\n");
      out.write("                font-family:  Candara;\n");
      out.write("            }\n");
      out.write("            .container {\n");
      out.write("                padding: 50px 0;\n");
      out.write("            }\n");
      out.write("            .title {\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                position: relative;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                font-size: 2em;\n");
      out.write("                letter-spacing: 4px;\n");
      out.write("                background: linear-gradient(90deg, #fff, #000, #fff);\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: 80%;\n");
      out.write("                animation: animate 3s linear infinite;\n");
      out.write("                -webkit-background-clip: text;\n");
      out.write("                -webkit-text-fill-color: #0000;\n");
      out.write("            }\n");
      out.write("            @keyframes animate {\n");
      out.write("                from {\n");
      out.write("                    background-position: -500%;\n");
      out.write("                }\n");
      out.write("                to {\n");
      out.write("                    background-position: 500%;\n");
      out.write("                }\n");
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
      out.write("            \n");
      out.write("            .back {\n");
      out.write("                margin-top: 30px; \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                <div class=\"title\">\n");
      out.write("                    <h2><strong>Product detail</strong></h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"title-con\">\n");
      out.write("                <h3>Detail information</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"descript\">\n");
      out.write("                <p>- ");
      out.print(product.getDescript());
      out.write("</p>\n");
      out.write("                <p>Price: ");
      out.print(product.getPrice());
      out.write("</p>\n");
      out.write("                <p>Area: ");
      out.print(product.getSquare());
      out.write("m</p>\n");
      out.write("                <p>Type: ");
      out.print(product.getNameType());
      out.write("</p>\n");
      out.write("                <p>District: ");
      out.print(product.getNameDistrict());
      out.write("</p>\n");
      out.write("                <p>Position: ");
      out.print(product.getPosition());
      out.write("</p>\n");
      out.write("                <p>Shape: ");
      out.print(product.getShape());
      out.write("</p>\n");
      out.write("                <p>Direction: ");
      out.print(product.getDirection());
      out.write("</p>\n");
      out.write("                <p>Juridical: ");
      out.print(product.getJuridical());
      out.write("</p>\n");
      out.write("                <p>Right of way: ");
      out.print(product.getRightOfWay());
      out.write("m</p>\n");
      out.write("                <p>Public time: ");
      out.print(dateStr);
      out.write("</p>\n");
      out.write("                <p>Status: ");
      out.print(status);
      out.write("</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"title-con\">\n");
      out.write("                <h3>Image (");
      out.print(numberOfImage);
      out.write(")</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"image-list\">\n");
      out.write("                <div class=\"container-1\">\n");
      out.write("                    <div class=\"image-big\">\n");
      out.write("                        ");

                            for(Image image : images){
                                
                        
      out.write("\n");
      out.write("                        <div class=\"mySlides\">\n");
      out.write("                            <img src=\"images/products/");
      out.print(image.getImage());
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <span class=\"prev\" onclick=\"plusSlides(-1)\">❮</span>\n");
      out.write("                    <span class=\"next\" onclick=\"plusSlides(1)\">❯</span>\n");
      out.write("\n");
      out.write("                    <div class=\"row-image\">\n");
      out.write("                        ");

                            int imgCurrent = 0;
                            for(Image image : images){
                                ++imgCurrent;
                                
                        
      out.write("\n");
      out.write("                        <div class=\"column\">\n");
      out.write("                            <img class=\"demo cursor\" src=\"images/products/");
      out.print(image.getImage());
      out.write("\" style=\"width:100%\" onclick=\"currentSlide(");
      out.print(imgCurrent);
      out.write(")\">\n");
      out.write("                        </div>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                        \n");
      out.write("<!--                        <div class=\"column\">\n");
      out.write("                            <img class=\"demo cursor\" src=\"images/district/phongdien.jpg\" style=\"width:100%\" onclick=\"currentSlide(2)\" alt=\"Cinque Terre\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"column\">\n");
      out.write("                            <img class=\"demo cursor\" src=\"images/district/binhthuy.jpg\" style=\"width:100%\" onclick=\"currentSlide(3)\" alt=\"Mountains and fjords\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"column\">\n");
      out.write("                            <img class=\"demo cursor\" src=\"images/district/cairang.jpg\" style=\"width:100%\" onclick=\"currentSlide(4)\" alt=\"Northern Lights\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"column\">\n");
      out.write("                            <img class=\"demo cursor\" src=\"images/district/binhthuy.jpg\" style=\"width:100%\" onclick=\"currentSlide(5)\" alt=\"Nature and sunrise\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"column\">\n");
      out.write("                            <img class=\"demo cursor\" src=\"images/district/binhthuy.jpg\" style=\"width:100%\" onclick=\"currentSlide(6)\" alt=\"Snowy Mountains\">\n");
      out.write("                        </div>-->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                        <div class=\"back\">\n");
      out.write("                            <a href=\"product-list-admin.jsp?page=");
      out.print(p);
      out.write("&s=");
      out.print(search);
      out.write("\" class=\"btn btn-primary\"><i class=\"fa fa-chevron-left\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("        </div>\n");
      out.write("                        \n");
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
      out.write("\n");
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
