<%-- 
    Document   : Employees-edit
    Created on : Nov 10, 2019, 5:36:01 PM
    Author     : Admin
--%>

<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.sql.Date"%>
<%@page import="ObjectInfo.Employees"%>
<%@page import="Model.EmployeeModel"%>
<%@page import="MyUltis.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ObjectInfo.Role"%>
<%@page import="Model.RoleModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int id = 0;
    int num = 1;
    if (request.getParameter("num") != null) {
        num = Integer.parseInt(request.getParameter("num"));
    }
    if (request.getParameter("id") != null) {
        id = Integer.parseInt(request.getParameter("id"));
    }

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


%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="icon" type="icon" href="images/logo.png">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
        <link rel="icon" type="icon" href="images/logo.png">



    </head>
    <body>
        <div class="container">
            <div class="text-center">
                <h4>Edit Employee</h4>
            </div>
            <form action="Employees-edit-save.jsp" method="post" onsubmit="return validation()">
                <input type="hidden" name="id" value="<%=id%>">
                <input type="hidden" name="num" value="<%=num%>">
                <div class="form-group row">
                    <label class="col-4 col-form-label">Name* :</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">

                                <div class="input-group-text">
                                    <i class="fa fa-address-card"></i>
                                </div>
                            </div> 
                            <input id="name" name="name" placeholder="Enter your name" type="text" class="form-control"
                                   required title="Name must not be blank and must be made up of letters" value="<%=ele.getNameEmployees()%>">    
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-4 col-form-label">Address* :</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">

                                <div class="input-group-text">
                                    <i class="fa fa-institution"></i>
                                </div>
                            </div> 
                            <input id="address" name="address" placeholder="Enter your address" type="text" class="form-control"
                                   required title="Address must not be blank and must be made up of letters" value="<%=ele.getAddressEmployees()%>">    
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-4 col-form-label">Mail* :</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fa fa-envelope"></i>
                                </div>
                            </div> 
                            <input id="mail" name="mail" type="text" class="form-control" pattern="/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/"
                                   required aria-describedby="cusMailHelpBlock" value="<%=ele.getMailEmployees()%>">
                        </div> 
                        <span id="cusMailHelpBlock" class="form-text text-muted">@gmail.com, @fpt.edu.vn, ...</span>
                        <p id="mailE" style="color: #f00;"></p>
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
                            <input id="phone" name="phone" placeholder="Enter your phone number" type="text" class="form-control" value="<%=ele.getPhoneEmployees()%>">
                        </div>
                        <p id="phoneE" style="color: #f00;"></p>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="cusBirth" class="col-4 col-form-label">BirthDay :</label>
                    <div class="col-8">
                        <input type="date" name="birthday" required class="form-control" value="<%=d%>">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-4">Gender* :</label> 
                    <div class="col-8">
                        <%
                            String gen = "";
                            if (gd == 1) {


                        %>
                        <%=gen%><input type="radio" id="cusGender" name="gender" value="1" checked> Male
                        <input type="radio" id="cusGender" name="gender" value="2"> Female
                    </div>  
                    <%
                    } else {
                    %>
                    <%=gen%><input type="radio" id="cusGender" name="gender" value="1"> Male
                    <input type="radio" id="cusGender" name="gender" value="2"  checked> Female
                </div>  
                <%
                    }
                %>
                <div class="form-group" style="position: relative; width: 100%;">
                    <button name="submit" type="submit" class="btn btn-primary" style="position: absolute;left: 50%;">Change</button>
                </div>
            </form>

        </div> 
        <!--<button onclick="validation()">aaaa</button>-->
        <script>
            

            function validation() {
                console.log("hoang ml");
                document.getElementById("phoneE").value = "Phone is invalid!";
                var phone = document.getElementById("phone");
                var mail = document.getElementById("mail");
                var phoneCheck = /((09|03|07|08|05)+[0-9]{8})$/i.test(phone.value);
                var emailCheck = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/i.test(mail.value);
                if (!phoneCheck || !emailCheck) {
                    if (!phoneCheck) {
                        document.getElementById("phoneE").innerHTML = "Phone is invalid!";
                    }
                    if (!emailCheck) {
                        document.getElementById("mailE").innerHTML = "Email is invalid!";
                    }
                    return false;
                }
               
            }
        </script>
    </body>
</html>
