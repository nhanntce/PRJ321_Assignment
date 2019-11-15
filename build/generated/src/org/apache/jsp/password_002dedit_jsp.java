package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ObjectInfo.Employees;
import MyUltis.DBConnection;
import Model.EmployeeModel;
import java.sql.Connection;
import java.sql.Connection;

public final class password_002dedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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


    int id = 1;
    int num = 1;
    if(request.getParameter("num") != null)
        num = Integer.parseInt(request.getParameter("num"));
    if (request.getParameter("id") != null) {
        id = Integer.parseInt(request.getParameter("id"));
    }

    Connection con = DBConnection.getConnection();
//    EmployeeModel em = new EmployeeModel();
//    Employees ele = em.getEmployees(id);
//    String pw = ele.getPassworkEmployees();



      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"icon\" type=\"icon\" href=\"images/logo.png\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"password-edit-save.jsp\" onsubmit=\"return checkPass()\">\n");
      out.write("            <input type=\"hidden\" name=\"id\" value=\"");
      out.print(id);
      out.write("\">\n");
      out.write("            <input type=\"hidden\" name=\"num\" value=\"");
      out.print(num);
      out.write("\">\n");
      out.write("            <div class=\"form-group row\">\n");
      out.write("                <label class=\"col-4 col-form-label\" for=\"cusName\">New Password* :</label>\n");
      out.write("                <div class=\"col-8\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("\n");
      out.write("                            <div class=\"input-group-text\">\n");
      out.write("                                <i class=\"fa fa-exclamation-circle\"></i>\n");
      out.write("                            </div>\n");
      out.write("                        </div> \n");
      out.write("                        <input id=\"password\" name=\"password\" placeholder=\"Enter new password\" type=\"text\" class=\"form-control\"\n");
      out.write("                               required title=\"new password must not be blank and must be made up of letters\">    \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group row\">\n");
      out.write("                <label class=\"col-4 col-form-label\" for=\"cusName\"> Confirm Password* :</label>\n");
      out.write("                <div class=\"col-8\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("\n");
      out.write("                            <div class=\"input-group-text\">\n");
      out.write("                                <i class=\"fa fa-exclamation-circle\"></i>\n");
      out.write("                            </div> \n");
      out.write("                        </div> \n");
      out.write("                        <input id=\"password1\" name=\"password1\" placeholder=\"Confirm password\" type=\"text\" class=\"form-control\"\n");
      out.write("                               required title=\"confirm password must not be blank and must be made up of letters\">  <br>                      \n");
      out.write("                    </div>\n");
      out.write("                    <p id=\"error\"></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\" style=\"position: relative;\">\n");
      out.write("                <div class=\"p-chang\">\n");
      out.write("                    <button type=\"summit\" class=\"btn btn-default btn-sm btn-primary\" style=\"position: absolute; left: 50%;\">CONFIRM</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function checkPass() {\n");
      out.write("                var passOne = document.getElementById(\"password\").value;\n");
      out.write("                var passTwo = document.getElementById(\"password1\").value;\n");
      out.write("                if (passOne !== passTwo) {\n");
      out.write("                    document.getElementById(\"error\").innerHTML = \"aaaaaaaa\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
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
