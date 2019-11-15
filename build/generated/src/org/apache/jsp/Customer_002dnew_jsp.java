package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.CustomerModel;
import MyUltis.DBConnection;
import java.sql.Connection;
import java.sql.Connection;

public final class Customer_002dnew_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    Connection con = DBConnection.getConnection();
    CustomerModel CM = new CustomerModel(con);

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/ui/1.11.3/jquery-ui.js\"></script>\n");
      out.write("        <script src=\"http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js\"></script> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <title>Add Customer</title>   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <form action=\"Customer-new-save.jsp\" method=\"post\" style=\"width:600px;margin: 0px auto\" id=\"cusAdd\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <div class=\"text-center title\">\n");
      out.write("                        <h2><strong>Add new Customer</strong></h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label class=\"col-4 col-form-label\" for=\"cusName\">Name* :</label> \n");
      out.write("                        <div class=\"col-8\">\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <div class=\"input-group-prepend\">\n");
      out.write("\n");
      out.write("                                    <div class=\"input-group-text\">\n");
      out.write("                                        <i class=\"fa fa-address-card\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div> \n");
      out.write("                                <input id=\"cusName\" name=\"cusName\" placeholder=\"Enter your name\" type=\"text\" class=\"form-control\" title=\"\">    \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label for=\"cusMail\" class=\"col-4 col-form-label\">Email* :</label> \n");
      out.write("                        <div class=\"col-8\">\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <div class=\"input-group-prepend\">\n");
      out.write("                                    <div class=\"input-group-text\">\n");
      out.write("                                        <i class=\"fa fa-envelope\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div> \n");
      out.write("                                <input id=\"cusMail\" name=\"cusMail\" type=\"text\" class=\"form-control\"\n");
      out.write("                                       aria-describedby=\"cusMailHelpBlock\">\n");
      out.write("                            </div> \n");
      out.write("                            <span id=\"cusMailHelpBlock\" class=\"form-text text-muted\">@gmail.com, @fpt.edu.vn, ...</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label for=\"cusPhone\" class=\"col-4 col-form-label\">Phone Number* :</label> \n");
      out.write("                        <div class=\"col-8\">\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <div class=\"input-group-prepend\">\n");
      out.write("                                    <div class=\"input-group-text\">\n");
      out.write("                                        <i class=\"fa fa-phone\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div> \n");
      out.write("                                <input id=\"cusPhone\" name=\"cusPhone\" placeholder=\"Enter your phone number\" type=\"text\" \n");
      out.write("                                       class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label for=\"cusBirth\" class=\"col-4 col-form-label\">BirthDay :</label>\n");
      out.write("                        <div class=\"col-2\">\n");
      out.write("                            <input type=\"date\" id=\"cusBirth\" name=\"cusBirth\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <label class=\"col-4\">Gender* :</label> \n");
      out.write("                        <div class=\"col-8\">\n");
      out.write("                            <input type=\"radio\" id=\"cusGender\" name=\"cusGender\" value=\"1\" checked> Male<br>\n");
      out.write("                            <input type=\"radio\" id=\"cusGender\" name=\"cusGender\" value=\"2\"> Female<br>\n");
      out.write("                        </div>  \n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <div class=\"offset-4 col-8\">\n");
      out.write("                            <button name=\"submit\" type=\"submit\" class=\"btn btn-primary\">Add</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </fieldset>\n");
      out.write("            </form>   \n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("//            var input = document.getElementById(\"cusName\");\n");
      out.write("//            input.oninvalid = function (event) {\n");
      out.write("//                event.target.setCustomValidity('Name must not be blank and must be made up of letters');\n");
      out.write("//            };\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"#cusAdd\").validate({\n");
      out.write("                    rule: {\n");
      out.write("                        cusName: {\n");
      out.write("                            required: true\n");
      out.write("                        },\n");
      out.write("                        cusMail: {\n");
      out.write("                            regexEmail: true,\n");
      out.write("                            required: true\n");
      out.write("                        },\n");
      out.write("                        cusPhone: {\n");
      out.write("                            regexPhone: true,\n");
      out.write("                            required: true,\n");
      out.write("                            digits: true,\n");
      out.write("                            minlength: 10,\n");
      out.write("                            maxlength: 11\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    messages: {\n");
      out.write("                        cusName: {\n");
      out.write("                            required: \"Name not be emty\"\n");
      out.write("                        },\n");
      out.write("                        cusMail: {\n");
      out.write("                            regexEmail: \"Email invalid\",\n");
      out.write("                            required: \"Email not be empty\"\n");
      out.write("                        },\n");
      out.write("                        cusPhone: {\n");
      out.write("                            regexPhone: \"Phone number invalid\",\n");
      out.write("                            required: \"Phone number not be empty\",\n");
      out.write("                            digits: \"Phone number must be digits\",\n");
      out.write("                            minlength: \"The phone number you entered is too short\",\n");
      out.write("                            maxlength: \"The phone number you entered is too long\"\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("            $.validator.addMethod(\"regexPhone\", function (value, element) {\n");
      out.write("                return this.optional(element) || /((09|03|07|08|05)+[0-9]{8})$/i.test(value);\n");
      out.write("            });\n");
      out.write("            $.validator.addMethod(\"regexEmail\", function (value, element) {\n");
      out.write("                return this.optional(element) || /^(([^<>()[\\]\\\\.,;:\\s@\\\"]+(\\.[^<>()[\\]\\\\.,;:\\s@\\\"]+)*)|(\\\".+\\\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$/i.test(value);\n");
      out.write("            });\n");
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
