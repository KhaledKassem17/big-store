<%-- 
    Document   : latestproducts
    Created on : Mar 24, 2017, 2:41:28 AM
    Author     : Saad
--%>

<%@page import="java.io.IOException"%>
<%@page import="com.software.team.BigStore.Controllers.ProductController"%>
<%@page import="com.software.team.BigStore.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%

    //list of latest products
    ArrayList<Product> latestproducts = new ArrayList<Product>();

    //get latest products a week ago from the database
    latestproducts = new ProductController().getLatestProducts();

    int cols = 0;
    //loop to preview each product
    for (Product product : latestproducts) {
        cols++;
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
                                <a href="/SoftwareProject/pages/dynamic/products/single.jsp?product_id="<%=product.getProduct_id()%>><img alt=" " src="/SoftwareProject/pages/dynamic/jspfragments/retrive_image.jsp?imgId=<%=product.getProduct_id()%>" id='productfragment' class="img-responsive" ></a>
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
                        </div>
                        <p class='nameandcat' > <a id='product_name' href="#"><%=product.getOwner().getUser_name()%></a> . <a id='product_cat' href="#"><%= product.getProduct_category().getCat_name()%></a></p>
                    </figure>
                </div>
            </div>
        </div>
    </div>
</div>
<%
    if (cols == 3) {
%><div class="clearfix"></div><%
                cols = 0;
            }
        } catch (IOException ex) {

        }

    }
%>
<div class="clearfix"></div>