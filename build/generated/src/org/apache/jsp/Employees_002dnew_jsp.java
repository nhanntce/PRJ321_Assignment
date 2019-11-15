package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import MyUltis.DBConnection;
import java.sql.Connection;
import org.hibernate.validator.constraints.Email;
import Model.EmployeeModel;
import ObjectInfo.Employees;
import java.util.ArrayList;
import ObjectInfo.Role;
import Model.RoleModel;

public final class Employees_002dnew_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");

    RoleModel rl = new RoleModel();
    ArrayList<Role> role = rl.getRole();

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Employee</title>\n");
      out.write("        <link rel=\"icon\" type=\"icon\" href=\"images/logo.png\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                <h4>Add Employee</h4>\n");
      out.write("            </div>\n");
      out.write("            <form action=\"Employees-new-save.jsp\" method=\"post\" onsubmit=\"return validation()\">\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label class=\"col-4 col-form-label\" for=\"cusName\">Name* :</label> \n");
      out.write("                    <div class=\"col-8\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <div class=\"input-group-prepend\">\n");
      out.write("\n");
      out.write("                                <div class=\"input-group-text\">\n");
      out.write("                                    <i class=\"fa fa-address-card\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("                            <input id=\"cusName\" name=\"name\" placeholder=\"Enter your name\" type=\"text\" class=\"form-control\"\n");
      out.write("                                   required title=\"Name must not be blank and must be made up of letters\">    \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label class=\"col-4 col-form-label\" for=\"cusName\">Address* :</label> \n");
      out.write("                    <div class=\"col-8\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <div class=\"input-group-prepend\">\n");
      out.write("\n");
      out.write("                                <div class=\"input-group-text\">\n");
      out.write("                                    <i class=\"fa fa-institution\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("                            <input id=\"address\" name=\"address\" placeholder=\"Enter your address\" type=\"text\" class=\"form-control\"\n");
      out.write("                                   required title=\"Address must not be blank and must be made up of letters\">    \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"cusMail\" class=\"col-4 col-form-label\">Mail* :</label> \n");
      out.write("                    <div class=\"col-8\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <div class=\"input-group-prepend\">\n");
      out.write("                                <div class=\"input-group-text\">\n");
      out.write("                                    <i class=\"fa fa-envelope\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("                            <input id=\"cusMail\" name=\"mail\" placeholder=\"Enter your Mail\" type=\"text\" class=\"form-control\" pattern=\"/^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$/\"\n");
      out.write("                                   required aria-describedby=\"cusMailHelpBlock\" required title=\"Mail must not be blank and must be made up of letters\">\n");
      out.write("                        </div> \n");
      out.write("                        <span id=\"cusMailHelpBlock\" class=\"form-text text-muted\">@gmail.com, @fpt.edu.vn, ...</span>\n");
      out.write("                        <p id=\"mailE\" style=\"color: #f00;\"></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"cusPhone\" class=\"col-4 col-form-label\">Phone Number* :</label> \n");
      out.write("                    <div class=\"col-8\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <div class=\"input-group-prepend\">\n");
      out.write("                                <div class=\"input-group-text\">\n");
      out.write("                                    <i class=\"fa fa-phone\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("                            <input id=\"cusPhone\" name=\"phone\" placeholder=\"Enter your phone number\" type=\"text\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <p id=\"phoneE\" style=\"color: #f00;\"></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"cusBirth\" class=\"col-4 col-form-label\">BirthDay :</label>\n");
      out.write("                    <div class=\"col-8\">\n");
      out.write("                        <input type=\"date\" name=\"birthday\" required>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label class=\"col-4\">Gender* :</label> \n");
      out.write("                    <div class=\"col-8\">\n");
      out.write("                        <input type=\"radio\" id=\"male\" name=\"gender\" value=\"1\" checked> Male<br>\n");
      out.write("                        <input type=\"radio\" id=\"female\" name=\"gender\" value=\"2\"> Female<br>\n");
      out.write("                    </div>  \n");
      out.write("                </div> \n");
      out.write("\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label class=\"col-4 col-form-label\" for=\"cusName\">Account* :</label> \n");
      out.write("                    <div class=\"col-8\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <div class=\"input-group-prepend\">\n");
      out.write("\n");
      out.write("                                <div class=\"input-group-text\">\n");
      out.write("                                    <i class=\"fa fa-address-book\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("                            <input id=\"acount\" name=\"account\" placeholder=\"Enter your account\" type=\"text\" class=\"form-control\"\n");
      out.write("                                   required title=\"Account must not be blank and must be made up of letters\">    \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label class=\"col-4 col-form-label\" for=\"cusName\">Password* :</label> \n");
      out.write("                    <div class=\"col-8\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <div class=\"input-group-prepend\">\n");
      out.write("\n");
      out.write("                                <div class=\"input-group-text\">\n");
      out.write("                                    <i class=\"fa fa-exclamation-circle\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("                            <input id=\"pass\" name=\"password\" placeholder=\"Enter your password\" type=\"password\" class=\"form-control\"\n");
      out.write("                                   required title=\"Password must not be blank and must be made up of letters\">    \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"select\" class=\"col-4 col-form-label\">Role</label> \n");
      out.write("                    <div class=\"col-8\">\n");
      out.write("                        <select id=\"select\" name=\"role\" class=\"custom-select\">\n");
      out.write("                            ");

                                for (Role r : role) {


                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(r.getIdRole());
      out.write('"');
      out.write('>');
      out.print(r.getRoleName());
      out.write("</option>\n");
      out.write("\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <div class=\"offset-4 col-8\">\n");
      out.write("                        <button name=\"submit\" type=\"submit\" class=\"btn btn-primary\">Add</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("                        <!--<button onclick=\"validation()\">hhhhhhhh</button>-->          \n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("           \n");
      out.write("            function validation() {\n");
      out.write("                console.log(\"hoang ml\");\n");
      out.write("                document.getElementById(\"phoneE\").value = \"Phone is invalid!\";\n");
      out.write("                var phone = document.getElementById(\"cusPhone\");\n");
      out.write("                var mail = document.getElementById(\"cusMail\");\n");
      out.write("                var phoneCheck = /((09|03|07|08|05)+[0-9]{8})$/i.test(phone.value);\n");
      out.write("                var emailCheck = /^(([^<>()[\\]\\\\.,;:\\s@\\\"]+(\\.[^<>()[\\]\\\\.,;:\\s@\\\"]+)*)|(\\\".+\\\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$/i.test(mail.value);\n");
      out.write("                if(!phoneCheck || !emailCheck){\n");
      out.write("                    if(!phoneCheck){\n");
      out.write("                        document.getElementById(\"phoneE\").innerHTML = \"Phone is invalid!\";\n");
      out.write("                    }\n");
      out.write("                    if(!emailCheck){\n");
      out.write("                        document.getElementById(\"mailE\").innerHTML = \"Email is invalid!\";\n");
      out.write("                    }\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                return false;\n");
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
