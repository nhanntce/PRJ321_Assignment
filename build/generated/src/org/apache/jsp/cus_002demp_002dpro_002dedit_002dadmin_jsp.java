package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ObjectInfo.CusEmpPro;
import Model.CusEmProModel;
import ObjectInfo.Employees;
import ObjectInfo.Customer;
import ObjectInfo.Image;
import java.util.ArrayList;
import Model.ImageModel;
import java.text.SimpleDateFormat;
import ObjectInfo.Product;
import Model.ProductModel;
import Model.CustomerModel;
import Model.EmployeeModel;

public final class cus_002demp_002dpro_002dedit_002dadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

    int p = 1;
    String search = "";
    int idProduct = 1;
    int idEmployee = 0;
    int idCustomer = 40;
    int idCusEmpPro = 1;
    if (request.getParameter("page") != null) {
        p = Integer.parseInt(request.getParameter("page"));
    }
    if (request.getParameter("s") != null) {
        search = request.getParameter("s");
    }
    if (request.getParameter("idCusEmpPro") != null) {
        idCusEmpPro = Integer.parseInt(request.getParameter("idCusEmpPro"));
    }
    
    CusEmProModel cepm = new CusEmProModel();
    CusEmpPro cep = cepm.getCusEmpPro(idCusEmpPro);
    EmployeeModel em = new EmployeeModel();
    CustomerModel cm = new CustomerModel();
    ProductModel pm = new ProductModel();
    ImageModel im = new ImageModel();
    Product product = pm.getProduct(idProduct);
    Customer customer = cm.getCustomerbyId(cep.getIdCustomer());
    Employees employee = em.getEmployees(cep.getIdEmployees());
    String dateStr = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy").format(product.getPublicTime());
    

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Customer - Product - Employee detail</title>\n");
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
      out.write("                text-transform: uppercase;\n");
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
      out.write("\n");
      out.write("            .title-con {\n");
      out.write("                margin: 10px 0;\n");
      out.write("                color: #37a344;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .back {\n");
      out.write("                margin-top: 30px; \n");
      out.write("            }\n");
      out.write("            .descript, .client, .employee {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 30px;\n");
      out.write("                height: auto;\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                <div class=\"title\">\n");
      out.write("                    <h2><strong>Customer - Product - Employee detail</strong></h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <form action=\"cus-emp-pro-edit-save.jsp\" method=\"GET\">\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print(idCusEmpPro);
      out.write("\" name=\"idCusEmpPro\">\n");
      out.write("                <label>Description</label>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <textarea class=\"form-control\" name=\"description\"></textarea>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Save</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <div class=\"title-con\">\n");
      out.write("                <h3>Detail Customer's information</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"client\">\n");
      out.write("                <p>-Name: ");
      out.print(customer.getNameCustomer());
      out.write("</p>\n");
      out.write("                <p>-Phone: ");
      out.print(customer.getPhoneCustomer());
      out.write("</p>\n");
      out.write("                <p>-Email: ");
      out.print(customer.getMail());
      out.write("</p>\n");
      out.write("                <p>-DOB: ");
      out.print(customer.getBirthdayCustomer());
      out.write("</p>\n");
      out.write("                <p>");

                    if (customer.getGenderCustomer() == 1) {
                        out.println("-Gender: Male");
                    } else {
                        out.println("-Gender: Female");
                    }
                    
      out.write("</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"title-con\">\n");
      out.write("                <h3>Detail product's information</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"descript\">\n");
      out.write("                <p>- ");
      out.print(product.getDescript());
      out.write("</p>\n");
      out.write("                <p>- Price: ");
      out.print(product.getPrice());
      out.write("</p>\n");
      out.write("                <p>- Area: ");
      out.print(product.getSquare());
      out.write("m</p>\n");
      out.write("                <p>- Type: ");
      out.print(product.getNameType());
      out.write("</p>\n");
      out.write("                <p>- District: ");
      out.print(product.getNameDistrict());
      out.write("</p>\n");
      out.write("                <p>- Position: ");
      out.print(product.getPosition());
      out.write("</p>\n");
      out.write("                <p>- Shape: ");
      out.print(product.getShape());
      out.write("</p>\n");
      out.write("                <p>- Direction: ");
      out.print(product.getDirection());
      out.write("</p>\n");
      out.write("                <p>- Juridical: ");
      out.print(product.getJuridical());
      out.write("</p>\n");
      out.write("                <p>- Right of way: ");
      out.print(product.getRightOfWay());
      out.write("m</p>\n");
      out.write("                <p>- Public time: ");
      out.print(dateStr);
      out.write("</p>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("            <div class=\"back\">\n");
      out.write("                <!--<a href=\"cus-emp-pro-admin.jsp?page=");
      out.print(p);
      out.write("&s=");
      out.print(search);
      out.write("&idP=");
      out.print(idProduct);
      out.write("&idC=");
      out.print(idCustomer);
      out.write("&idE=");
      out.print(idEmployee);
      out.write("\" class=\"btn btn-primary\"><i class=\"fa fa-chevron-left\"></i></a>-->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
