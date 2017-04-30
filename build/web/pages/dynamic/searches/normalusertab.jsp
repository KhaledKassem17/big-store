<%-- 
    Document   : normalusertab
    Created on : Apr 14, 2017, 8:43:42 PM
    Author     : Saad
--%>
<%@page import="com.software.team.BigStore.Controllers.UserController"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.software.team.BigStore.model.User"%>

<%! User nuser = new User();%>
<% if (session.getAttribute("normal") != null) {
        nuser = (User) session.getAttribute("normal");
        request.setAttribute("user", nuser);
    } else if (session.getAttribute("company") != null) {
        nuser = (User) session.getAttribute("company");
        request.setAttribute("user", nuser);
    } else {
        response.sendRedirect("../home/index.jsp");
    }%>

<%

    String keyword = request.getParameter("keyword");

    ArrayList<User> companies = new ArrayList();

    companies = new UserController().getNormalUser(keyword);

    int columns = 0;

    if (companies.size() == 0) {
%>
<p>No Normal user matches <%=keyword%></p>
<%
} //loop through every company user
else {
    for (User comp : companies) {
        columns++;
%>
<div class="agile_top_brands_grids" >
    <div class="col-md-4 top_brand_left">
        <div class="hover14 column">
            <div class="agile_top_brand_left_grid">
                <div class="agile_top_brand_left_grid1">
                    <figure>
                        <div class="snipcart-item block">
                            <div class="snipcart-thumb">
                                <%if (comp.getUser_id() == nuser.getUser_id()) {%>
                                    <a href="/SoftwareProject/pages/dynamic/profile/profile.jsp"><img src="../jspfragments/retrive_image.jsp?userId=<%=comp.getUser_id()%>" id='productfragment' class="img-responsive" ></a>
                                    <p><a href="/SoftwareProject/pages/dynamic/profile/profile.jsp"><%=comp.getUser_name()%></a></p>
                                <%} else{%>
                                    <a href="/SoftwareProject/pages/dynamic/profile/profile.jsp?visited_user=<%=comp.getUser_id()%>"><img src="../jspfragments/retrive_image.jsp?userId=<%=comp.getUser_id()%>" id='productfragment' class="img-responsive" ></a>
                                    <p><a href="/SoftwareProject/pages/dynamic/profile/profile.jsp?visited_user=<%=comp.getUser_id()%>"><%=comp.getUser_name()%></a></p>
                                <%}%>
                            </div>
                        </div>
                    </figure>
                </div>
            </div>
        </div>
    </div>
</div>
<%
    if (columns == 3) {
%><div class="clearfix"></div><%
                            columns = 0;
                        }
                    }
                }

%>
