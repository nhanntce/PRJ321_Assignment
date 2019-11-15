<%-- 
    Document   : Employees-list
    Created on : Nov 7, 2019, 10:20:59 AM
    Author     : Admin
--%>

<%@page import="Model.EmployeeModel"%>
<%@page import="MyUltis.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ObjectInfo.Employees"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int p = 1;
    String s = "";
    String sortColumn = "";
    if (request.getParameter("page") != null) {
        p = Integer.parseInt(request.getParameter("page"));
    }

    if (request.getParameter("s") != null) {
        s = request.getParameter("s");
    }
    Connection con = DBConnection.getConnection();
    EmployeeModel elem = new EmployeeModel();
    ArrayList<Employees> ele= elem.getPaging(p, s, sortColumn);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style type="text/css">
            .hero {
	color: #888;
	width: 100%;
	top: 20%;
	left: 50%;
                text-align: center;
                font-weight: bold;
	
                    
	
}
        </style>
    </head>
    <body>
        <div class="container">
            <h1 class="hero">LIST CUSTOMER</h1>
            <div>
                <table class="table">
                    <thead>
                        <tr class="search">
                            <th colspan="9">
                                <form>
                                    <div class="input-group">
                                        <input type="text" class="form-control" name="s" placeholder="Search" value="<%=s%>">
                                        <div class="input-group-btn">
                                            <button class="btn btn-default" type="submit">
                                                <i class="glyphicon glyphicon-search"></i>
                                            </button>
                                        </div>
                                    </div>
                                </form>
                            </th>
                        </tr>
                        <tr>
                            <th scope="col">Number</th>
                            <th scope="col">Name</th>
                            <th scope="col">Gender</th>
                            <th scope="col">Address</th>
                            <th scope="col">Email</th>
                            <th scope="col">Phone</th>
                            <th scope="col">Birthday</th>
                            <th scope="col">Status</th>
                            <th scope="col">Role</th>
                            <th scope="col">
                                <button type="button" class="btn btn-default btn-sm btn-success"
                                        onclick="location.href = 'Employees-new.jsp?page=<%=p%>&s=<%=s%>'">
                                    <span class="glyphicon glyphicon-plus"></span>
                                </button>

                            </th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            int sp_no = (p - 1) * elem.SoDong_Trang;
                            String genDer;
                            String Status;
                            for (int i = 0; i < ele.size(); i++) {
                                genDer = ele.get(i).getGenderEmployees() == 1 ? "<i class='fa fa-mars text-success'></i>"
                                        : "<i class='fa fa-venus text-danger' ></i> ";
                               
                                Status = ele.get(i).getStatusEmployees() == 2 ? "<span class='glyphicon glyphicon-remove-sign text-danger'></span>"
                                : "<span class='glyphicon glyphicon-ok-circle text-success'></span> ";
                                 ++sp_no;
                                
                        %>

                        <tr>
                            <th scope="col"><%=sp_no%></th>
                            <th><%=ele.get(i).getNameEmployees()%></th>
                            <th scope="col"><%=genDer%></th>
                            <th scope="col"><%=ele.get(i).getAddressEmployees()%></th>
                            <th scope="col"><%=ele.get(i).getMailEmployees()%></th>
                            <th scope="col"><%=ele.get(i).getPhoneEmployees()%></th>
                            <th scope="col"><%=ele.get(i).getBirthdayEmployees()%></th>
                            <th scope="col"><%=Status%></th>
                            <th scope="col"><%=ele.get(i).getRoleName()%></th>
                            
                            <th>
                                <button type="button" class="btn btn-default btn-sm btn-warning"
                                        onclick="location.href ='Employees-edit.jsp?id=<%=ele.get(i).getIdEmployees()%>&page=<%=p%>&s=<%=s%>'">
                                    <span class="glyphicon glyphicon-pencil"></span>
                                </button>

                                <button type="button" class="btn btn-default btn-sm btn-danger"
                                        onclick="if (confirm('Do you really want delete flower <%=ele.get(i).getNameEmployees()%>'))
                                                    location.href = 'Employees-delete.jsp?id=<%=ele.get(i).getIdEmployees()%>&page=<%=p%>&s=<%=s%>'">
                                    <span class="glyphicon glyphicon-trash"></span>
                                </button>

                            </th>
                        </tr>
                            <%
                             }
                        %>
                                


                        <tr>
                            <td colspan="9" align="center"><%=elem.getPagingString(p, s, sortColumn)%></td>
                        </tr>

                    </tbody>
                </table>
            </div>

        </div><!--
---->   </body>
</html>
