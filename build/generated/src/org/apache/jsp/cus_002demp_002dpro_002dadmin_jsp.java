package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ObjectInfo.Employees;
import Model.EmployeeModel;
import MyUltis.Tool;
import ObjectInfo.Product;
import Model.ProductModel;
import ObjectInfo.CusEmpPro;
import java.util.ArrayList;
import Model.CusEmProModel;

public final class cus_002demp_002dpro_002dadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    int num = 1;
    int idE = Integer.parseInt(String.valueOf(session.getAttribute("id")));
    EmployeeModel em = new EmployeeModel();
    Employees emp = em.getEmployees(idE);
    int idRole = emp.getIdRole();
    String username = (String) session.getAttribute("username");
    if (request.getParameter("page") != null) {
        p = Integer.parseInt(request.getParameter("page"));
    }
    if (request.getParameter("s") != null) {
        search = request.getParameter("s");
    }
    CusEmProModel cepm = new CusEmProModel();
    ArrayList<CusEmpPro> ceps = cepm.getPaging(p, search, idE);
    ProductModel pm = new ProductModel();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Customer - Employee - Product </title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
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
      out.write("                <span style=\"font-size: 12px; color: #fff;\">");
      out.print(username);
      out.write("</span>\n");
      out.write("                <li class=\"item\"><a href=\"product-list-admin.jsp\">Products</a></li>\n");
      out.write("                    ");

                        if (idRole == 1) {
                    
      out.write("\n");
      out.write("                <li class=\"item\"><a href=\"Employees-list.jsp\">Employees</a></li>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                <li class=\"item\"><a href=\"Customer-List.jsp\">Customers</a></li>\n");
      out.write("                <li class=\"item\"><a href=\"cus-emp-pro-admin.jsp\">Potential customers </a></li>\n");
      out.write("                <li class=\"item\"><a href=\"Employees-edit.jsp?id=");
      out.print(idE);
      out.write("&num=");
      out.print(num);
      out.write("\">Change Information</a></li>\n");
      out.write("                <li class=\"item\"><a href=\"password-edit.jsp?id=");
      out.print(idE);
      out.write("&num=");
      out.print(num);
      out.write("\">Change password</a></li>\n");
      out.write("                <li class=\"item\"><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("        <button class=\"my-btn-toggle\" style=\"border-radius: 5px;\"><i class=\"fa fa-bars\" id=\"btn-toggle\"></i></button>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"text-center title\">\n");
      out.write("\n");
      out.write("                <h2><strong>Customer - Employee - Product   </strong></h2>\n");
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
      out.write("                        <!--                        <th scope=\"col\">Description</th>-->\n");
      out.write("                        <th scope=\"col\">Name Customer</th>\n");
      out.write("                        <th scope=\"col\">Product's description</th>\n");
      out.write("                        <th scope=\"col\">Get </th>\n");
      out.write("                        <th scope=\"col\">Manager</th>\n");
      out.write("                        <th scope=\"col\">Check Sold</th>\n");
      out.write("                        <!--                        <th scope=\"col\">\n");
      out.write("                                                    <button onclick=\"location.href = 'product-new-admin.jsp'\"><i class=\"fa fa-plus-square text-primary\" style=\"font-size: 20px;\"></i></button>\n");
      out.write("                                                    <button onclick=\"location.href = 'product-list-hide-admin.jsp'\" class=\"btn btn-danger fa fa-trash-o text-white\">\n");
      out.write("                                                        <span class=\"badge badge-light\"></span>\n");
      out.write("                                                    </button>\n");
      out.write("                                                    <button type=\"button\" class=\"btn btn-primary fa fa-product-hunt text-white\">\n");
      out.write("                                                        <span class=\"badge badge-light\"></span>\n");
      out.write("                                                    </button>\n");
      out.write("                                                </th>-->\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        int No = (p - 1) * cepm.NUMBER;
                        for (CusEmpPro cep : ceps) {

                            Product product = pm.getProduct(cep.getIdProduct());
                            ++No;
                            String strDes = (cep.getDescription() == null) ? "No information" : cep.getDescription();
                            String statusEmp = (cep.getIdEmployees() == 0) ? "<i class='btn btn-primary'>Add</i>" : "<i class='btn btn-success'>Added</i>";
//                            String strStatus = (product.getStatus() == 1) ? "<i class='fa fa-check-circle text-success'></i>" : "<i class='fa fa-times-circle text-danger'></i>";

      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\">");
      out.print(No);
      out.write("</th>\n");
      out.write("\n");
      out.write("                        <td>");
      out.print(cep.getCusName());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(Tool.reduceStr(product.getDescript()));
      out.write("</td>\n");
      out.write("                        ");

                            if (cep.getIdEmployees() == 0) {
                        
      out.write("\n");
      out.write("                        <td><i onclick=\"location.href = 'update-add-emp.jsp?page=");
      out.print(p);
      out.write("&s=");
      out.print(search);
      out.write("&idE=");
      out.print(idE);
      out.write("&idCusEmpPro=");
      out.print(cep.getIdCusEmpPro());
      out.write("'\" class='btn btn-primary'>Add</i></td>\n");
      out.write("                        ");

                        } else {

                        
      out.write("\n");
      out.write("                        <td><i class='btn btn-success'>Added</i></td>\n");
      out.write("                        ");
                            }
                        
      out.write("\n");
      out.write("                        <td>\n");
      out.write("\n");
      out.write("                            <button onclick=\"location.href = 'cus-emp-pro-detail-admin.jsp?page=");
      out.print(p);
      out.write("&s=");
      out.print(search);
      out.write("&idP=");
      out.print(cep.getIdProduct());
      out.write("&idC=");
      out.print(cep.getIdCustomer());
      out.write("&idE=");
      out.print(cep.getIdEmployees());
      out.write("'\"><i class=\"fa fa-info-circle text-success\"></i></button>\n");
      out.write("                                ");

                                    if (cep.getIdEmployees() != 0) {
                                
      out.write("\n");
      out.write("                            <button onclick=\"location.href = 'cus-emp-pro-edit-admin.jsp?page=");
      out.print(p);
      out.write("&s=");
      out.print(search);
      out.write("&idCusEmpPro=");
      out.print(cep.getIdCusEmpPro());
      out.write("'\"><i class=\"fa fa-pencil text-warning\"></i></button>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            ");

                                if (cep.getIdEmployees() != 0) {
                                    if (product.getStatus() == 2) {
                            
      out.write("\n");
      out.write("                            <i class=\"fa fa-check-circle-o text-primary\"></i>\n");
      out.write("                            ");

                            } else {
                            
      out.write("\n");
      out.write("                            <i class=\"btn btn-danger\" title=\"Click to check sold\" onclick=\"location.href = 'sold-product.jsp?page=");
      out.print(p);
      out.write("&s=");
      out.print(search);
      out.write("&idP=");
      out.print(cep.getIdProduct());
      out.write("&idCusEmpPro=");
      out.print(cep.getIdCusEmpPro());
      out.write("'\">Not yet</i>\n");
      out.write("                            ");

                                    }
                                }
                            
      out.write("\n");
      out.write("                        </td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"10\" align=\"rigth\"> ");
      out.print(cepm.getPagingString(p, search, idE));
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
