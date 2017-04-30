<%-- 
    Document   : producttab
    Created on : Apr 14, 2017, 8:44:01 PM
    Author     : Saad
--%>
<%@page import="com.software.team.BigStore.Controllers.ProductController"%>
<%@page import="com.software.team.BigStore.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%

    String keyword = request.getParameter("keyword");

    ArrayList<Product> products = new ArrayList();

    products = new ProductController().getCustomProducts(keyword);

    int columns = 0;

    if (products.size() == 0) {
%>
<p>No Product matches <%=keyword%></p>
<%
} //loop through every company user
else {
    for (Product pro : products) {
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
                                <a href="/SoftwareProject/pages/dynamic/products/single.jsp?product_id=<%=pro.getProduct_id()%>"><img src="http://localhost:8080/SoftwareProject/pages/dynamic/jspfragments/retrive_image.jsp?imgId=<%=pro.getProduct_id()%>" id='productfragment' class="img-responsive" ></a>
                                <p><%=pro.getProduct_name()%></p>
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
