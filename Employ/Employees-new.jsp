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
        <title>JSP Page</title>
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
            <form action="Employees-new-save.jsp" method="post">
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
                            <input id="cusName" name="address" placeholder="Enter your address" type="text" class="form-control"
                                   required title="Name must not be blank and must be made up of letters">    
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
                            <input id="cusMail" name="mail" type="text" class="form-control" pattern="/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/"
                                   required aria-describedby="cusMailHelpBlock">
                        </div> 
                        <span id="cusMailHelpBlock" class="form-text text-muted">@gmail.com, @fpt.edu.vn, ...</span>
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
                    </div>
                </div>
                <div class="form-group row">
                    <label for="cusBirth" class="col-4 col-form-label">BirthDay :</label>
                    <div class="col-2">
                        <select id="cusDayofBirth" name="DayofBirth" class="custom-select">
                            <%                                for (int i = 1; i <= 31; i++) {
                            %>
                            <option value=<%=i%>><%=i%></option>
                            <%
                                }
                            %>
                        </select>
                    </div>
                    <div class="col-2">
                        <select id="cusMonthofBirth" name="MonthofBirth" class="custom-select">
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
                        <select id="cusYearofBirth" name="YearofBirth" class="custom-select">
                            <%
                                for (int i = 1970; i <= 2019; i++) {
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
                        <input type="radio" id="cusGender" name="gender" value="1" checked> Male<br>
                        <input type="radio" id="cusGender" name="gender" value="2"> Female<br>
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
                            <input id="cusName" name="account" placeholder="Enter your address" type="text" class="form-control"
                                   required title="Name must not be blank and must be made up of letters">    
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
                            <input id="cusName" name="password" placeholder="Enter your address" type="text" class="form-control"
                                   required title="Name must not be blank and must be made up of letters">    
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="select" class="col-4 col-form-label">Role</label> 
                    <div class="col-8">
                        <select id="select" name="role" class="custom-select">
                            <%
                                for (Role r : role){
                                    
                                
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
        </div>
    </div>
</form>

</div>
</body>
</html>
