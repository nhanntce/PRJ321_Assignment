package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import MyUltis.Tool;
import java.text.SimpleDateFormat;
import ObjectInfo.Product;
import ObjectInfo.District;
import ObjectInfo.Typee;
import java.util.ArrayList;
import Model.ProductModel;
import Model.DistrictsModel;
import Model.TypesModel;

public final class product_002dlist_002dhide_002dadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    int p = 1;
    String search = "";
    String scl = "";
    if (request.getParameter("s") != null) {
        search = request.getParameter("s");
    }
    if (request.getParameter("page") != null) {
        p = Integer.parseInt(request.getParameter("page"));
    }
    ProductModel pm = new ProductModel();
    //store product
    ArrayList<Product> products = pm.getPagingHide(p, search, scl);
    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");



      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin product</title>\n");
      out.write("        <link rel=\"icon\" type=\"icon\" href=\"images/logo.png\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            *{\n");
      out.write("                font-family:  Candara;\n");
      out.write("            }\n");
      out.write("            body {margin: 0;}\n");
      out.write("\n");
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
      out.write("                margin-bottom: 20px;\n");
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
      out.write("            i.fa {\n");
      out.write("                font-size: 24px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button {\n");
      out.write("                background: none;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table tr td, table tr th {\n");
      out.write("                vertical-align: middle !important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .my-nav {\n");
      out.write("                width: 250px;\n");
      out.write("                height: 100vh;\n");
      out.write("                position: fixed;\n");
      out.write("                background: #333;\n");
      out.write("                z-index: 10;\n");
      out.write("                left: -100%;\n");
      out.write("                transition: 0.4s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav-show{\n");
      out.write("                left: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            ul {\n");
      out.write("                margin-top: 100px;\n");
      out.write("                list-style: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #fff;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a:hover {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #ddd;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            ul li.item {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 30px 0 0;\n");
      out.write("                border-bottom: 1px solid #222;\n");
      out.write("            }\n");
      out.write("            .fa.user {\n");
      out.write("                font-size: 52px;\n");
      out.write("                color: #fff;\n");
      out.write("                padding-left: 60px;\n");
      out.write("                padding-bottom: 30px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .my-btn-toggle {\n");
      out.write("                transform: translateX(250px);\n");
      out.write("                background: #333;\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .my-btn-toggle.fa {\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container-right {\n");
      out.write("                transform: translateX(250px);\n");
      out.write("                transition: 0.4s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .fa {\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"my-nav\" id=\"nav\">\n");
      out.write("            <ul class=\"items\">\n");
      out.write("                <div class=\"user-1\"><i class=\"fa fa-user user\"></i></div>\n");
      out.write("                <li class=\"item\"><a href=\"\">Products</a></li>\n");
      out.write("                <li class=\"item\"><a href=\"\">Employees</a></li>\n");
      out.write("                <li class=\"item\"><a href=\"\">Customers</a></li>\n");
      out.write("                <li class=\"item\"><a href=\"\">Potential customers </a></li>\n");
      out.write("                <li class=\"item\"><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("        <button class=\"my-btn-toggle\"><i class=\"fa fa-bars\" id=\"btn-toggle\"></i></button>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"text-center title\">\n");
      out.write("\n");
      out.write("                <h2><strong>Management product</strong></h2>\n");
      out.write("            </div>\n");
      out.write("            <table class=\"table\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th colspan=\"10\">\n");
      out.write("                            <form>\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"s\" placeholder=\"Search\" value=\"");
      out.print(search);
      out.write("\">\n");
      out.write("                                    <div class=\"input-group-btn\">\n");
      out.write("                                        <button class=\"btn btn-default\" type=\"submit\">\n");
      out.write("                                            <i class=\"fa fa-search\"></i>\n");
      out.write("                                        </button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"col\">NO.</th>\n");
      out.write("                        <th scope=\"col\">Type</th>\n");
      out.write("                        <th scope=\"col\">District</th>\n");
      out.write("                        <th scope=\"col\">Description</th>\n");
      out.write("                        <th scope=\"col\">Price</th>\n");
      out.write("                        <th scope=\"col\">Area</th>\n");
      out.write("                        <th scope=\"col\">Position</th>\n");
      out.write("                        <th scope=\"col\">Time</th>\n");
      out.write("                        <th scope=\"col\">Status</th>\n");
      out.write("                        <th scope=\"col\">\n");
      out.write("                            <button onclick=\"location.href = 'product-new-admin.jsp'\"><i class=\"fa fa-plus-square text-primary\"></i></button>\n");
      out.write("                            <button><i class=\"fa fa-trash-o text-danger\"></i></button>\n");
      out.write("                        </th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        int productNo = (p - 1) * pm.NUMBER_LINE_PAGE;
                        for (Product product : products) {
                            ++productNo;
                            String strStatus = (product.getStatus() == 1) ? "<i class='fa fa-check-circle text-success'></i>" : "<i class='fa fa-times-circle text-danger'></i>";
                    
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\">");
      out.print(productNo);
      out.write("</th>\n");
      out.write("                        <td>");
      out.print(product.getNameType());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(product.getNameDistrict());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(Tool.reduceStr(product.getDescript()));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(product.getPrice());
      out.write(" million</td>\n");
      out.write("                        <td>");
      out.print(product.getSquare());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(Tool.reduceStr(product.getPosition()));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(sdf.format(product.getPublicTime()));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(strStatus);
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            <button onclick=\"location.href = 'product-edit-admin.jsp?page=");
      out.print(p);
      out.write("&s=");
      out.print(search);
      out.write("&id=");
      out.print(product.getIdProduct());
      out.write("'\"><i class=\"fa fa-pencil text-warning\"></i></button>\n");
      out.write("                            <button onclick=\"location.href = 'product-detail-admin.jsp?page=");
      out.print(p);
      out.write("&s=");
      out.print(search);
      out.write("&id=");
      out.print(product.getIdProduct());
      out.write("'\"><i class=\"fa fa-info-circle text-success\"></i></button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"10\" align=\"rigth\"> ");
      out.print(pm.getPagingStringHide(p, search, scl));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            document.addEventListener(\"DOMContentLoaded\", function () {\n");
      out.write("                var btnToggle = document.getElementById(\"btn-toggle\");\n");
      out.write("                var nav = document.getElementById(\"nav\");\n");
      out.write("                var container = document.querySelector(\".container\");\n");
      out.write("                var status = true;\n");
      out.write("\n");
      out.write("                btnToggle.onclick = function () {\n");
      out.write("                    console.log(\"aaaaaaa\");\n");
      out.write("                    if (status) {\n");
      out.write("                        btnToggle.classList.add('fa-times');\n");
      out.write("                        btnToggle.classList.remove('fa-bars');\n");
      out.write("                        nav.classList.add('nav-show');\n");
      out.write("//                                    container.classList.add('container-right');\n");
      out.write("                        status = !status;\n");
      out.write("                    } else {\n");
      out.write("                        nav.classList.remove('nav-show');\n");
      out.write("                        btnToggle.classList.remove('fa-times');\n");
      out.write("                        btnToggle.classList.add('fa-bars');\n");
      out.write("//                                    container.classList.remove('container-right');\n");
      out.write("                        status = !status;\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("            }, false);\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
