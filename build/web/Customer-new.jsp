<%-- 
    Document   : Customer-new
    Created on : Nov 10, 2019, 1:35:54 AM
    Author     : HP
--%>

<%@page import="Model.CustomerModel"%>
<%@page import="MyUltis.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Connection con = DBConnection.getConnection();
    CustomerModel CM = new CustomerModel(con);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
        <script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js"></script> 
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"> 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>Add Customer</title>   
    </head>
    <body>
        <div class="container">

            <form action="Customer-new-save.jsp" method="post" style="width:600px;margin: 0px auto" id="cusAdd">
                <fieldset>
                    <div class="text-center title">
                        <h2><strong>Add new Customer</strong></h2>
                    </div>
                    <div class="form-group row">
                        <label class="col-4 col-form-label" for="cusName">Name* :</label> 
                        <div class="col-8">
                            <div class="input-group">
                                <div class="input-group-prepend">

                                    <div class="input-group-text">
                                        <i class="fa fa-address-card"></i>
                                    </div>
                                </div> 
                                <input id="cusName" name="cusName" placeholder="Enter your name" type="text" class="form-control" title="">    
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
                                       aria-describedby="cusMailHelpBlock">
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
                                <input id="cusPhone" name="cusPhone" placeholder="Enter your phone number" type="text" 
                                       class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="cusBirth" class="col-4 col-form-label">BirthDay :</label>
                        <div class="col-2">
                            <input type="date" id="cusBirth" name="cusBirth">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-4">Gender* :</label> 
                        <div class="col-8">
                            <input type="radio" id="cusGender" name="cusGender" value="1" checked> Male<br>
                            <input type="radio" id="cusGender" name="cusGender" value="2"> Female<br>
                        </div>  
                    </div> 
                    <div class="form-group row">
                        <div class="offset-4 col-8">
                            <button name="submit" type="submit" class="btn btn-primary">Add</button>
                        </div>
                    </div>
                </fieldset>
            </form>   
        </div>
        <script type="text/javascript">
//            var input = document.getElementById("cusName");
//            input.oninvalid = function (event) {
//                event.target.setCustomValidity('Name must not be blank and must be made up of letters');
//            };
            $(document).ready(function () {
                $("#cusAdd").validate({
                    rule: {
                        cusName: {
                            required: true
                        },
                        cusMail: {
                            regexEmail: true,
                            required: true
                        },
                        cusPhone: {
                            regexPhone: true,
                            required: true,
                            digits: true,
                            minlength: 10,
                            maxlength: 11
                        }
                    },
                    messages: {
                        cusName: {
                            required: "Name not be emty"
                        },
                        cusMail: {
                            regexEmail: "Email invalid",
                            required: "Email not be empty"
                        },
                        cusPhone: {
                            regexPhone: "Phone number invalid",
                            required: "Phone number not be empty",
                            digits: "Phone number must be digits",
                            minlength: "The phone number you entered is too short",
                            maxlength: "The phone number you entered is too long"
                        }
                    }
                });
            });
            $.validator.addMethod("regexPhone", function (value, element) {
                return this.optional(element) || /((09|03|07|08|05)+[0-9]{8})$/i.test(value);
            });
            $.validator.addMethod("regexEmail", function (value, element) {
                return this.optional(element) || /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/i.test(value);
            });
        </script>
    </body>
</html>
