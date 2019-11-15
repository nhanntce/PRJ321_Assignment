package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.EmployeeModel;
import MyUltis.DBConnection;
import java.sql.Connection;
import java.util.ArrayList;
import ObjectInfo.Employees;

public final class Employees_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");

    int p = 1;
    String s = "";
    String sortColumn = "";
    String username = String.valueOf(session.getAttribute("username"));
    int num = 1;
    int id = Integer.parseInt(String.valueOf(session.getAttribute("id")));
    EmployeeModel em = new EmployeeModel();
    Employees emp = em.getEmployees(id);
    int idRole = emp.getIdRole();
    if (request.getParameter("page") != null) {
        p = Integer.parseInt(request.getParameter("page"));
    }

    if (request.getParameter("s") != null) {
        s = request.getParameter("s");
    }
    Connection con = DBConnection.getConnection();
    EmployeeModel elem = new EmployeeModel();
    ArrayList<Employees> ele = elem.getPaging(p, s, sortColumn);

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .hero {\n");
      out.write("                color: #888;\n");
      out.write("                width: 100%;\n");
      out.write("                top: 20%;\n");
      out.write("                left: 50%;\n");
      out.write("                text-align: center;\n");
      out.write("                font-weight: bold;\n");
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
      out.write("            button {\n");
      out.write("                background: none;\n");
      out.write("                border: none;\n");
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
      out.write("            <h1 class=\"hero\">LIST EMPLOYEES</h1>\n");
      out.write("            <div>\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr class=\"search\">\n");
      out.write("                            <th colspan=\"9\">\n");
      out.write("                                <form>\n");
      out.write("                                    <div class=\"input-group\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"s\" placeholder=\"Search\" value=\"");
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
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"col\">Number</th>\n");
      out.write("                            <th scope=\"col\">Name</th>\n");
      out.write("                            <th scope=\"col\">Gender</th>\n");
      out.write("                            <th scope=\"col\">Address</th>\n");
      out.write("                            <th scope=\"col\">Email</th>\n");
      out.write("                            <th scope=\"col\">Phone</th>\n");
      out.write("                            <th scope=\"col\">Birthday</th>\n");
      out.write("                            <th scope=\"col\">Status</th>\n");
      out.write("                            <th scope=\"col\">Role</th>\n");
      out.write("                            <th scope=\"col\">\n");
      out.write("                                <button type=\"button\" class=\"btn btn-default btn-sm btn-success\"\n");
      out.write("                                        onclick=\"location.href = 'Employees-new.jsp?page=");
      out.print(p);
      out.write("&s=");
      out.print(s);
      out.write("'\">\n");
      out.write("                                    <span class=\"glyphicon glyphicon-plus\"></span>\n");
      out.write("                                </button>\n");
      out.write("                            </th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                            int sp_no = (p - 1) * elem.SoDong_Trang;
                            String genDer;
                            String Status;
                            for (int i = 0; i < ele.size(); i++) {
                                genDer = ele.get(i).getGenderEmployees() == 1 ? "<i class='fa fa-mars text-success'></i>"
                                        : "<i class='fa fa-venus text-danger' ></i> ";

                                Status = ele.get(i).getStatusEmployees() == 2 ? "<span class='glyphicon glyphicon-remove-sign text-danger'></span>"
                                        : "<span class='glyphicon glyphicon-ok-circle text-success'></span> ";
                                ++sp_no;

                        
      out.write("\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"col\">");
      out.print(sp_no);
      out.write("</th>\n");
      out.write("                            <th>");
      out.print(ele.get(i).getNameEmployees());
      out.write("</th>\n");
      out.write("                            <th scope=\"col\">");
      out.print(genDer);
      out.write("</th>\n");
      out.write("                            <th scope=\"col\">");
      out.print(ele.get(i).getAddressEmployees());
      out.write("</th>\n");
      out.write("                            <th scope=\"col\">");
      out.print(ele.get(i).getMailEmployees());
      out.write("</th>\n");
      out.write("                            <th scope=\"col\">");
      out.print(ele.get(i).getPhoneEmployees());
      out.write("</th>\n");
      out.write("                            <th scope=\"col\">");
      out.print(ele.get(i).getBirthdayEmployees());
      out.write("</th>\n");
      out.write("                            <th scope=\"col\">");
      out.print(Status);
      out.write("</th>\n");
      out.write("                            <th scope=\"col\">");
      out.print(ele.get(i).getRoleName());
      out.write("</th>\n");
      out.write("\n");
      out.write("                            <th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <button type=\"button\" class=\"btn btn-default btn-sm btn-danger\"\n");
      out.write("                                        onclick=\"if (confirm('Do you really want delete flower ");
      out.print(ele.get(i).getNameEmployees());
      out.write("'))\n");
      out.write("                                                    location.href = 'Employees-delete.jsp?id=");
      out.print(ele.get(i).getIdEmployees());
      out.write("&page=");
      out.print(p);
      out.write("&s=");
      out.print(s);
      out.write("'\">\n");
      out.write("                                    <span class=\"glyphicon glyphicon-trash\"></span>\n");
      out.write("                                </button>\n");
      out.write("\n");
      out.write("                            </th>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"9\" align=\"center\">");
      out.print(elem.getPagingString(p, s, sortColumn));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
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
      out.write("                        //                                    container.classList.add('container-right');\n");
      out.write("                        status = !status;\n");
      out.write("                    } else {\n");
      out.write("                        nav.classList.remove('nav-show');\n");
      out.write("                        btnToggle.classList.remove('fa-times');\n");
      out.write("                        btnToggle.classList.add('fa-bars');\n");
      out.write("                        //                                    container.classList.remove('container-right');\n");
      out.write("                        status = !status;\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("            }, false);\n");
      out.write("\n");
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
