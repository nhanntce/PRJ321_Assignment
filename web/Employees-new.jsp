<%-- 
    Document   : Employees-new
    Created on : Nov 9, 2019, 8:16:18 PM
    Author     : Admin
--%>


<%@page import="MyUltis.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="org.hibernate.validator.constraints.Email"%>
<%@page import="Model.EmployeeModel"%>
<%@page import="ObjectInfo.Employees"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ObjectInfo.Role"%>
<%@page import="Model.RoleModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    RoleModel rl = new RoleModel();
    ArrayList<Role> role = rl.getRole();
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Employee</title>
        <link rel="icon" type="icon" href="images/logo.png">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <div class="text-center">
                <h4>Add Employee</h4>
            </div>
            <form action="Employees-new-save.jsp" method="post" onsubmit="return validation()">
                <div class="form-group row">
                    <label class="col-4 col-form-label" for="cusName">Name* :</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">

                                <div class="input-group-text">
                                    <i class="fa fa-address-card"></i>
                                </div>
                            </div> 
                            <input id="cusName" name="name" placeholder="Enter your name" type="text" class="form-control"
                                   required title="Name must not be blank and must be made up of letters">    
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-4 col-form-label" for="cusName">Address* :</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">

                                <div class="input-group-text">
                                    <i class="fa fa-institution"></i>
                                </div>
                            </div> 
                            <input id="address" name="address" placeholder="Enter your address" type="text" class="form-control"
                                   required title="Address must not be blank and must be made up of letters">    
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="cusMail" class="col-4 col-form-label">Mail* :</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <div class="input-group-text">
                                    <i class="fa fa-envelope"></i>
                                </div>
                            </div> 
                            <input id="cusMail" name="mail" placeholder="Enter your Mail" type="text" class="form-control" pattern="/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/"
                                   required aria-describedby="cusMailHelpBlock" required title="Mail must not be blank and must be made up of letters">
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
                            <input id="cusPhone" name="phone" placeholder="Enter your phone number" type="text" class="form-control">
                        </div>
                        <p id="phoneE" style="color: #f00;"></p>
                    </div>
                </div>
                
                <div class="form-group row">
                    <label for="cusBirth" class="col-4 col-form-label">BirthDay :</label>
                    <div class="col-8">
                        <input type="date" name="birthday" required class="form-control">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-4">Gender* :</label> 
                    <div class="col-8">
                        <input type="radio" id="male" name="gender" value="1" checked> Male<br>
                        <input type="radio" id="female" name="gender" value="2"> Female<br>
                    </div>  
                </div> 

                <div class="form-group row">
                    <label class="col-4 col-form-label" for="cusName">Account* :</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">

                                <div class="input-group-text">
                                    <i class="fa fa-address-book"></i>
                                </div>
                            </div> 
                            <input id="acount" name="account" placeholder="Enter your account" type="text" class="form-control"
                                   required title="Account must not be blank and must be made up of letters">    
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-4 col-form-label" for="cusName">Password* :</label> 
                    <div class="col-8">
                        <div class="input-group">
                            <div class="input-group-prepend">

                                <div class="input-group-text">
                                    <i class="fa fa-exclamation-circle"></i>
                                </div>
                            </div> 
                            <input id="pass" name="password" placeholder="Enter your password" type="password" class="form-control"
                                   required title="Password must not be blank and must be made up of letters">    
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="select" class="col-4 col-form-label">Role</label> 
                    <div class="col-8">
                        <select id="select" name="role" class="custom-select">
                            <%
                                for (Role r : role) {


                            %>
                            <option value="<%=r.getIdRole()%>"><%=r.getRoleName()%></option>

                            <%
                                }
                            %>
                        </select>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="offset-4 col-8">
                        <button name="submit" type="submit" class="btn btn-primary">Add</button>
                    </div>
                </div>
            </form>
                        <!--<button onclick="validation()">hhhhhhhh</button>-->          
        </div>
        <script>
           
            function validation() {
                console.log("hoang ml");
                document.getElementById("phoneE").value = "Phone is invalid!";
                var phone = document.getElementById("cusPhone");
                var mail = document.getElementById("cusMail");
                var phoneCheck = /((09|03|07|08|05)+[0-9]{8})$/i.test(phone.value);
                var emailCheck = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/i.test(mail.value);
                if(!phoneCheck || !emailCheck){
                    if(!phoneCheck){
                        document.getElementById("phoneE").innerHTML = "Phone is invalid!";
                    }
                    if(!emailCheck){
                        document.getElementById("mailE").innerHTML = "Email is invalid!";
                    }
                    return false;
                }
                return false;
            }
        </script>
    </body>
</html>
