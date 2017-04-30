<%-- 
    Document   : companytab
    Created on : Apr 14, 2017, 8:43:28 PM
    Author     : Saad
--%>

<%@page import="com.software.team.BigStore.Controllers.UserController"%>
<%@page import="com.software.team.BigStore.model.User"%>
<%@page import="java.util.ArrayList"%>
<%! User cuser = new User();%>
<% if (session.getAttribute("normal") != null) {
        cuser = (User) session.getAttribute("normal");
        request.setAttribute("user", cuser);
    } else if (session.getAttribute("company") != null) {
        cuser = (User) session.getAttribute("company");
        request.setAttribute("user", cuser);
    } else {
        response.sendRedirect("../home/index.jsp");
    }%>

<%    String keyword = request.getParameter("keyword");

    ArrayList<User> companies = new ArrayList();

    companies = new UserController().getCompanyUser(keyword);

    int columns = 0;

    if (companies.size() == 0) {
%>
<p>No Company user matches <%=keyword%></p>
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
                                <%if (comp.getUser_id() == cuser.getUser_id()) {%>
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
