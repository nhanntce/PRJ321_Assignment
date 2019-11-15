<%-- 
    Document   : password-edit
    Created on : Nov 11, 2019, 4:44:19 PM
    Author     : Admin
--%>

<%@page import="ObjectInfo.Employees"%>
<%@page import="MyUltis.DBConnection"%>
<%@page import="Model.EmployeeModel"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

    int id = 1;
    int p = 1;
    String s = "";
    id = Integer.parseInt(request.getParameter("id"));
    if (request.getParameter("page") != null) {
        p = Integer.parseInt(request.getParameter("page"));
    }

    if (request.getParameter("s") != null) {
        s = request.getParameter("s");
    }

    Connection con = DBConnection.getConnection();
    EmployeeModel em = new EmployeeModel();
    Employees ele = em.getEmployees(id);
    String pw = ele.getPassworkEmployees();
    

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
        <form method="post" action="password-edit-save.jsp?id=<%=id%>&page=<%=p%>&s=<%=s%>" onsubmit="return checkPass()">
            <div class="form-group row">
                <label class="col-4 col-form-label" for="cusName">New Password* :</label>
                <div class="col-8">
                    <div class="input-group">
                        <div class="input-group-prepend">

                            <div class="input-group-text">
                                <i class="fa fa-exclamation-circle"></i>
                            </div>
                        </div> 
                        <input id="password" name="password" placeholder="Enter your address" type="text" class="form-control"
                               required title="Name must not be blank and must be made up of letters">    
                    </div>
                </div>
            </div>
            <div class="form-group row">
                <label class="col-4 col-form-label" for="cusName"> Confirm Password* :</label>
                <div class="col-8">
                    <div class="input-group">
                        <div class="input-group-prepend">

                            <div class="input-group-text">
                                <i class="fa fa-exclamation-circle"></i>
                            </div> 
                        </div> 
                        <input id="password1" name="password1" placeholder="Enter your address" type="text" class="form-control"
                               required title="Name must not be blank and must be made up of letters">  <br>                      
                    </div>
                    <p id="error"></p>
                </div>
            </div>
            <div class="container" style="position: relative;">
                <div class="p-chang">
                    <button type="summit" class="btn btn-default btn-sm btn-primary" style="position: absolute; left: 50%;">CONFIRM</button>
                </div>
            </div>
        </form>

            <script>
                function checkPass(){
                    var passOne = document.getElementById("password").value;
                    var passTwo = document.getElementById("password1").value;
                    if(passOne !== passTwo){
                        document.getElementById("error").innerHTML = "aaaaaaaa";
                        return false;
                    }
                }
            </script>
                
    </body>
</html>

