package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.ImageModel;
import ObjectInfo.Image;
import java.text.SimpleDateFormat;
import ObjectInfo.Product;
import Model.ProductModel;
import ObjectInfo.District;
import ObjectInfo.Typee;
import Model.DistrictsModel;
import java.util.ArrayList;
import Model.TypesModel;

public final class product_002dedit_002dadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

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
    //load type
    TypesModel tm = new TypesModel();
    //store type
    ArrayList<Typee> types = tm.loadTypes();
    //load District
    DistrictsModel dm = new DistrictsModel();
    //store district
    ArrayList<District> dts = dm.loadDistricts();
    //load product
    ProductModel pm = new ProductModel();
    Product product = pm.getProduct(idProduct);
    String idD = String.valueOf(product.getIdDistrict());
    String idT = String.valueOf(product.getIdType());
    //load image
    ImageModel im = new ImageModel();
    ArrayList<Image> images = im.getImageByIdProduct(idProduct);

    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
    String dateStr = sdf.format(product.getPublicTime());



      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Edit product</title>\n");
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
      out.write("            .list-image{\n");
      out.write("                width: 100%;\n");
      out.write("                height: auto;\n");
      out.write("                border: 1px solid #ced4da;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .image-product{\n");
      out.write("                width: 100%;\n");
      out.write("                margin: 15px 0;\n");
      out.write("                height: 200px;\n");
      out.write("                overflow: hidden;\n");
      out.write("                /*padding: 10px;*/\n");
      out.write("                border-radius: 10px;\n");
      out.write("            }\n");
      out.write("            img {\n");
      out.write("                width: 100%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"text-center title\">\n");
      out.write("                <h2><strong>Edit new product</strong></h2>\n");
      out.write("            </div>\n");
      out.write("            <form action=\"product-edit-save-admin.jsp\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                <input type=\"hidden\" name=\"id\" value=\"");
      out.print(idProduct);
      out.write("\">\n");
      out.write("                <input type=\"hidden\" name=\"search\" value=\"");
      out.print(search);
      out.write("\">\n");
      out.write("                <input type=\"hidden\" name=\"page\" value=\"");
      out.print(p);
      out.write("\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Description</label>\n");
      out.write("                    <textarea type=\"text\" class=\"form-control\" name=\"description\" autofocus required>");
      out.print(product.getDescript());
      out.write("</textarea>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Price</label>\n");
      out.write("                    <input type=\"number\" class=\"form-control\" placeholder=\"Price...\" name=\"price\" value=\"");
      out.print(product.getPrice());
      out.write("\" step=\"any\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Area</label>\n");
      out.write("                    <input type=\"number\" class=\"form-control\" placeholder=\"Area...\" value=\"");
      out.print(product.getSquare());
      out.write("\" name=\"area\" step=\"any\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <label>Type</label>\n");
      out.write("                            <select class=\"form-control\" name=\"type\" id=\"type\" required>\n");
      out.write("                                <option value=\"");
      out.print(product.getIdType());
      out.write('"');
      out.write('>');
      out.print(product.getNameType());
      out.write("</option>\n");
      out.write("                                ");

                                    for (Typee type : types) {
                                        if (type.getIdType() != product.getIdType()) {
                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(type.getIdType());
      out.write('"');
      out.write('>');
      out.print(type.getNameType());
      out.write("</option>\n");
      out.write("                                ");

                                        }
                                    }
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <label>District</label>\n");
      out.write("                            <select class=\"form-control\" name=\"district\" id=\"district\" required>\n");
      out.write("                                <option value=\"");
      out.print(product.getIdDistrict());
      out.write('"');
      out.write('>');
      out.print(product.getNameDistrict());
      out.write("</option>\n");
      out.write("                                ");

                                    for (District dt : dts) {
                                        if (dt.getIdDistrict() != product.getIdDistrict()) {
                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(dt.getIdDistrict());
      out.write('"');
      out.write('>');
      out.print(dt.getNameDistrict());
      out.write("</option>\n");
      out.write("                                ");

                                        }
                                    }
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Position</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Position...\" value=\"");
      out.print(product.getPosition());
      out.write("\" name=\"position\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Shape</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Shape...\" value=\"");
      out.print(product.getShape());
      out.write("\" name=\"shape\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Direction</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Direction...\" value=\"");
      out.print(product.getDirection());
      out.write("\" name=\"direction\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Juridical</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Juridical...\" value=\"");
      out.print(product.getJuridical());
      out.write("\" name=\"juridical\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Right of way</label>\n");
      out.write("                    <input type=\"number\" class=\"form-control\" placeholder=\"Right of way...\" value=\"");
      out.print(product.getRightOfWay());
      out.write("\" name=\"right-of-way\" step=\"any\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Status</label>\n");
      out.write("                    <select class=\"form-control\" name=\"status\" required>\n");
      out.write("                        ");

                            String strValue1 = "Stop business";
                            String strValue2 = "Availible";
                            int value2 = 1;
                            if (product.getStatus() == 1) {
                                value2 = 2;
                                strValue1 = "Availible";
                                strValue2 = "Stop business";
                            }

                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(product.getStatus());
      out.write('"');
      out.write('>');
      out.print(strValue1);
      out.write("</option>\n");
      out.write("                        <option value=\"");
      out.print(value2);
      out.write('"');
      out.write('>');
      out.print(strValue2);
      out.write("</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <p>Image</p>\n");
      out.write("                <div class=\"list-image\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        ");

                            for (Image image : images) {


                        
      out.write("\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <div class=\"image-product\">\n");
      out.write("                                <img class=\"img\" src=\"images/products/");
      out.print(image.getImage());
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <span onclick=\"location.href = 'image-delete-admin.jsp?page=");
      out.print(p);
      out.write("&s=");
      out.print(search);
      out.write("&id=");
      out.print(idProduct);
      out.write("&idimg=");
      out.print(image.getIdImage());
      out.write("'\" class=\"btn btn-danger\"><i class=\"fa fa-trash\"></i></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Picture</label>\n");
      out.write("                    <input type=\"file\" name=\"file\" multiple=\"multiple\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Date posted</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" value=\"");
      out.print(dateStr);
      out.write("\" name=\"date\" required disabled>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"text-center\">\n");
      out.write("                    <input class=\"btn btn-primary btn-block\" type=\"submit\" name=\"submit\" value=\"Submit\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            \n");
      out.write("                selectElement(\"district\", \"2\");\n");
      out.write("                selectElement(\"type\", \"2\");\n");
      out.write("                function selectElement(id, valueToSelect) {\n");
      out.write("                    let element = document.getElementById(id);\n");
      out.write("                    element.value = valueToSelect;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("          \n");
      out.write("        </script>\n");
      out.write("\n");
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
