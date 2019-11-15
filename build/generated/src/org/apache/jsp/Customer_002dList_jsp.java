package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ObjectInfo.Employees;
import Model.EmployeeModel;
import java.text.SimpleDateFormat;
import ObjectInfo.Customer;
import java.util.ArrayList;
import java.util.ArrayList;
import Model.CustomerModel;
import MyUltis.DBConnection;
import java.sql.Connection;

public final class Customer_002dList_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    int p = 1;
    String s = "";
    String username = (String) session.getAttribute("username");
    int num = 1;
    int id = Integer.parseInt(String.valueOf(session.getAttribute("id")));
    EmployeeModel em = new EmployeeModel();
    Employees emp = em.getEmployees(id);
    int idRole = emp.getIdRole();
    if (request.getParameter("s") != null) {
        s = request.getParameter("s");
    }

    if (request.getParameter("trang") != null) {
        p = Integer.parseInt(request.getParameter("trang"));
    }

    Connection con = DBConnection.getConnection();
    CustomerModel CM = new CustomerModel(con);
    ArrayList<Customer> list = CM.getPagingCustomer(p, s);

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Customer-List</title>\n");
      out.write("        <link rel=\"icon\" type=\"icon\" href=\"images/logo.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .sp-price {\n");
      out.write("                text-align: right;\n");
      out.write("            }\n");
      out.write("            .table tr td {\n");
      out.write("                vertical-align: middle !important;\n");
      out.write("                align-content: center;\n");
      out.write("            }\n");
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
      out.write("            \n");
      out.write("            button {\n");
      out.write("                background: none;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <nav class=\"my-nav\" id=\"nav\">\n");
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
      out.print(id);
      out.write("&num=");
      out.print(num);
      out.write("\">Change Information</a></li>\n");
      out.write("                <li class=\"item\"><a href=\"password-edit.jsp?id=");
      out.print(id);
      out.write("&num=");
      out.print(num);
      out.write("\">Change password</a></li>\n");
      out.write("                <li class=\"item\"><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("        <button class=\"my-btn-toggle\" style=\"border-radius: 5px;\"><i class=\"fa fa-bars\" id=\"btn-toggle\"></i></button>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h2><strong>List Customer(");
      out.print(CM.getNumberOfProduct(p, s));
      out.write(" Customer)</strong></h2>\n");
      out.write("            <p></p>                                                                                      \n");
      out.write("            <div class=\"table-responsive\">          \n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th colspan=\"9\" align=\"center\"> \n");
      out.write("                                <form>\n");
      out.write("                                    <div class=\"input-group\" style = width:95%>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"Search\"\n");
      out.write("                                               name='s' value=\"");
      out.print(s);
      out.write("\">\n");
      out.write("                                        <div class=\"input-group-btn\">\n");
      out.write("                                            <button class=\"btn btn-default\" type=\"submit\">\n");
      out.write("                                                <i class=\"glyphicon glyphicon-search\"></i>\n");
      out.write("                                            </button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </th>\n");
      out.write("                        <tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th colspan=\"9\" align=\"center\"> \n");
      out.write("                                ");
      out.print(CM.getPagingString(p, s));
      out.write("\n");
      out.write("                            </th>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>ID Customer</th>\n");
      out.write("                            <th>Name</th>\n");
      out.write("                            <th>Mail</th>\n");
      out.write("                            <th>Phone Number</th>\n");
      out.write("                            <th>Birthday</th>\n");
      out.write("                            <th>Gender</th>\n");
      out.write("                            <th>Manager\n");
      out.write("                                \n");
      out.write("                                <button type=\"button\" class=\"btn btn-secondary btn-sm btn-danger\"\n");
      out.write("                                        onclick= \"location.href = 'Customer-trash.jsp'\" \n");
      out.write("                                        data-toggle=\"tooltip\" data-placement=\"top\" title=\"Go to the Trash\">\n");
      out.write("                                    <i class=\"fa fa-trash\" aria-hidden=\"true\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                            int idCus = (p - 1) * CustomerModel.SoDong_Trang;
                            String gender;
                            SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");
                            for (Customer cm : list) {
                                idCus++;
                                gender = cm.getGenderCustomer() == 1
                                        ? "<i class='fa fa-mars text-success'></i>"
                                        : "<i class='fa fa-venus text-danger' ></i>";
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(idCus);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(cm.getNameCustomer());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(cm.getMail());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(cm.getPhoneCustomer());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(dFormat.format(cm.getBirthdayCustomer()));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(gender);
      out.write("</td>\n");
      out.write("                            <td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <button type=\"button\" class=\"btn btn-default btn-sm btn-warning\"\n");
      out.write("                                        onclick=\"location.href = 'Customer-edit.jsp?id=");
      out.print(cm.getIdCustomer());
      out.write("&trang=");
      out.print(p);
      out.write("&s=");
      out.print(s);
      out.write("'\"\n");
      out.write("                                        data-toggle=\"tooltip\" data-placement=\"top\" title=\"Edit\">\n");
      out.write("                                    <span class=\"glyphicon glyphicon-pencil\"></span>\n");
      out.write("                                </button>\n");
      out.write("\n");
      out.write("                                <button type=\"button\" class=\"btn btn-default btn-sm btn-danger\"\n");
      out.write("                                        onclick=\"if (confirm('Do you really want to delete this Customer ");
      out.print(cm.getNameCustomer());
      out.write("'))\n");
      out.write("                                                    location.href = 'Customer-delete.jsp?id=");
      out.print(cm.getIdCustomer());
      out.write("&trang=");
      out.print(p);
      out.write("&s=");
      out.print(s);
      out.write("'\"\n");
      out.write("                                        data-toggle=\"tooltip\" data-placement=\"top\" title=\"Delete\">\n");
      out.write("                                    <i class=\"fa fa-minus\" aria-hidden=\"true\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    <script type=\"text/javascript\">\n");
      out.write("                        document.addEventListener(\"DOMContentLoaded\", function () {\n");
      out.write("                            var btnToggle = document.getElementById(\"btn-toggle\");\n");
      out.write("                            var nav = document.getElementById(\"nav\");\n");
      out.write("                            var container = document.querySelector(\".container\");\n");
      out.write("                            var status = true;\n");
      out.write("\n");
      out.write("                            btnToggle.onclick = function () {\n");
      out.write("                                console.log(\"aaaaaaa\");\n");
      out.write("                                if (status) {\n");
      out.write("                                    btnToggle.classList.add('fa-times');\n");
      out.write("                                    btnToggle.classList.remove('fa-bars');\n");
      out.write("                                    nav.classList.add('nav-show');\n");
      out.write("//                                    container.classList.add('container-right');\n");
      out.write("                                    status = !status;\n");
      out.write("                                } else {\n");
      out.write("                                    nav.classList.remove('nav-show');\n");
      out.write("                                    btnToggle.classList.remove('fa-times');\n");
      out.write("                                    btnToggle.classList.add('fa-bars');\n");
      out.write("//                                    container.classList.remove('container-right');\n");
      out.write("                                    status = !status;\n");
      out.write("                                }\n");
      out.write("                            };\n");
      out.write("                        }, false);\n");
      out.write("\n");
      out.write("                    </script>\n");
      out.write("                    </body>\n");
      out.write("                    </html>\n");
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
