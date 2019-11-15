<%-- 
    Document   : Customer-edit
    Created on : Nov 10, 2019, 3:13:35 PM
    Author     : HP
--%>

<%@page import="java.sql.Date"%>
<%@page import="ObjectInfo.Customer"%>
<%@page import="MyUltis.DBConnection"%>
<%@page import="Model.CustomerModel"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int p = 1, id = 1;
    String s = "";

    if (request.getParameter("id") != null) {
        id = Integer.parseInt(request.getParameter("id"));
    }
    if (request.getParameter("s") != null) {
        s = request.getParameter("s");
    }

    if (request.getParameter("trang") != null) {
        p = Integer.parseInt(request.getParameter("trang"));
    }
    Connection con = DBConnection.getConnection();
    CustomerModel CM = new CustomerModel(con);
    Customer cus = CM.getCustomerbyId(id);
    String cusName = cus.getNameCustomer();
    String cusMail = cus.getMail();
    String cusPhone = cus.getPhoneCustomer();
    int cusGender = cus.getGenderCustomer();
    Date cusBirthday = cus.getBirthdayCustomer();
    String cusDay, cusMonth, cusYear;
    String cusBirth = cusBirthday.toString();
    cusYear = cusBirth.substring(0, 4);
    cusMonth = cusBirth.substring(5, 7);
    cusDay = cusBirth.substring(8, 10);
    int cusDayofBirth, cusMonthofBirth, cusYearofMonth;
    cusDayofBirth = Integer.parseInt(cusDay);
    cusMonthofBirth = Integer.parseInt(cusMonth);
    cusYearofMonth = Integer.parseInt(cusYear);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" type="icon" href="images/logo.png">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"> 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>Edit Customer</title>
    </head>
    <body>
        <div class="container">
            <div class="text-center title">
                <h2><strong>Edit Customer <%=cusName%></strong></h2>
            </div>

            <form action="Customer-edit-save.jsp?id=<%=id%>&trang=<%=p%>&s=<%=s%>" method="post" id="cusAdd">
                <div class="form-group row">
                    <label class="col-4 col-form-label" for="cusName">Name* :</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">

                                <div class="input-group-text">
                                    <i class="fa fa-address-card"></i>
                                </div>
                            </div> 
                            <input id="cusName" name="cusName" type="text" class="form-control" title="" value="<%=cusName%>">    
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="cusMail" class="col-4 col-form-label">Email* :</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fa fa-envelope"></i>
                                </div>
                            </div> 
                            <input id="cusMail" name="cusMail" type="text" class="form-control"
                                   aria-describedby="cusMailHelpBlock" value="<%=cusMail%>">
                        </div> 
                    </div>
                </div>
                <div class="form-group row">
                    <label for="cusPhone" class="col-4 col-form-label">Phone Number* :</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fa fa-phone"></i>
                                </div>
                            </div> 
                            <input id="cusPhone" name="cusPhone" placeholder="Enter your phone number" type="text" 
                                   class="form-control" value="<%=cusPhone%>">
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="cusBirth" class="col-4 col-form-label">BirthDay :</label>
                    <div class="col-2">
                        <select id="cusDayofBirth" name="cusDayofBirth" class="custom-select">
                            <%
                                for (int i = 1; i <= 31; i++) {
                            %>
                            <option value=<%=i%>><%=i%></option>
                            <%
                                }
                            %>
                        </select>
                    </div>
                    <div class="col-2">
                        <select id="cusMonthofBirth" name="cusMonthofBirth" class="custom-select">
                            <%
                                for (int i = 1; i <= 12; i++) {
                            %>
                            <option value=<%=i%>><%=i%></option>
                            <%
                                }
                            %>
                        </select>
                    </div>
                    <div class="col-3">
                        <select id="cusYearofBirth" name="cusYearofBirth" class="custom-select">
                            <%
                                for (int i = 1900; i <= 2019; i++) {
                            %>
                            <option value=<%=i%>><%=i%></option>
                            <%
                                }
                            %>
                        </select>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-4">Gender* :</label> 
                    <div class="col-8">
<%
                         if(cusGender==1) {
%>
                            <input type="radio" id="cusGender" name="cusGender" value="1" checked> Male<br>
                            <input type="radio" id="cusGender" name="cusGender" value="2"> Female<br>
<%  
                         } else {
%>
                            <input type="radio" id="cusGender" name="cusGender" value="1"> Male<br>
                            <input type="radio" id="cusGender" name="cusGender" value="2" checked> Female<br>
<%
                         }
%>
                    </div>  
                </div> 
                <div class="form-group row">
                    <div class="offset-4 col-8">
                        <button name="submit" type="submit" class="btn btn-primary">Edit</button>
                    </div>
                </div>
            </form>   
        </div>
        <script>
                            document.getElementById("cusYearofBirth").value = <%=cusYearofMonth%>;
                            document.getElementById("cusMonthofBirth").value = <%=cusMonthofBirth%>;
                            document.getElementById("cusDayofBirth").value = <%=cusDayofBirth%>;
        </script>
    </body>
</html>