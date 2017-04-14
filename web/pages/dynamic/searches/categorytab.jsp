<%-- 
    Document   : categorytab
    Created on : Apr 14, 2017, 8:44:11 PM
    Author     : Saad
--%>
<%@page import="com.software.team.BigStore.Controllers.ProductController"%>
<%@page import="com.software.team.BigStore.model.SubCategory"%>
<%@page import="java.util.ArrayList"%>
<%

    String keyword = request.getParameter("keyword");

    ArrayList<SubCategory> subs = new ArrayList();

    subs = new ProductController().getCustomSubCats(keyword);

    int columns = 0;

    if (subs.size() == 0) {
%>
<p>No Category matches <%=keyword%></p>
<%
} //loop through every company user
else {
    for (SubCategory sub : subs) {
        columns++;
%>
<div class="agile_top_brands_grids" >
    <div class="col-md-4 top_brand_left">
        <div class="hover14 column">
            <div class="agile_top_brand_left_grid">
                <figure>
                    <div class="snipcart-item block">
                        <div class="snipcart-thumb">
                            <a href="#"><img src="http://localhost:8080/SoftwareProject/pages/dynamic/jspfragments/productjsp/retriveCatImage.jsp?imgId=<%=sub.getSub_cat_id()%>" id='productfragment' class="img-responsive" ></a>
                            <p><%=sub.getCat_name()%></p>
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
