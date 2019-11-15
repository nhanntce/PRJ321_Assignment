package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.CusEmProModel;
import java.sql.Date;
import MyUltis.DBConnection;
import Model.CustomerModel;
import java.sql.Connection;

public final class Customer_002dnew_002dsave_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    Connection con = DBConnection.getConnection();
    CustomerModel CM = new CustomerModel(con);
    String cusName = "";
    String cusMail = "";
    String cusPhone = "";
    Date cusBirthday = new Date(2019/01/01);
    int cusGender = 1;
    int idProduct = 1;
    int p = 1;
    int district = 0;
    int priceFrom = 0;
    int priceTo = 0;
    int areaFrom = 0;
    int areaTo = 0;
    if (request.getParameter("id") != null) {
        idProduct = Integer.parseInt(request.getParameter("id"));
    }
    if (request.getParameter("page") != null) {
        p = Integer.parseInt(request.getParameter("page"));
    }
    if (request.getParameter("d") != null) {
        district = Integer.parseInt(request.getParameter("d"));
    }
    if (request.getParameter("pf") != null && !request.getParameter("pf").trim().equals("")) {
        priceFrom = Integer.parseInt(request.getParameter("pf"));
    }
    if (request.getParameter("pt") != null && !request.getParameter("pt").trim().equals("")) {
        priceTo = Integer.parseInt(request.getParameter("pt"));
    }
    if (request.getParameter("af") != null && !request.getParameter("af").trim().equals("")) {
        areaFrom = Integer.parseInt(request.getParameter("af"));
    }
    if (request.getParameter("at") != null && !request.getParameter("at").trim().equals("")) {
        areaTo = Integer.parseInt(request.getParameter("at"));
    }
    if (request.getParameter("cusName") != null) {
        cusName = request.getParameter("cusName");
    }
    if (request.getParameter("cusMail") != null) {
        cusMail = request.getParameter("cusMail");
    }
    if (request.getParameter("cusPhone") != null) {
        cusPhone = request.getParameter("cusPhone");
    }
    if (request.getParameter("cusGender") != null) {
        cusGender = Integer.parseInt(request.getParameter("cusGender"));
    }
    if (request.getParameter("cusBirth") != null) {
        cusBirthday = Date.valueOf(request.getParameter("cusBirth")) ;
    }
    CusEmProModel cepm = new CusEmProModel();
    int idCustomer = 1;
    if (CM.getCustomerByPhone(cusPhone) == null) {
        idCustomer = CM.insert(cusName, cusMail, cusPhone, cusBirthday, cusGender);

    } else {
        idCustomer =  CM.getCustomerByPhone(cusPhone).getIdCustomer();
    }
    cepm.insertFromClient(idProduct, idCustomer);
    String strRes = "product-detail-detail-client.jsp?page=" + p + "&d=" + district + "&pf=" + priceFrom + "&pt=" + priceTo
            + "&af=" + areaFrom + "&at=" + areaTo + "&id=" + idProduct;
    response.sendRedirect(strRes);

      out.write('\n');
      out.write('\n');
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
