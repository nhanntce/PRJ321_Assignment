package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ObjectInfo.District;
import Model.DistrictsModel;
import ObjectInfo.Typee;
import java.util.ArrayList;
import Model.TypesModel;

public final class product_002dnew_002dadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    //load type
    TypesModel tm = new TypesModel();
    //store type
    ArrayList<Typee> types = tm.loadTypes();
    //load District
    DistrictsModel dm = new DistrictsModel();
    //store district
    ArrayList<District> dts = dm.loadDistricts();



      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Login</title>\n");
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
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"text-center title\">\n");
      out.write("                <h2><strong>Add new product</strong></h2>\n");
      out.write("            </div>\n");
      out.write("            <form action=\"product-new-save-admin.jsp\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Description</label>\n");
      out.write("                    <textarea type=\"text\" class=\"form-control\" placeholder=\"Description...\" name=\"description\" autofocus required></textarea>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Price</label>\n");
      out.write("                    <input type=\"number\" class=\"form-control\" placeholder=\"Price...\" name=\"price\" required step=\"any\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Area</label>\n");
      out.write("                    <input type=\"number\" class=\"form-control\" placeholder=\"Area...\" name=\"area\" required step=\"any\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <label>Type</label>\n");
      out.write("                            <select class=\"form-control\" name=\"typee\" required>\n");
      out.write("                                ");
                                    for (Typee type : types) {

                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(type.getIdType());
      out.write('"');
      out.write('>');
      out.print(type.getNameType());
      out.write("</option>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <label>District</label>\n");
      out.write("                            <select class=\"form-control\" name=\"district\" required>\n");
      out.write("                                ");

                                    for (District dt : dts) {

                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(dt.getIdDistrict());
      out.write('"');
      out.write('>');
      out.print(dt.getNameDistrict());
      out.write("</option>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Position</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Position...\" name=\"position\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Shape</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Shape...\" name=\"shape\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Direction</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Direction...\" name=\"direction\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Juridical</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Juridical...\" name=\"juridical\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Right of way</label>\n");
      out.write("                    <input type=\"number\" class=\"form-control\" placeholder=\"Right of way...\" name=\"right-of-way\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>Picture</label><br>\n");
      out.write("                    <input type=\"file\" name=\"file1\" required multiple=\"multiple\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"text-center\">\n");
      out.write("                    <input class=\"btn btn-primary btn-block\" type=\"submit\" name=\"submit\" value=\"Submit\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            document.addEventListener(\"DOMContentLoaded\", function () {\n");
      out.write("\n");
      out.write("            }, false);\n");
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
