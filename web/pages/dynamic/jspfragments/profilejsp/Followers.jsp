<%-- 
    Document   : Followers
    Created on : Apr 25, 2017, 3:35:19 PM
    Author     : tito
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.software.team.BigStore.Controllers.UserController"%>
<%@page import="com.software.team.BigStore.model.Company"%>
<%@page import="com.software.team.BigStore.model.NormalUser"%>
<%@page import="com.software.team.BigStore.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<% User usr = (User) request.getAttribute("user");
    UserController uc = new UserController();
    List<? extends User> follows = new ArrayList();
%>
<% int us_type = usr.getUserType();
    if (us_type == 0) {
        NormalUser normal = uc.getNormal(usr.getUser_id());
        follows = normal.getFollowingCompanies();

    } else {
        Company company = uc.getCompany(usr.getUser_id());
        follows = company.getFollowers();

    }

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../../../../resources/css/bootstrap.css" rel="stylesheet" >
        <style>
            .follow-div{
                border: 2px solid #2c2c2c;

            }

        </style>

    </head>
    <body>

        <div class="container">
            <div class="row center-block"style="width: 95%" >


                <% for (int i = 0; i < follows.size(); i++) {%>
                <div style="width: 19%;margin: 3px;display: inline-block;padding: 10px;border: 1px solid #ccc;">
                    <a href="?user=<%=follows.get(i).getUser_id() %>">  
                        <img src="../jspfragments/retrive_image.jsp?userId=<%= follows.get(i).getUser_id()%>" class="center-block" alt="User image" style="width: 70%;margin: 0 auto;">
                    </a>
                    <h5 class="text-center" style="margin: 10px;"><%=follows.get(i).getUser_name()%></h5>
                    <h5 class="text-center" style="margin: 7px;"><%=follows.get(i).getUser_phone()%></h5>
                    <h5 class="text-center" style="margin: 5px;"><%=follows.get(i).getUserFullname()%></h5>


                </div>

                <%
                    }%>
            </div>

        </div>
    </body>
</html>
