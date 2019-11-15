package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.sql.Date;
import ObjectInfo.Employees;
import Model.EmployeeModel;
import MyUltis.DBConnection;
import java.sql.Connection;
import java.util.ArrayList;
import ObjectInfo.Role;
import Model.RoleModel;

public final class Employees_002dedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");

    int id = 0;
    int num = 1;
    if(request.getParameter("num") != null)
        num = Integer.parseInt(request.getParameter("num"));
    if(request.getParameter("id") != null)
        id = Integer.parseInt(request.getParameter("id"));

    Connection con = DBConnection.getConnection();
    EmployeeModel em = new EmployeeModel();
    Employees ele = em.getEmployees(id);
    int gd = ele.getGenderEmployees();
    int ir = ele.getIdRole();
    String rName = ele.getRoleName();
    Date d = ele.getBirthdayEmployees();
    Calendar cld = new GregorianCalendar();
    cld.setTime(d);
    int year = cld.get(Calendar.YEAR);
    int month = cld.get(Calendar.MONTH) + 1;
    int day = cld.get(Calendar.DAY_OF_MONTH);



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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                <h4>Edit Employee</h4>\n");
      out.write("            </div>\n");
      out.write("            <form action=\"Employees-edit-save.jsp\" method=\"post\">\n");
      out.write("                <input type=\"hidden\" name=\"id\" value=\"");
      out.print(id);
      out.write("\">\n");
      out.write("                <input type=\"hidden\" name=\"num\" value=\"");
      out.print(num);
      out.write("\">\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label class=\"col-4 col-form-label\">Name* :</label> \n");
      out.write("                    <div class=\"col-8\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <div class=\"input-group-prepend\">\n");
      out.write("\n");
      out.write("                                <div class=\"input-group-text\">\n");
      out.write("                                    <i class=\"fa fa-address-card\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("                            <input id=\"name\" name=\"name\" placeholder=\"Enter your name\" type=\"text\" class=\"form-control\"\n");
      out.write("                                   required title=\"Name must not be blank and must be made up of letters\" value=\"");
      out.print(ele.getNameEmployees());
      out.write("\">    \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label class=\"col-4 col-form-label\">Address* :</label> \n");
      out.write("                    <div class=\"col-8\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <div class=\"input-group-prepend\">\n");
      out.write("\n");
      out.write("                                <div class=\"input-group-text\">\n");
      out.write("                                    <i class=\"fa fa-institution\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("                            <input id=\"cusName\" name=\"address\" placeholder=\"Enter your address\" type=\"text\" class=\"form-control\"\n");
      out.write("                                   required title=\"Address must not be blank and must be made up of letters\" value=\"");
      out.print(ele.getAddressEmployees());
      out.write("\">    \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label class=\"col-4 col-form-label\">Mail* :</label> \n");
      out.write("                    <div class=\"col-8\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <div class=\"input-group-prepend\">\n");
      out.write("                                <div class=\"input-group-text\">\n");
      out.write("                                    <i class=\"fa fa-envelope\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("                            <input id=\"cusMail\" name=\"mail\" type=\"text\" class=\"form-control\" pattern=\"/^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$/\"\n");
      out.write("                                   required aria-describedby=\"cusMailHelpBlock\" value=\"");
      out.print(ele.getMailEmployees());
      out.write("\">\n");
      out.write("                        </div> \n");
      out.write("                        <span id=\"cusMailHelpBlock\" class=\"form-text text-muted\">@gmail.com, @fpt.edu.vn, ...</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"cusPhone\" class=\"col-4 col-form-label\">Phone Number* :</label> \n");
      out.write("                    <div class=\"col-8\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <div class=\"input-group-prepend\">\n");
      out.write("                                <div class=\"input-group-text\">\n");
      out.write("                                    <i class=\"fa fa-phone\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("                            <input id=\"cusPhone\" name=\"phone\" placeholder=\"Enter your phone number\" type=\"text\" class=\"form-control\" value=\"");
      out.print(ele.getPhoneEmployees());
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"cusBirth\" class=\"col-4 col-form-label\">BirthDay :</label>\n");
      out.write("                    <div class=\"col-2\">\n");
      out.write("                        <select id=\"cusDayofBirth\" name=\"DayofBirth\" class=\"custom-select\">\n");
      out.write("                            ");
                                for (int i = 1; i <= 31; i++) {
                            
      out.write("\n");
      out.write("                            <option value=");
      out.print(i);
      out.write('>');
      out.print(i);
      out.write("</option>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-2\">\n");
      out.write("                        <select id=\"cusMonthofBirth\" name=\"MonthofBirth\" class=\"custom-select\">\n");
      out.write("                            ");

                                for (int i = 1; i <= 12; i++) {
                            
      out.write("\n");
      out.write("                            <option value=");
      out.print(i);
      out.write('>');
      out.print(i);
      out.write("</option>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-3\">\n");
      out.write("                        <select id=\"cusYearofBirth\" name=\"YearofBirth\" class=\"custom-select\">\n");
      out.write("                            ");

                                for (int i = 1920; i <= 2019; i++) {
                            
      out.write("\n");
      out.write("                            <option value=");
      out.print(i);
      out.write('>');
      out.print(i);
      out.write("</option>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label class=\"col-4\">Gender* :</label> \n");
      out.write("                    <div class=\"col-8\">\n");
      out.write("                        ");

                            String gen = "";
                            if (gd == 1) {


                        
      out.write("\n");
      out.write("                        ");
      out.print(gen);
      out.write("<input type=\"radio\" id=\"cusGender\" name=\"gender\" value=\"1\" checked> Male\n");
      out.write("                        <input type=\"radio\" id=\"cusGender\" name=\"gender\" value=\"2\"> Female\n");
      out.write("                    </div>  \n");
      out.write("                    ");

                    } else {
                    
      out.write("\n");
      out.write("                    ");
      out.print(gen);
      out.write("<input type=\"radio\" id=\"cusGender\" name=\"gender\" value=\"1\"> Male\n");
      out.write("                    <input type=\"radio\" id=\"cusGender\" name=\"gender\" value=\"2\"  checked> Female\n");
      out.write("                </div>  \n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                <div class=\"form-group\" style=\"position: relative; width: 100%;\">\n");
      out.write("                    <button name=\"submit\" type=\"submit\" class=\"btn btn-primary\" style=\"position: absolute;left: 50%;\">Add</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            document.getElementById(\"cusGender\").value = ");
      out.print(gd);
      out.write(";\n");
      out.write("            document.getElementById(\"cusYearofBirth\").value = ");
      out.print(year);
      out.write(";\n");
      out.write("            document.getElementById(\"cusMonthofBirth\").value = ");
      out.print(month);
      out.write(";\n");
      out.write("            document.getElementById(\"cusDayofBirth\").value = ");
      out.print(day);
      out.write(";\n");
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
