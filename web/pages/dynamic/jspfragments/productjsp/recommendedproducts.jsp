<%-- 
    Document   : indexloadingproducts
    Created on : Mar 12, 2017, 4:51:48 PM
    Author     : Saad
--%>

<%@page import="com.software.team.BigStore.model.NormalUser"%>
<%@page import="com.software.team.BigStore.Controllers.UserController"%>
<%@page import="com.software.team.BigStore.model.User"%>
<%@page import="java.io.IOException"%>
<%@page import="com.software.team.BigStore.Controllers.ProductController"%>
<%@page import="com.software.team.BigStore.DBServlets.ProductServlets.indexLoadingProducts"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.software.team.BigStore.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! 
    int uid;
%>
<%

    HttpSession data = request.getSession();

    if(session.getAttribute("normal") != null) {
        uid = ((User)data.getAttribute("normal")).getUser_id();
    }else if(session.getAttribute("company") != null) {
        uid = ((User)data.getAttribute("company")).getUser_id();
    }else{
        uid = -1;
    }

    ArrayList<Product> recommendedproducts = new ArrayList<Product>();

    //get recommended products
    recommendedproducts = new ProductController().getRecommendedProducts();

    int col = 0;
    for (Product product : recommendedproducts) {
        col++;
        System.out.println(product.toString());

        try {
%>
<div class="agile_top_brands_grids" >
    <div class="col-md-4 top_brand_left">
        <div class="hover14 column">
            <div class="agile_top_brand_left_grid">
                <p class='date'><%=product.getPost_date()%></p>
                <div class="agile_top_brand_left_grid_pos">
                    <img src="/SoftwareProject/resources/images/offer.png" alt=" " class="img-responsive">
                </div>
                <div class="agile_top_brand_left_grid1">
                    <figure>
                        <div class="snipcart-item block">
                            <div class="snipcart-thumb">
                                <a href="/SoftwareProject/pages/dynamic/products/single.jsp?product_id=<%=product.getProduct_id()%>"><img alt=" " src="/SoftwareProject/pages/dynamic/jspfragments/retrive_image.jsp?imgId=<%=product.getProduct_id()%>" id='productfragment' class="img-responsive" ></a>
                                <p><%=product.getProduct_name()%></p>
                                <div class="stars">
                                    <% for (int i = 0; i < product.getProduct_rate(); i++) {
                                            out.print("<i class=\"fa fa-star blue-star\" aria-hidden=\"true\"></i>");
                                        }
                                        int nonrated = 5 - product.getProduct_rate();
                                        for (int i = 0; i < nonrated; i++) {
                                            out.print("<i class=\"fa fa-star gray-star\" aria-hidden=\"true\"></i>");
                                        }
                                    %>
                                </div>
                                <h4><%=product.getProduct_price()%><span>$ <%= product.getProduct_price() + (product.getProduct_price() / 5)%> </span></h4>
                            </div>
                            <div class="snipcart-details top_brand_home_details">
                                <form action="#" method="post">
                                    <fieldset>
                                        <input type="hidden" name="cmd" value="_cart">
                                        <input type="hidden" name="add" value="1">
                                        <input type="hidden" name="business" value=" ">
                                        <input type="hidden" name="item_name" value="Fortune Sunflower Oil">
                                        <input type="hidden" name="amount" value="35.99">
                                        <input type="hidden" name="discount_amount" value="1.00">
                                        <input type="hidden" name="currency_code" value="USD">
                                        <input type="hidden" name="return" value=" ">
                                        <input type="hidden" name="cancel_return" value=" ">
                                        <input type="submit" name="submit" value="Add to cart" class="button">
                                    </fieldset>
                                </form>
                            </div>
                            <details style="cursor: pointer;outline: none;">

                                <br>
                                <h4><%=product.getProduct_price()%><span>$ <%= product.getProduct_price() + (product.getProduct_price() / 5)%> </span></h4>

                                <p style="text-align: center;font-size: 13px">
                                    <%=product.getProduct_details()%>
                                </p>

                                <br>
                            </details>
                        </div>

                        <%if(uid == -1){
                            %><p class='nameandcat' > <a id='product_name' href="/SoftwareProject/pages/dynamic/profile/profile.jsp?visited_user=<%=product.getOwner().getUser_id()%>"><%=product.getOwner().getUser_name()%></a> . <%
                        }else if (product.getOwner().getUser_id() != uid) {%>
                        <p class='nameandcat' > <a id='product_name' href="/SoftwareProject/pages/dynamic/profile/profile.jsp?visited_user=<%=product.getOwner().getUser_id()%>"><%=product.getOwner().getUser_name()%></a> . 
                            <% } else {%>
                        <p class='nameandcat' > <a id='product_name' href="/SoftwareProject/pages/dynamic/profile/profile.jsp"><%=product.getOwner().getUser_name()%></a> . 
                            <% }%>
                        <a id='product_cat' href="/SoftwareProject/pages/dynamic/products/products.jsp?subcat=<%=product.getProduct_category().getSub_cat_id()%>"><%=product.getProduct_category().getCat_name()%></a></p>
                    </figure>
                </div>
            </div>
        </div>
    </div>
</div>
<%
    if (col == 3) {
%><div class="clearfix"></div><%
                col = 0;
            }
        } catch (IOException ex) {

        }

    }
%>
<div class="clearfix"></div>