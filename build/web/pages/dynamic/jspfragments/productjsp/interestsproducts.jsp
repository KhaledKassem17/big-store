<%--
    Document   : interestsproducts
    Created on : Mar 24, 2017, 2:42:36 AM
    Author     : Saad
--%>

<%@page import="com.software.team.BigStore.model.SubCategory"%>
<%@page import="java.io.IOException"%>
<%@page import="com.software.team.BigStore.Controllers.ProductController"%>
<%@page import="com.software.team.BigStore.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%

    //list of categories that user is interested in
    ArrayList<SubCategory> interests = new ArrayList<SubCategory>();

    //get all categories from the database
    interests = new ProductController().getSubCategories();

    int columns = 0;
    //loop to preview each product
    for (SubCategory cat : interests) {
        columns++;
        System.out.println(cat.toString());

%>
<div class="agile_top_brands_grids" >
    <div class="col-md-4 top_brand_left">
        <div class="hover14 column">
            <div class="agile_top_brand_left_grid">
                <div class="agile_top_brand_left_grid1">
                    <figure>
                        <div class="snipcart-item block">
                            <div class="snipcart-thumb">
                                <a href="/SoftwareProject/pages/dynamic/products/products.jsp?subcat=<%=cat.getSub_cat_id()%>"><img alt=" " src="/SoftwareProject/pages/dynamic/jspfragments/productjsp/retriveCatImage.jsp?imgId=<%=cat.getSub_cat_id()%>" id='productfragment' class="img-responsive" ></a>
                                <p><%=cat.getCat_name()%></p>
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
%>
<div class="clearfix"></div>