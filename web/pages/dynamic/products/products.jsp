
<%@page import="com.software.team.BigStore.model.User"%>
<%@page import="java.io.IOException"%>
<%@page import="com.software.team.BigStore.model.SubCategory"%>
<%@page import="com.software.team.BigStore.model.MainCategory"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.software.team.BigStore.model.Product"%>
<%@page import="com.software.team.BigStore.Controllers.ProductController"%>
<!DOCTYPE html>

<%@include file="/pages/header.jsp" %>
<%!
    ProductController pr_c = new ProductController();

    ArrayList<MainCategory> main_cats = pr_c.getMainCategories();

    ArrayList<SubCategory> cat_subs;

    int index = 0;
    int rowNumber = 8;

    ArrayList<Product> prouducts = new ArrayList();
%>

<%
    int puid;
    HttpSession data = request.getSession();

    if(session.getAttribute("normal") != null) {
        puid = ((User)data.getAttribute("normal")).getUser_id();
    }else if(session.getAttribute("company") != null) {
        puid = ((User)data.getAttribute("company")).getUser_id();
    }else{
        puid = -1;
    }
    // requests parameters are 
    // cat --> main category
    // subcat -->sub category 
    String catvalue = request.getParameter("cat");
    String subcatvalue = request.getParameter("subcat");
    if (catvalue != null) {
        int cat = Integer.parseInt(catvalue);
        prouducts = pr_c.getProuductsWithMainCategory(cat);
    } else if (subcatvalue != null) {
        int subcat = Integer.parseInt(subcatvalue);
        prouducts = pr_c.getProuductsWithSubCategory(subcat);
    } else {
        prouducts = pr_c.getAllProuducts();
    }

%>

<!-- breadcrumbs -->
<div class="breadcrumbs">
    <div class="container">
        <ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".5s">
            <li><a href="/SoftwareProject/pages/dynamic/home/index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
            <li class="active">Products</li>
        </ol>
    </div>
</div>
<!-- //breadcrumbs -->
<!--- products --->
<div class="products">
    <div class="container">
        <div class="col-md-4 products-left" style="width:25%">
            <div class="categories">
                <h2>Categories</h2>

                <ul class="cate">

                    <li><a href="/SoftwareProject/pages/dynamic/products/products.jsp"><i class="fa fa-arrow-right" aria-hidden="true"></i>
                            All
                        </a>
                    </li>



                    <%--  start of menu code   --%>
                    <%-- loop for getting main ctegory  --%>

                    <% for (int i = 0; i < main_cats.size(); i++) {%>

                    <li><a href="?cat=<%= main_cats.get(i).getCategory_id()%>"><i class="fa fa-arrow-right" aria-hidden="true"></i>
                            <%= main_cats.get(i).getCategory_name()%>
                        </a>
                    </li>
                    <% cat_subs = pr_c.getCategorySubs(main_cats.get(i).getCategory_id());%>
                    <ul>

                        <% for (int l = 0; l < cat_subs.size(); l++) {%>

                        <li><a href="?subcat=<%= cat_subs.get(l).getSub_cat_id()%>"><i class="fa fa-arrow-right" aria-hidden="true"></i>
                                <%= cat_subs.get(l).getCat_name()%>   
                            </a>
                        </li>

                        <% } %>
                    </ul>

                    <% } %>

                    <%-- end loop for getting main ctegory  --%>

                    <%--  End of menu code   --%>
                </ul>
            </div>																																												
        </div>

        <div class="col-md-8 products-right" style="width:75%">
            <div class="products-right-grid">
                <div class="products-right-grids">
                    <div class="sorting">
                        <select id="country" onchange="change_country(this.value)" class="frm-field required sect">
                            <option value="null">Default sorting</option>
                            <option value="null">Sort by popularity</option> 
                            <option value="null">Sort by average rating</option>					
                            <option value="null">Sort by price</option>								
                        </select>
                    </div>
                    <div class="sorting-left">
                        <select id="country1" onchange="change_country(this.value)" class="frm-field required sect">
                            <option value="null">Item on page 9</option>
                            <option value="null">Item on page 18</option> 
                            <option value="null">Item on page 32</option>					
                            <option value="null">All</option>								
                        </select>
                    </div>
                    <div class="clearfix"> </div>
                </div>
            </div>


            <%-- start tawfik  --%>
            <%-- this is the start of products div --%>

            <%-- this loop  is to display specified number of rows  --%>

            <%
                int columns = 0;
                //loop to preview each product
                for (Product product : prouducts) {
                    columns++;
                    System.out.println(product.toString());

                    session.setAttribute("product", product);

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
                                                        %><i class="fa fa-star blue-star" aria-hidden="true" ></i><%
                                                    }
                                                    int nonrated = 5 - product.getProduct_rate();
                                                    for (int i = 0; i < nonrated; i++) {
                                                        %><i class="fa fa-star gray-star" aria-hidden="true"></i><%
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
                                    <%if (puid == -1) {
                                    %><p class='nameandcat' > <a id='product_name' href="/SoftwareProject/pages/dynamic/profile/profile.jsp?visited_user=<%=product.getOwner().getUser_id()%>"><%=product.getOwner().getUser_name()%></a> . <%
                            } else if (product.getOwner().getUser_id() != puid) {%>
                                    <p class='nameandcat' > <a id='product_name' href="/SoftwareProject/pages/dynamic/profile/profile.jsp?visited_user=<%=product.getOwner().getUser_id()%>"><%=product.getOwner().getUser_name()%></a> . 
                                        <% } else {%>
                                    <p class='nameandcat' > <a id='product_name' href="/SoftwareProject/pages/dynamic/profile/profile.jsp"><%=product.getOwner().getUser_name()%></a> . 
                                        <% }%>
                                        <a id='product_cat' href="/SoftwareProject/pages/dynamic/products/products.jsp?subcat=<%=product.getProduct_category().getSub_cat_id()%>"><%=product.getProduct_category().getCat_name()%></a></p>                                </figure>
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

            <%-- this is the end of products div --%>


            <nav class="numbering">
                <ul class="pagination paging">
                    <li>
                        <a href="#" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </li>
                    <li class="active"><a href="#">1<span class="sr-only">(current)</span></a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li>
                        <a href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li>
                </ul>
            </nav>
        </div>
        <div class="clearfix"> </div>
    </div>
</div>
<!--- products --->
<%@include file="/pages/footer.jsp" %>
