<%-- 
    Document   : companytab
    Created on : Apr 14, 2017, 8:43:28 PM
    Author     : Saad
--%>

<%@page import="com.software.team.BigStore.Controllers.UserController"%>
<%@page import="com.software.team.BigStore.model.User"%>
<%@page import="java.util.ArrayList"%>
<%

    String keyword = request.getParameter("keyword");

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
                <figure>
                    <div class="snipcart-item block">
                        <div class="snipcart-thumb">
                            <a href="#"><img src="http://localhost:8080/SoftwareProject/pages/dynamic/jspfragments/userjsp/retrieveUserImage.jsp?imgId=<%=comp.getUser_id()%>" id='productfragment' class="img-responsive" ></a>
                            <p><%=comp.getUser_name()%></p>
                        </div>
                    </div>
                </figure>
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
