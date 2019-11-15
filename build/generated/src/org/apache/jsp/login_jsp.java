package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String warning = "";
    if (session.getAttribute("warning") != null) {
        warning = (String) session.getAttribute("warning");
    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"icon\" type=\"icon\" href=\"images/logo.png\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            /* \n");
      out.write("                Created on : Nov 5, 2019, 3:16:00 PM\n");
      out.write("                Author     : NhanNT\n");
      out.write("            */\n");
      out.write("            *{\n");
      out.write("                font-family:  Candara;\n");
      out.write("            }\n");
      out.write("            .login-block{\n");
      out.write("                background: #DE6262;  /* fallback for old browsers */\n");
      out.write("                background: -webkit-linear-gradient(to bottom, #FFB88C, #DE6262);  /* Chrome 10-25, Safari 5.1-6 */\n");
      out.write("                background: linear-gradient(to bottom, #FFB88C, #DE6262); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */\n");
      out.write("                float:left;\n");
      out.write("                width:100%;\n");
      out.write("                padding : 50px 0;\n");
      out.write("            }\n");
      out.write("            .banner-sec{background:url(https://static.pexels.com/photos/33972/pexels-photo.jpg)  no-repeat left bottom; background-size:cover; min-height:500px; border-radius: 0 10px 10px 0; padding:0;}\n");
      out.write("            .container{background:#fff; border-radius: 10px; box-shadow:15px 20px 0px rgba(0,0,0,0.1);}\n");
      out.write("            .carousel-inner{border-radius:0 10px 10px 0;}\n");
      out.write("            .carousel-caption{text-align:left; left:5%;}\n");
      out.write("            .login-sec{padding: 50px 30px; position:relative;}\n");
      out.write("            .login-sec .copy-text{position:absolute; width:80%; bottom:20px; font-size:13px; text-align:center;}\n");
      out.write("            .login-sec .copy-text i{color:#FEB58A;}\n");
      out.write("            .login-sec .copy-text a{color:#E36262;}\n");
      out.write("            .login-sec h2{margin-bottom:30px; font-weight:800; font-size:30px; color: #DE6262;}\n");
      out.write("            .login-sec h2:after{content:\" \"; width:100px; height:5px; background:#FEB58A; display:block; margin-top:20px; border-radius:3px; margin-left:auto;margin-right:auto}\n");
      out.write("            .btn-login{background: #DE6262; color:#fff; font-weight:600;}\n");
      out.write("            .banner-text{width:70%; position:absolute; bottom:40px; padding-left:20px;}\n");
      out.write("            .banner-text h2{color:#fff; font-weight:600;}\n");
      out.write("            .banner-text h2:after{content:\" \"; width:100px; height:5px; background:#FFF; display:block; margin-top:20px; border-radius:3px;}\n");
      out.write("            .banner-text p{color:#fff;}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"login-block\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4 login-sec\">\n");
      out.write("                        <h2 class=\"text-center\">Login Now</h2>\n");
      out.write("                        <form class=\"login-form\" action=\"login-process.jsp\" method=\"post\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleInputEmail1\" class=\"text-uppercase\">Username</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"\" name=\"txtUsername\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleInputPassword1\" class=\"text-uppercase\">Password</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" placeholder=\"\" name=\"txtPassword\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <p style=\"color: #f00;\">");
      out.print(warning);
      out.write("  </p>\n");
      out.write("                            <div class=\"form-check\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-login float-right\">Submit</button>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                        <div class=\"copy-text\">Created with <i class=\"fa fa-heart\"></i> by <a href=\"http://grafreez.com\">Grafreez.com</a></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-8 banner-sec\">\n");
      out.write("                        <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                            \n");
      out.write("                            <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                                <div class=\"carousel-item active\">\n");
      out.write("                                    <img class=\"d-block img-fluid\" src=\"https://static.pexels.com/photos/33972/pexels-photo.jpg\" alt=\"First slide\">\n");
      out.write("                                    <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                            </div>\t   \n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        </section>\n");
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
