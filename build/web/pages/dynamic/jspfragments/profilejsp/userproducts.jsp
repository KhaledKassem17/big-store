<%-- 
    Document   : myproducts
    Created on : Apr 25, 2017, 2:07:01 PM
    Author     : tito
--%>
<%@page import="com.software.team.BigStore.Controllers.UserController"%>
<%@page import="com.software.team.BigStore.model.User"%>
<%@page import="com.software.team.BigStore.Controllers.ProductController"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.software.team.BigStore.model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<head>

    <style>

        #search-btn{
            width: 40px;
            text-align: center;
        }
        .usrpr-search{
            height: 35px;
            margin-right: 10px;
            width: 200px;
        }
        .prdcts-user-cn{

            margin: 15px;
        }

        .btn-add-pr{
            min-width: 150px;
        }
    </style>

</head>


<div class="container">
    <div class="row">
        <%! ArrayList<Product> usrProuducts = new ArrayList();
            ProductController pc = new ProductController();
            UserController uc = new UserController();
        %>

        <%
            int realuser_id = 0, visiteduser_id = 0;
            if (request.getParameter("realuser") != null) {
                realuser_id = Integer.parseInt(request.getParameter("realuser"));
                System.out.println("recieving userId ==> " + realuser_id);
                usrProuducts = pc.getProudctsForUser(realuser_id);
            }else if(request.getParameter("visiteduser") != null) {
                visiteduser_id = Integer.parseInt(request.getParameter("visiteduser"));
                System.out.println("recieving userId ==> " + visiteduser_id);
                usrProuducts = pc.getProudctsForUser(visiteduser_id);
            }
        %>

        <div class="row prdcts-user-cn" >
            <div class="col-md-3 col-md-push-7">
                <button id="search-btn" style="position: relative;left: 15px;" class="btn-warning btn col-md-1 " ><span class="glyphicon glyphicon-search" style="margin: 0 auto;"></span></button>
                <input class="col-md-2 col-md-push-1 input-lg usrpr-search text-center">
            </div>

            <%if(realuser_id != 0){%>
                <a href="http://localhost:8080/SoftwareProject/pages/dynamic/profile/profile.jsp?do=add">
                    <button class="col-md-1 col-md-push-7 btn btn-success btn-add-pr">Add Product <span class="glyphicon glyphicon-plus" ></span></button>
                </a>
            <%}%>

        </div>

        <%
            int cols = 0;
            for (Product pr : usrProuducts) {
                cols++;
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
                                    <%if (realuser_id != 0) {%>
                                    <div class="productprice" >
                                        <div class="pull-right">
                                            <form method="post" action="http://localhost:8080/SoftwareProject/pages/dynamic/profile/profile.jsp">
                                                <input name="do" type="hidden" value="edit" />

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
                                    <% } else {%>

                                    <% }%>
                                </div>
                                <%if (visiteduser_id != 0) {%>
                                <p class='nameandcat' > <a id='product_name' href="/SoftwareProject/pages/dynamic/profile/profile.jsp?visited_user=<%=pr.getOwner().getUser_id()%>"><%=pr.getOwner().getUser_name()%></a> . 
                                    <% } else {%>
                                <p class='nameandcat' > <a id='product_name' href="/SoftwareProject/pages/dynamic/profile/profile.jsp"><%=pr.getOwner().getUser_name()%></a> . 
                                    <% }%>
                                    <a id='product_cat' href="/SoftwareProject/pages/dynamic/products/products.jsp?subcat=<%=pr.getProduct_category().getSub_cat_id()%>"><%=pr.getProduct_category().getCat_name()%></a></p>
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
            }
        %>
    </div>
</div>

