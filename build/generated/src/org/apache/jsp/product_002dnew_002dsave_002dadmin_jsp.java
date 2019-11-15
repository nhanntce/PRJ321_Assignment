package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.ImageModel;
import Model.ProductModel;
import java.io.File;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public final class product_002dnew_002dsave_002dadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    List<FileItem> multiparts = null;
    final String UPLOAD_DIRECTORY = "D:/Java Web/PRJ321_ASM_Group04/web/images/products";
    ProductModel pm = new ProductModel();
    ImageModel im = new ImageModel();
    int idProduct;              // id of product
    String descript = "";       //descript product
    long price = 1;             //price of product
    double square = 1;          //square of product
    int status = 1;             //status of product
    int idType = 1;             //foreign key type 
    int idDistrict = 1;         //foreign key district
    String position = "";
    String shape = "";
    String direction = "";
    String juridical = "";
    double rightOfWay = 1;
    int size = 1;
    Date publicTime = new Date(System.currentTimeMillis());
    if (ServletFileUpload.isMultipartContent(request)) {
        multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
        for (int i = 0; i < multiparts.size(); i++) {
            //check if item is a file
            if (multiparts.get(i).isFormField()) {
                String fieldName = multiparts.get(i).getFieldName();
                String fieldValue = multiparts.get(i).getString();
                if (fieldName.equals("description")) {
                    descript = fieldValue;
                }
                if (fieldName.equals("price")) {
                    price = Long.parseLong(fieldValue);
                }
                if (fieldName.equals("area")) {
                    square = Double.parseDouble(fieldValue);
                }
                if (fieldName.equals("typee")) {
                    idType = Integer.parseInt(fieldValue);
                }
                if (fieldName.equals("district")) {
                    idDistrict = Integer.parseInt(fieldValue);
                }
                if (fieldName.equals("position")) {
                    position = fieldValue;
                }
                if (fieldName.equals("shape")) {
                    shape = fieldValue;
                }
                if (fieldName.equals("direction")) {
                    direction = fieldValue;
                }
                if (fieldName.equals("juridical")) {
                    juridical = fieldValue;
                }
                if (fieldName.equals("right-of-way")) {
                    rightOfWay = Double.parseDouble(fieldValue);
                }
            }
        }
        //add new product to DB
        idProduct = pm.addProduct(descript, price, square, status, idType, idDistrict,
                position, shape, direction, juridical, rightOfWay, publicTime);
        int j = 0;
        for (int i = 0; i < multiparts.size(); i++) {
            ++j;
            //check if item is a file
            if (!multiparts.get(i).isFormField()) {
//                String fileName = item.getName();
                String root = getServletContext().getRealPath("/");
                File path = new File(root + "/images");
                String pictureName = new File(multiparts.get(i).getName()).getName();
                multiparts.get(i).write(new File(path
                        + File.separator + idProduct + "-" + j + pictureName));
                im.addImage(idProduct + "-" + j + pictureName, idProduct);
            }
        }
    }
    int numberOfProduct = pm.getNumberOfProduct(1, "", "");
    int returnPage = (int) Math.ceil((float) numberOfProduct / 5);
    response.sendRedirect("product-list-admin.jsp?page=" + returnPage);

      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"icon\" type=\"icon\" href=\"images/logo.png\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            *{\n");
      out.write("                font-family:  Candara;\n");
      out.write("            }\n");
      out.write("            .container {\n");
      out.write("                padding: 50px 0 !important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .hidden {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("            input.file-show {\n");
      out.write("                display: block;\n");
      out.write("                margin: 5px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <h2>");
      out.print(descript);
      out.write("</h2>       \n");
      out.write("        <h2>");
      out.print(price);
      out.write("</h2>       \n");
      out.write("        <h2>");
      out.print(square);
      out.write("</h2>       \n");
      out.write("        <h2>");
      out.print(status);
      out.write("</h2>       \n");
      out.write("        <h2>");
      out.print(idType);
      out.write("</h2>       \n");
      out.write("        <h2>");
      out.print(idDistrict);
      out.write("</h2>       \n");
      out.write("        <h2>");
      out.print(position);
      out.write("</h2>       \n");
      out.write("        <h2>");
      out.print(shape);
      out.write("</h2>     \n");
      out.write("        <h2>");
      out.print(direction);
      out.write("</h2>     \n");
      out.write("        <h2>");
      out.print(juridical);
      out.write("</h2>     \n");
      out.write("        <h2>");
      out.print(rightOfWay);
      out.write("</h2>     \n");
      out.write("        <h2>");
      out.print(publicTime);
      out.write("</h2>     \n");
      out.write("\n");
      out.write("\n");
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
