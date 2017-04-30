<%-- 
    Document   : userproducts
    Created on : Apr 1, 2017, 5:41:21 AM
    Author     : Saad
--%>

<%@page import="com.software.team.BigStore.model.Product"%>
<%@page import="com.software.team.BigStore.Controllers.ProductController"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.io.IOException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

    int user_id = Integer.parseInt(request.getParameter("user_id"));
    //list of products that user is interested in
    ArrayList<Product> products = new ArrayList<Product>();

    //get all products from the database
    products = new ProductController().getProudctsForUser(user_id);

    int columns = 0;
    //loop to preview each product
    for (Product pr : products) {
        columns++;
        System.out.println(pr.toString());

%>
<div class="agile_top_brands_grids" >
    <div class="col-md-4 top_brand_left">
        <div class="hover14 column">
            <div class="agile_top_brand_left_grid">
                <p class='date'><%=pr.getPost_date()%></p>
                <div class="agile_top_brand_left_grid_pos">
                    <img src="/SoftwareProject/resources/images/offer.png" alt=" " class="img-responsive">
                </div>
                <div class="agile_top_brand_left_grid1">
                    <figure>
                        <div class="snipcart-item block">
                            <div class="snipcart-thumb">
                                <a href="/SoftwareProject/pages/dynamic/products/single.jsp?product_id=<%=pr.getProduct_id()%>"><img alt=" " src="/SoftwareProject/pages/dynamic/jspfragments/retrive_image.jsp?imgId=<%=pr.getProduct_id()%>" id='productfragment' class="img-responsive" ></a>
                                <p><%=pr.getProduct_name()%></p>
                                <div class="stars">
                                    <% for (int i = 0; i < pr.getProduct_rate(); i++) {
                                            out.print("<i class=\"fa fa-star blue-star\" aria-hidden=\"true\"></i>");
                                        }
                                        int nonrated = 5 - pr.getProduct_rate();
                                        for (int i = 0; i < nonrated; i++) {
                                            out.print("<i class=\"fa fa-star gray-star\" aria-hidden=\"true\"></i>");
                                        }
                                    %>
                                </div>
                                <details style="cursor: pointer;outline: none;">

                                    <br>
                                    <h4><%=pr.getProduct_price()%><span>$ <%= pr.getProduct_price() + (pr.getProduct_price() / 5)%> </span></h4>

                                    <p style="text-align: center;font-size: 13px">
                                        <%=pr.getProduct_details()%>
                                    </p>

                                    <br>
                                </details>
                            </div>
                            <div class="productprice" >
                                <div class="pull-right">
                                    <form method="post" action="http://localhost:8080/SoftwareProject/pages/dynamic/profile/setting.jsp">
                                        <input name="do" type="hidden" value="add" />

                                        <input name="edit" type="hidden" value=" <%=pr.getProduct_id()%>" />
                                        <button type="submit" class="btn btn-success btm-sm" >
                                            Edit
                                            <span class="glyphicon glyphicon-edit" ></span>
                                        </button>  
                                    </form>
                                </div>
                                <div class="pricetext">
                                    <a href="http://localhost:8080/SoftwareProject/pages/dynamic/jspfragments/profilejsp/deleteUserProduct.jsp?pr_id=<%=pr.getProduct_id()%>" class="btn btn-warning btm-sm" role="button">Delete <span class="glyphicon glyphicon-cog"></span></a>
                                </div>
                            </div>

                        </div>
                        <p class='nameandcat' > <a id='product_name' href="#"><%=pr.getOwner().getUser_name()%></a> . <a id='product_cat' href="/SoftwareProject/pages/dynamic/products/products.jsp?subcat=<%=pr.getProduct_category().getSub_cat_id()%>"><%=pr.getProduct_category().getCat_name()%></a></p>
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
